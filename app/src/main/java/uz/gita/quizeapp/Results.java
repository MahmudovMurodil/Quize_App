package uz.gita.quizeapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import uz.gita.quizeapp.SharedPref.MySharedPref;

public class Results extends Activity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        MySharedPref pref = MySharedPref.getInstance(Results.this);

        TextView math = findViewById(R.id.resultMath);
        TextView phy = findViewById(R.id.resultPhysics);
        TextView chem = findViewById(R.id.resultChemistry);
        TextView inter = findViewById(R.id.resultInteres);

        String mat = "HighScore\n" + pref.getRultMath();
        String ph = "HighScore\n" + pref.getRultPhy();
        String che = "HighScore\n" + pref.getRultChemis();
        String interest = "HighScore\n" + pref.getRultInteres();
        math.setText(mat);
        phy.setText(ph);
        chem.setText(che);
        inter.setText(interest);

        findViewById(R.id.back_from_levels).setOnClickListener(view -> {
            Intent intent = new Intent(Results.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        findViewById(R.id.clear).setOnClickListener(view -> {
            pref.clearResults();
            math.setText("HighScore\n" +"0");
            phy.setText("HighScore\n" +"0");
            chem.setText("HighScore\n" +"0");
            inter.setText("HighScore\n" +"0");
        });
    }
}
