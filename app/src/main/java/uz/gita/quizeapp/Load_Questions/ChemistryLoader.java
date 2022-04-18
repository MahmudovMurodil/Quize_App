package uz.gita.quizeapp.Load_Questions;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizeapp.modelQuestions.ModelQuestions;
import uz.gita.quizeapp.R;

public class ChemistryLoader {
    public static List<ModelQuestions> loadEasy() {
        List<ModelQuestions> questionsList = new ArrayList<>();

            questionsList.add(new ModelQuestions(0, R.string.questionch_1, R.string.variantch_1_a, R.string.variantch_1_b, R.string.variantch_1_c, R.string.variantch_1_d, R.string.answerch1));
            questionsList.add(new ModelQuestions(1, R.string.questionch_2, R.string.variantch_2_a, R.string.variantch_2_b, R.string.variantch_2_c, R.string.variantch_2_d, R.string.answerch2));
            questionsList.add(new ModelQuestions(2, R.string.questionch_3, R.string.variantch_3_a, R.string.variantch_3_b, R.string.variantch_3_c, R.string.variantch_3_d, R.string.answerch3));
            questionsList.add(new ModelQuestions(3, R.string.questionch_4, R.string.variantch_4_a, R.string.variantch_4_b, R.string.variantch_4_c, R.string.variantch_4_d, R.string.answerch4));
            questionsList.add(new ModelQuestions(4, R.string.questionch_5, R.string.variantch_5_a, R.string.variantch_5_b, R.string.variantch_5_c, R.string.variantch_5_d, R.string.answerch5));
            questionsList.add(new ModelQuestions(5, R.string.questionch_6, R.string.variantch_6_a, R.string.variantch_6_b, R.string.variantch_6_c, R.string.variantch_6_d, R.string.answerch6));
            questionsList.add(new ModelQuestions(6, R.string.questionch_7, R.string.variantch_7_a, R.string.variantch_7_b, R.string.variantch_7_c, R.string.variantch_7_d, R.string.answerch7));
            questionsList.add(new ModelQuestions(7, R.string.questionch_8, R.string.variantch_8_a, R.string.variantch_8_b, R.string.variantch_8_c, R.string.variantch_8_d, R.string.answerch8));
            questionsList.add(new ModelQuestions(8, R.string.questionch_9, R.string.variantch_9_a, R.string.variantch_9_b, R.string.variantch_9_c, R.string.variantch_9_d, R.string.answerch9));
            questionsList.add(new ModelQuestions(9, R.string.questionch_10, R.string.variantch_10_a, R.string.variantch_10_b, R.string.variantch_10_c, R.string.variantch_10_d, R.string.answerch10));

            questionsList.add(new ModelQuestions(10, R.string.questionch_11, R.string.variantch_11_a, R.string.variantch_11_b, R.string.variantch_11_c, R.string.variantch_11_d, R.string.answerch11));
            questionsList.add(new ModelQuestions(11, R.string.questionch_12, R.string.variantch_12_a, R.string.variantch_12_b, R.string.variantch_12_c, R.string.variantch_12_d, R.string.answerch12));
            questionsList.add(new ModelQuestions(12, R.string.questionch_13, R.string.variantch_13_a, R.string.variantch_13_b, R.string.variantch_13_c, R.string.variantch_13_d, R.string.answerch13));
            questionsList.add(new ModelQuestions(13, R.string.questionch_14, R.string.variantch_14_a, R.string.variantch_14_b, R.string.variantch_14_c, R.string.variantch_14_d, R.string.answerch14));
            questionsList.add(new ModelQuestions(14, R.string.questionch_15, R.string.variantch_15_a, R.string.variantch_15_b, R.string.variantch_15_c, R.string.variantch_15_d, R.string.answerch15));
            questionsList.add(new ModelQuestions(15, R.string.questionch_16, R.string.variantch_16_a, R.string.variantch_16_b, R.string.variantch_16_c, R.string.variantch_16_d, R.string.answerch16));
            questionsList.add(new ModelQuestions(16, R.string.questionch_17, R.string.variantch_17_a, R.string.variantch_17_b, R.string.variantch_17_c, R.string.variantch_17_d, R.string.answerch17));
            questionsList.add(new ModelQuestions(17, R.string.questionch_18, R.string.variantch_18_a, R.string.variantch_18_b, R.string.variantch_18_c, R.string.variantch_18_d, R.string.answerch18));
            questionsList.add(new ModelQuestions(18, R.string.questionch_19, R.string.variantch_19_a, R.string.variantch_19_b, R.string.variantch_19_c, R.string.variantch_19_d, R.string.answerch19));
            questionsList.add(new ModelQuestions(19, R.string.questionch_20, R.string.variantch_20_a, R.string.variantch_20_b, R.string.variantch_20_c, R.string.variantch_20_d, R.string.answerch20));

            questionsList.add(new ModelQuestions(20, R.string.questionch_21, R.string.variantch_21_a, R.string.variantch_21_b, R.string.variantch_21_c, R.string.variantch_21_d, R.string.answerch21));
            questionsList.add(new ModelQuestions(21, R.string.questionch_22, R.string.variantch_22_a, R.string.variantch_22_b, R.string.variantch_22_c, R.string.variantch_22_d, R.string.answerch22));
            questionsList.add(new ModelQuestions(22, R.string.questionch_23, R.string.variantch_23_a, R.string.variantch_23_b, R.string.variantch_23_c, R.string.variantch_23_d, R.string.answerch23));
            questionsList.add(new ModelQuestions(23, R.string.questionch_24, R.string.variantch_24_a, R.string.variantch_24_b, R.string.variantch_24_c, R.string.variantch_24_d, R.string.answerch24));
            questionsList.add(new ModelQuestions(24, R.string.questionch_25, R.string.variantch_25_a, R.string.variantch_25_b, R.string.variantch_25_c, R.string.variantch_25_d, R.string.answerch25));
            questionsList.add(new ModelQuestions(25, R.string.questionch_26, R.string.variantch_26_a, R.string.variantch_26_b, R.string.variantch_26_c, R.string.variantch_26_d, R.string.answerch26));
            questionsList.add(new ModelQuestions(26, R.string.questionch_27, R.string.variantch_27_a, R.string.variantch_27_b, R.string.variantch_27_c, R.string.variantch_27_d, R.string.answerch27));
            questionsList.add(new ModelQuestions(27, R.string.questionch_28, R.string.variantch_28_a, R.string.variantch_28_b, R.string.variantch_28_c, R.string.variantch_28_d, R.string.answerch28));
            questionsList.add(new ModelQuestions(28, R.string.questionch_29, R.string.variantch_29_a, R.string.variantch_29_b, R.string.variantch_29_c, R.string.variantch_29_d, R.string.answerch29));
            questionsList.add(new ModelQuestions(29, R.string.questionch_30, R.string.variantch_30_a, R.string.variantch_30_b, R.string.variantch_30_c, R.string.variantch_30_d, R.string.answerch30));

            return questionsList;
    }
}
