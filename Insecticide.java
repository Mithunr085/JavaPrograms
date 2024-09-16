package coding;
import java.util.*;

public class Insecticide {

    private class Insect {
        private String insectName;
        private int insectWeight;

        public Insect(String insectName, int insectWeight) {
            this.insectName = insectName;
            this.insectWeight = insectWeight;
        }

        public String getInsectName() {
            return insectName;
        }

        public void setInsectName(String insectName) {
            this.insectName = insectName;
        }

        public int getInsectWeight() {
            return insectWeight;
        }

        public void setInsectWeight(int insectWeight) {
            this.insectWeight = insectWeight;
        }

        @Override
        public String toString() {
            return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
        }
    }

    public List<String> mapInsectNames(List<Insect> insects) {
        List<String> insectNames = new ArrayList<>();
        for (Insect insect : insects) {
            insectNames.add(insect.getInsectName());
        }
        return insectNames;
    }

    public List<Insect> getWeight(List<Insect> insects) {
        List<Insect> weights = new ArrayList<>();
        for (Insect insect : insects) {
            if (insect.getInsectWeight() >40 && insect.getInsectWeight() <= 100) {
                weights.add(new Insect(insect.getInsectName(), insect.getInsectWeight()));
            }
        }
        return weights;
    }

    public static void main(String[] args) {
        Insecticide insecticide = new Insecticide();
        List<Insect> insectList = new ArrayList<>();
        insectList.add(insecticide.new Insect("Ant", 45));
        insectList.add(insecticide.new Insect("Cockroach", 65));
        insectList.add(insecticide.new Insect("Bee", 99));
        insectList.add(insecticide.new Insect("Paper Wasp", 11));

        // Get insect names
        List<String> names = insecticide.mapInsectNames(insectList);
        System.out.println( names);

        // Get insects with weight between 40 and 100
        List<Insect> filteredInsects = insecticide.getWeight(insectList);
        System.out.println(filteredInsects);
    }
}