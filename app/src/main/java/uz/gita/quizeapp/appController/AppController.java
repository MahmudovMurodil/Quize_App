package uz.gita.quizeapp.appController;


import java.util.Collections;
import java.util.List;

import uz.gita.quizeapp.Load_Questions.ChemistryLoader;
import uz.gita.quizeapp.Load_Questions.IntesetingLoader;
import uz.gita.quizeapp.Load_Questions.MathLoader;
import uz.gita.quizeapp.Load_Questions.PhysicsLoader;
import uz.gita.quizeapp.modelQuestions.ModelQuestions;

public class AppController {

    private static AppController appController;
    private final List<ModelQuestions> MathList;
    private final List<ModelQuestions> PhysicsList;
    private final List<ModelQuestions> ChemistryList;
    private final List<ModelQuestions> InterestingList;
    private int trueCount;

    private AppController() {
        MathList = MathLoader.loadEasy();
        PhysicsList = PhysicsLoader.loadEasy();
        ChemistryList = ChemistryLoader.loadEasy();
        InterestingList = IntesetingLoader.loadEasy();
    }

    public static AppController getInstance() {
        if (appController == null)
            return new AppController();
        return appController;
    }

    public void shuffle() {
        Collections.shuffle(MathList);
        Collections.shuffle(PhysicsList);
        Collections.shuffle(InterestingList);
        Collections.shuffle(ChemistryList);
    }

/*    public ModelQuestions getMathCurrentQuestion(int position) {
        return MathList.get(position);
    }

    public ModelQuestions getPhysicsCurrentQuestion(int position) {
        return PhysicsList.get(position);
    }

    public ModelQuestions getChemistryCurrentQuestion(int position) {
        return ChemistryList.get(position);
    }

    public ModelQuestions getInterstingCurrentQuestion(int position) {
        return InterestingList.get(position);
    }*/

    public List<ModelQuestions> getMathList() {
        return MathList;
    }

    public List<ModelQuestions> getPhysicsList() {
        return PhysicsList;
    }

    public List<ModelQuestions> getChemistryList() {
        return ChemistryList;
    }

    public List<ModelQuestions> getInterestingList() {
        return InterestingList;
    }

    public void setTruenswerCount(int c) {
        trueCount = c;
    }

    public int getTrueCount() {
        return trueCount;
    }
}
