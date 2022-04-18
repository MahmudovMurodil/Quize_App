package uz.gita.quizeapp;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizeapp.SharedPref.MySharedPref;
import uz.gita.quizeapp.appController.AppController;
import uz.gita.quizeapp.modelQuestions.ModelQuestions;

public class Questions extends AppCompatActivity {
    private final int size = 10;
    private AppCompatButton variantA;
    private AppCompatButton variantB;
    private AppCompatButton variantC;
    private AppCompatButton variantD;
    private TextView question;
    private TextView questionPos;
    private int position = 0;
    private int trueAnswer;

    private TextView point;
    private String answer;

    private final AppController controller = AppController.getInstance();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        final TextView level_of = findViewById(R.id.level_of);
        point = findViewById(R.id.point);
        questionPos = findViewById(R.id.questionPosition);
        controller.shuffle();
        Log.d("TTT", "oncreate");

        TextView skip = findViewById(R.id.skip);
        question = findViewById(R.id.question);
        variantA = findViewById(R.id.variantA);
        variantB = findViewById(R.id.variantB);
        variantC = findViewById(R.id.variantC);
        variantD = findViewById(R.id.variantD);
        variantA.setBackgroundResource(R.drawable.bg_btn);
        variantB.setBackgroundResource(R.drawable.bg_btn);
        variantC.setBackgroundResource(R.drawable.bg_btn);
        variantD.setBackgroundResource(R.drawable.bg_btn);

        findViewById(R.id.homeBtn).setOnClickListener(view -> {
            AlertDialog dialog = new AlertDialog.Builder(Questions.this)
                    .setMessage("Are you shure you exit?")
                    .setCancelable(true)
                    .setPositiveButton("Yes", (dialogInterface, i) -> {
                        Intent intent = new Intent(Questions.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    })
                    .setNegativeButton("No", (dialogInterface, i) -> {
                    }).create();
            dialog.show();
        });

        String level = getIntent().getStringExtra("choosedCategory");
        level_of.setText(level);
        point.setText("0\nPoint");
        questionPos.setText("1/10\nQuestion");

        skip.setOnClickListener(view -> {
            nextQusetion();
        });
        loadQustionTags();
        selectedAnswer();
    }


    private void loadQustionTags() {
        if (position == size) {
            finishTest();
            return;
        }
        MySharedPref pref = MySharedPref.getInstance(this);
        List<ModelQuestions> modelQuestions;
        String category = pref.getCategory();
        switch (category) {
            case "Quiz from Math": {
                modelQuestions = controller.getMathList();
                break;
            }
            case "Quiz from Physics": {
                modelQuestions = controller.getPhysicsList();
                break;
            }
            case "Quiz from Chemistry": {
                modelQuestions = controller.getChemistryList();
                break;
            }
            default:
                modelQuestions = controller.getInterestingList();
        }
        List<String> variant = new ArrayList<>();
        variant.add(getString(modelQuestions.get(position).getVariantA()));
        variant.add(getString(modelQuestions.get(position).getVariantB()));
        variant.add(getString(modelQuestions.get(position).getVariantC()));
        variant.add(getString(modelQuestions.get(position).getVariantD()));
        Collections.shuffle(variant);
        question.setText(modelQuestions.get(position).getQuestion());
        variantA.setText(variant.get(0));
        variantB.setText(variant.get(1));
        variantC.setText(variant.get(2));
        variantD.setText(variant.get(3));
        answer = this.getResources().getString(modelQuestions.get(position).getAnswer());
        position++;
    }

    private void nextQusetion() {
        variantA.setEnabled(true);
        variantB.setEnabled(true);
        variantC.setEnabled(true);
        variantD.setEnabled(true);
        loadQustionTags();
        String count = trueAnswer + "\nPoint";
        point.setText(count);
        String s = position + "/10\nQuestion";
        questionPos.setText(s);
    }

