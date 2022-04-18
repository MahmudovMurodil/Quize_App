
package uz.gita.quizeapp;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import uz.gita.quizeapp.SharedPref.MySharedPref;

public class MainActivity extends AppCompatActivity {
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySharedPref pref = MySharedPref.getInstance(this);
        final TextView quize_math = findViewById(R.id.math);
        final TextView quize_physics = findViewById(R.id.physics);
        final TextView quize_chemistry = findViewById(R.id.chemistry);
        final TextView quize_interesting = findViewById(R.id.interesting);


        quize_math.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Questions.class);
            intent.putExtra("choosedCategory", "Math");
            pref.setCategory("Quiz from Math");
            startActivity(intent);
            finish();
        });
        quize_physics.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Questions.class);
            intent.putExtra("choosedCategory", "Physics");
            pref.setCategory("Quiz from Physics");
            startActivity(intent);
            finish();
        });
        quize_chemistry.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Questions.class);
            intent.putExtra("choosedCategory", "Chemistry");
            pref.setCategory("Quiz from Chemistry");
            startActivity(intent);
            finish();
        });
        quize_interesting.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Questions.class);
            intent.putExtra("choosedCategory", "Interesting");
            pref.setCategory("Quiz from Interesting");
            startActivity(intent);
            finish();
        });

        findViewById(R.id.about_app).setOnClickListener(view -> {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(getLayoutInflater().inflate(R.layout.info_dialog, null));
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
        });
    }
}