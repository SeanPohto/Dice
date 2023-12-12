
public class Yahtzee
{
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    int[] dieSet;
    public Yahtzee() {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
        dieSet[] new Die6() = {die1, die2, die3, die4, die5};
        this.roll();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }

    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            die1.roll();
        } else if (dieNumber == 2) {
            die2.roll();
        } else if (dieNumber == 3) {
            die3.roll(); 
        } else if (dieNumber == 4) {
            die4.roll();
        } else if (dieNumber == 5) {
            die5.roll();
        }
    }

    public String summarize() {
        int[] sideArray = {1, 2, 3, 4, 5, 6};
        int[] dieCount = {0, 0, 0, 0, 0, 0};
        for (int x = 0; x < 5; x++){
            for (int y = 0; y < 5; y++) {
                if (dieSet[x] == sideArray[y]) {
                    dieCount[y] = dieCount[y]++;
                }
            }
        }
        String organize = "";
        for (int i = 1; i<6; i++) {
            organize = organize + i + "-" + dieCount[i-1] + ";";
        }
    }

    public String ToString() {
        return "Dice values: " + die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
    }
}