    private void finishTest() {
        MySharedPref pref = MySharedPref.getInstance(Questions.this);
        String categ = pref.getCategory();
        switch (categ) {
            case "Quiz from Math": {
                pref.setResultMath(trueAnswer);
                break;
            }
            case "Quiz from Physics": {
                pref.setResultPhy(trueAnswer);
                break;
            }
            case "Quiz from Chemistry": {
                pref.setResultChemis(trueAnswer);
                break;
            }
            default:
                pref.setResultInteres(trueAnswer);
        }
/*
        downTimer.cancel();
*/
        String ss = "10/10\nQuestion";
        questionPos.setText(ss);
        controller.setTruenswerCount(trueAnswer);
        Dialog dialog = new Dialog(this);
        dialog.setCancelable(false);
        View inflate = getLayoutInflater().inflate(R.layout.finish_dialog2, null);
        dialog.setContentView(inflate);
        AppCompatTextView trueCount = inflate.findViewById(R.id.trueCount);
        String s = "Siz 10 ta savoldan\n" + trueAnswer + " tasiga to'g'ri javob berdingiz";
        trueCount.setText(s);
        dialog.findViewById(R.id.to_home).setOnClickListener(view -> {
            Intent intent = new Intent(Questions.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        dialog.findViewById(R.id.exit).setOnClickListener(view -> {
            Intent intent = new Intent(Questions.this, Results.class);
            startActivity(intent);
            finish();
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    private void selectedAnswer() {

        variantA.setOnClickListener(view -> {
            if (answer.equals(variantA.getText().toString())) {
                trueAnswer++;
                variantA.setBackgroundResource(R.drawable.true_answer);
                variantD.setEnabled(false);
                variantB.setEnabled(false);
                variantC.setEnabled(false);
                CountDownTimer countDownTimer = new CountDownTimer(600, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        variantA.setBackgroundResource(R.drawable.bg_btn);
                        nextQusetion();
                    }
                };
                countDownTimer.start();
            } else {
                variantA.setBackgroundResource(R.drawable.false_answer);
                variantD.setEnabled(false);
                variantB.setEnabled(false);
                variantC.setEnabled(false);
                CountDownTimer countDownTimer = new CountDownTimer(600, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        variantA.setBackgroundResource(R.drawable.bg_btn);
                        nextQusetion();
                    }
                };
                countDownTimer.start();
            }
        });
        variantB.setOnClickListener(view -> {
            if (answer.equals(variantB.getText().toString())) {
                trueAnswer++;
                variantB.setBackgroundResource(R.drawable.true_answer);
                variantA.setEnabled(false);
                variantD.setEnabled(false);
                variantC.setEnabled(false);
                CountDownTimer countDownTimer = new CountDownTimer(600, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        variantB.setBackgroundResource(R.drawable.bg_btn);

                        nextQusetion();
                    }
                };
                countDownTimer.start();
            } else {
                variantB.setBackgroundResource(R.drawable.false_answer);
                variantA.setEnabled(false);
                variantD.setEnabled(false);
                variantC.setEnabled(false);
                CountDownTimer countDownTimer = new CountDownTimer(600, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        variantB.setBackgroundResource(R.drawable.bg_btn);
                        nextQusetion();
                    }
                };
                countDownTimer.start();
            }
        });
        variantC.setOnClickListener(view -> {
            if (answer.equals(variantC.getText().toString())) {
                trueAnswer++;
                variantC.setBackgroundResource(R.drawable.true_answer);
                variantA.setEnabled(false);
                variantD.setEnabled(false);
                variantB.setEnabled(false);
                CountDownTimer countDownTimer = new CountDownTimer(600, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        variantC.setBackgroundResource(R.drawable.bg_btn);
                        nextQusetion();
                    }
                };
                countDownTimer.start();
            } else {
                variantC.setBackgroundResource(R.drawable.false_answer);
                variantA.setEnabled(false);
                variantB.setEnabled(false);
                variantD.setEnabled(false);
                CountDownTimer countDownTimer = new CountDownTimer(600, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        variantC.setBackgroundResource(R.drawable.bg_btn);
                        variantA.setEnabled(false);
                        variantB.setEnabled(false);
                        variantD.setEnabled(false);
                        nextQusetion();
                    }
                };
                countDownTimer.start();
            }
        });
        variantD.setOnClickListener(view -> {
            if (answer.equals(variantD.getText().toString())) {
                trueAnswer++;
                variantD.setBackgroundResource(R.drawable.true_answer);
                variantA.setEnabled(false);
                variantB.setEnabled(false);
                variantC.setEnabled(false);
                CountDownTimer countDownTimer = new CountDownTimer(600, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        variantD.setBackgroundResource(R.drawable.bg_btn);

                        nextQusetion();
                    }
                };
                countDownTimer.start();
            } else {
                variantD.setBackgroundResource(R.drawable.false_answer);
                variantA.setEnabled(false);
                variantB.setEnabled(false);
                variantC.setEnabled(false);
                CountDownTimer countDownTimer = new CountDownTimer(600, 1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        variantD.setBackgroundResource(R.drawable.bg_btn);
                        variantA.setEnabled(false);
                        variantB.setEnabled(false);
                        variantC.setEnabled(false);
                        nextQusetion();
                    }
                };
                countDownTimer.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog dialog = new AlertDialog.Builder(Questions.this)
                .setMessage("Are you shure you exit?")
                .setCancelable(true)
                .setPositiveButton("Yes", (dialogInterface, i) -> {
                    Intent intent = new Intent(Questions.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                })
                .setNegativeButton("No", (dialogInterface, i) -> {

                }).create();
        dialog.show();
    }
}
