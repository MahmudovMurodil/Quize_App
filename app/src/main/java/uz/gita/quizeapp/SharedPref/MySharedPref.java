package uz.gita.quizeapp.SharedPref;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPref {
    private static SharedPreferences preferences;
    private static MySharedPref sharePref;

    private MySharedPref() {
    }

    public static MySharedPref getInstance(Context context) {
        if (sharePref == null) {
            sharePref = new MySharedPref();
            preferences = context.getSharedPreferences("Sample", Context.MODE_MULTI_PROCESS);
        }
        return sharePref;
    }

    public int getTrueAnswer() {
        return preferences.getInt("trueAnswers", 0);
    }

    public void setTrueAnswer(int count) {
        preferences.edit()
                .putInt("trueAnswers", count)
                .apply();
    }

    public void setCategory(String category) {
        preferences.edit()
                .putString("category", category)
                .apply();
    }

    public String getCategory() {
        return preferences.getString("category", "Interesting");
    }

    public void setResultMath(int count) {
        if (preferences.getInt("resultMath", 0) < count) {
            preferences.edit()
                    .putInt("resultMath", count)
                    .apply();
        }
    }

    public int getRultMath() {
        return preferences.getInt("resultMath", 0);
    }

    public void setResultPhy(int count) {
        if (preferences.getInt("resultPhy", 0) < count) {
            preferences.edit()
                    .putInt("resultPhy", count)
                    .apply();
        }
    }

    public int getRultPhy() {
        return preferences.getInt("resultPhy", 0);
    }

    public void setResultChemis(int count) {
        if (preferences.getInt("resultChemis", 0) < count) {
            preferences.edit()
                    .putInt("resultChemis", count)
                    .apply();
        }
    }

    public void clearResults() {
        preferences.edit()
                .putInt("resultChemis", 0)
                .apply();
        preferences.edit()
                .putInt("resultInteres", 0)
                .apply();
        preferences.edit()
                .putInt("resultPhy", 0)
                .apply();
        preferences.edit()
                .putInt("resultMath", 0)
                .apply();
    }

    public int getRultChemis() {
        return preferences.getInt("resultChemis", 0);
    }

    public void setResultInteres(int count) {
        if (preferences.getInt("resultInteres", 0) < count) {
            preferences.edit()
                    .putInt("resultInteres", count)
                    .apply();
        }
    }

    public int getRultInteres() {
        return preferences.getInt("resultInteres", 0);
    }

    public void setTime(Long count) {
        preferences.edit()
                .putLong("time", count)
                .apply();
    }

    public Long getTime() {
        return preferences.getLong("time", 31000);
    }
}
