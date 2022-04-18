package uz.gita.quizeapp.modelQuestions;

public class ModelQuestions {
    private final int id;
    private final int question;
    private final int answer;
    private final int variantA;
    private final int variantB;
    private final int variantC;
    private final int variantD;

    public ModelQuestions(int id, int question, int variantA, int variantB, int variantC, int variantD, int answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.variantA = variantA;
        this.variantB = variantB;
        this.variantC = variantC;
        this.variantD = variantD;
    }

    public int getId() {
        return id;
    }

    public int getQuestion() {
        return question;
    }

    public int getVariantA() {
        return variantA;
    }

    public int getVariantB() {
        return variantB;
    }

    public int getVariantC() {
        return variantC;
    }

    public int getVariantD() {
        return variantD;
    }

    public int getAnswer() {
        return answer;
    }
}
