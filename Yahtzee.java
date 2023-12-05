
public class Yahtzee
{
    Die6 dieA;
    Die6 dieB;
    Die6 dieC;
    Die6 dieD;
    Die6 dieE;
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
    public int getValue() {
        return dieA.getValue();
        return dieB.getValue();
        return dieC.getValue();
        return dieD.getValue();
        return dieE.getValue();
    }
    public void roll(int dieNumber){
        dieNumber = getValue();
    }
    public int summarize(int dieNumber) {
        return getValue(); 
    }
    public String ToString() {
        return "Dice values: " + getValue();
    }
}
