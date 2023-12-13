public class Yahtzee {
    private Die6[] dice;

    public Yahtzee() {
        dice = new Die6[]{new Die6(), new Die6(), new Die6(), new Die6(), new Die6()};
        roll();
    }

    public void roll() {
        for (Die6 die : dice) {
            die.roll();
        }
    }

    public void roll(int dieNumber) {
        if (dieNumber >= 1 && dieNumber <= 5) {
            dice[dieNumber - 1].roll();
        } 
    }

    public String summarize() {
        int[] dieCount = new int[6];

        for (Die6 die : dice) {
            int value = die.getValue();
            dieCount[value - 1]++;
        }

        String organize = "";
        for (int i = 0; i < 6; i++) {
            organize += (i + 1) + "-" + dieCount[i];
            if (i < 5) {
                organize += "; ";
            }
        }
        return organize;
    }

    public String toString() {
        String values = "Dice values: ";
        for (Die6 die : dice) {
            values += die.getValue() + " ";
        }
        return values;
    }
}

