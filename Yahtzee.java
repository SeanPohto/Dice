
public class Yahtzee
{
    Die6 dieA;
    Die6 dieB;
    Die6 dieC;
    Die6 dieD;
    Die6 dieE;
    int number;
    public Yahtzee() {
        dieA = new Die6();
        dieB = new Die6();
        dieC = new Die6();
        dieD = new Die6();
        dieE = new Die6();
    }

    public void roll() {
        dieA.roll();
        dieB.roll();
        dieC.roll();
        dieD.roll();
        dieE.roll();
    }

    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            dieA.roll();
        } else if (dieNumber == 2) {
            dieB.roll();
        } else if (dieNumber == 3) {
            dieC.roll(); 
        } else if (dieNumber == 4) {
            dieD.roll();
        } else if (dieNumber == 5) {
            dieE.roll();
        }
    }

    public int getValue1() {
        return dieA.getValue();
    }
    public int getValue2() {
        return dieB.getValue();
    }
    public int getValue3() {
        return dieC.getValue();
    }
    public int getValue4() {
        return dieD.getValue();
    }
    public int getValue5() {
        return dieE.getValue();
    }

    public int rollAndGetValue() {
        roll();
        return getValue1();
    }

    public String summarize() {
        if (number >= 1 || number <=6) {
            return "1" + "-" + number + ";" + "2" + "-" + number + ";" + "3" + "-" + number + ";" + "4" + "-" + number + ";" + "1" + "-" + number;
        } else {
            return "bruh";
        }
    }

    public String ToString() {
        return "Dice values: " + dieA.getValue() + " " + dieB.getValue() + " " + dieC.getValue() + " " + dieD.getValue() + " " + dieE.getValue();
    }
}
