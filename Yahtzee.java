
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
    public void roll(int dieNumber) {
        d1 = dieA.roll();
        d2= dieB.roll();
        d3 = dieC.roll();
        d4 = dieD.roll();
        d5 = dieE.roll();
        number = dieNumber;
    }
    public String summarize() {
        if (number >= 1 || number <=6) {
            return "1" + "-" + number;
        }
    }
    public String ToString() {
        return "Dice values: " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5;
    }
}
