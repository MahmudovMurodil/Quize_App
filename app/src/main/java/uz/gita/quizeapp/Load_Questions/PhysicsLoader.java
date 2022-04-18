package uz.gita.quizeapp.Load_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizeapp.R;
import uz.gita.quizeapp.modelQuestions.ModelQuestions;

public class PhysicsLoader {
    public static List<ModelQuestions> loadEasy() {
        List<ModelQuestions> questionsList = new ArrayList<>();

      /*  String[] questions = resources.getStringArray(R.array.physics_easy);
        String[] answers = resources.getStringArray(R.array.physics_answer);
        String[] varianA = resources.getStringArray(R.array.physics_variantA);
        String[] varianB = resources.getStringArray(R.array.physics_variantB);
        String[] varianC = resources.getStringArray(R.array.physics_variantC);
        String[] varianD = resources.getStringArray(R.array.physics_variantD);

        for (int i = 0; i < questions.length; i++) {
            ModelQuestions model = new ModelQuestions(i, questions[i], answers[i], varianA[i], varianB[i], varianC[i], varianD[i]);
            questionsList.add(model);
        }*/

        questionsList.add(new ModelQuestions(0, R.string.questionf_1, R.string.variantf_1_a, R.string.variantf_1_b, R.string.variantf_1_c, R.string.variantf_1_d, R.string.answerf1));
        questionsList.add(new ModelQuestions(1, R.string.questionf_2, R.string.variantf_2_a, R.string.variantf_2_b, R.string.variantf_2_c, R.string.variantf_2_d, R.string.answerf2));
        questionsList.add(new ModelQuestions(2, R.string.questionf_3, R.string.variantf_3_a, R.string.variantf_3_b, R.string.variantf_3_c, R.string.variantf_3_d, R.string.answerf3));
        questionsList.add(new ModelQuestions(3, R.string.questionf_4, R.string.variantf_4_a, R.string.variantf_4_b, R.string.variantf_4_c, R.string.variantf_4_d, R.string.answerf4));
        questionsList.add(new ModelQuestions(4, R.string.questionf_5, R.string.variantf_5_a, R.string.variantf_5_b, R.string.variantf_5_c, R.string.variantf_5_d, R.string.answerf5));
        questionsList.add(new ModelQuestions(5, R.string.questionf_6, R.string.variantf_6_a, R.string.variantf_6_b, R.string.variantf_6_c, R.string.variantf_6_d, R.string.answerf6));
        questionsList.add(new ModelQuestions(6, R.string.questionf_7, R.string.variantf_7_a, R.string.variantf_7_b, R.string.variantf_7_c, R.string.variantf_7_d, R.string.answerf7));
        questionsList.add(new ModelQuestions(7, R.string.questionf_8, R.string.variantf_8_a, R.string.variantf_8_b, R.string.variantf_8_c, R.string.variantf_8_d, R.string.answerf8));
        questionsList.add(new ModelQuestions(8, R.string.questionf_9, R.string.variantf_9_a, R.string.variantf_9_b, R.string.variantf_9_c, R.string.variantf_9_d, R.string.answerf9));
        questionsList.add(new ModelQuestions(9, R.string.questionf_10, R.string.variantf_10_a, R.string.variantf_10_b, R.string.variantf_10_c, R.string.variantf_10_d, R.string.answerf10));

        questionsList.add(new ModelQuestions(10, R.string.questionf_11, R.string.variantf_11_a, R.string.variantf_11_b, R.string.variantf_11_c, R.string.variantf_11_d, R.string.answerf11));
        questionsList.add(new ModelQuestions(11, R.string.questionf_12, R.string.variantf_12_a, R.string.variantf_12_b, R.string.variantf_12_c, R.string.variantf_12_d, R.string.answerf12));
        questionsList.add(new ModelQuestions(12, R.string.questionf_12, R.string.variantf_12_a, R.string.variantf_12_b, R.string.variantf_12_c, R.string.variantf_12_d, R.string.answerf12));
        questionsList.add(new ModelQuestions(13, R.string.questionf_12, R.string.variantf_12_a, R.string.variantf_12_b, R.string.variantf_12_c, R.string.variantf_12_d, R.string.answerf12));
        questionsList.add(new ModelQuestions(14, R.string.questionf_13, R.string.variantf_13_a, R.string.variantf_13_b, R.string.variantf_13_c, R.string.variantf_13_d, R.string.answerf13));
        questionsList.add(new ModelQuestions(15, R.string.questionf_14, R.string.variantf_14_a, R.string.variantf_14_b, R.string.variantf_14_c, R.string.variantf_14_d, R.string.answerf14));
        questionsList.add(new ModelQuestions(16, R.string.questionf_15, R.string.variantf_15_a, R.string.variantf_15_b, R.string.variantf_15_c, R.string.variantf_15_d, R.string.answerf15));
        questionsList.add(new ModelQuestions(17, R.string.questionf_16, R.string.variantf_16_a, R.string.variantf_16_b, R.string.variantf_16_c, R.string.variantf_16_d, R.string.answerf16));
        questionsList.add(new ModelQuestions(18, R.string.questionf_17, R.string.variantf_17_a, R.string.variantf_17_b, R.string.variantf_17_c, R.string.variantf_17_d, R.string.answerf17));
        questionsList.add(new ModelQuestions(19, R.string.questionf_18, R.string.variantf_18_a, R.string.variantf_18_b, R.string.variantf_18_c, R.string.variantf_18_d, R.string.answerf18));

        questionsList.add(new ModelQuestions(20, R.string.questionf_19, R.string.variantf_19_a, R.string.variantf_19_b, R.string.variantf_19_c, R.string.variantf_19_d, R.string.answerf19));
        questionsList.add(new ModelQuestions(21, R.string.questionf_20, R.string.variantf_20_a, R.string.variantf_20_b, R.string.variantf_20_c, R.string.variantf_20_d, R.string.answerf20));
        questionsList.add(new ModelQuestions(22, R.string.questionf_21, R.string.variantf_21_a, R.string.variantf_21_b, R.string.variantf_21_c, R.string.variantf_21_d, R.string.answerf21));
        questionsList.add(new ModelQuestions(23, R.string.questionf_22, R.string.variantf_22_a, R.string.variantf_22_b, R.string.variantf_22_c, R.string.variantf_22_d, R.string.answerf22));
        questionsList.add(new ModelQuestions(24, R.string.questionf_23, R.string.variantf_23_a, R.string.variantf_23_b, R.string.variantf_23_c, R.string.variantf_23_d, R.string.answerf23));
        questionsList.add(new ModelQuestions(25, R.string.questionf_24, R.string.variantf_24_a, R.string.variantf_24_b, R.string.variantf_24_c, R.string.variantf_24_d, R.string.answerf24));
        questionsList.add(new ModelQuestions(26, R.string.questionf_25, R.string.variantf_25_a, R.string.variantf_25_b, R.string.variantf_25_c, R.string.variantf_25_d, R.string.answerf25));
        questionsList.add(new ModelQuestions(27, R.string.questionf_26, R.string.variantf_26_a, R.string.variantf_26_b, R.string.variantf_26_c, R.string.variantf_26_d, R.string.answerf26));
        questionsList.add(new ModelQuestions(28, R.string.questionf_27, R.string.variantf_27_a, R.string.variantf_27_b, R.string.variantf_27_c, R.string.variantf_27_d, R.string.answerf27));
        questionsList.add(new ModelQuestions(29, R.string.questionf_29, R.string.variantf_29_a, R.string.variantf_29_b, R.string.variantf_29_c, R.string.variantf_29_d, R.string.answerf29));


        return questionsList;
    }
}
