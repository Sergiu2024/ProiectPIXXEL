package year;

public class YearTest {
    //Creează o clasă Date pentru a reprezenta data (ziua, luna, anul).
    // Adaugă metode pentru a seta și a obține fiecare parte a datei și pentru a afișa data formatată.
    private int ziua;
    private int luna;
    private int anul;

    public int getZiua() {
        return ziua;
    }

    public void setZiua(int ziua) {
        this.ziua = ziua;
    }

    public int getLuna() {
        return luna;
    }

    public void setLuna(int luna) {
        this.luna = luna;
    }

    public int getAnul() {
        return anul;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }

    public YearTest(){
        ziua=16;
        luna=1;
        anul=2024;
    }

    public YearTest(int luna, int anul){
        this.luna=luna;
        this.anul=anul;
    }

    public YearTest(int ziua, int luna, int anul){
        this.ziua=ziua;
        this.luna=luna;
        this.anul=anul;
    }
}
