package year;

public class YearTesting {
    public static void main(String[] args) {
        YearTest prezent=new YearTest();

        YearTest lunaviitoare= new YearTest(2,2024);

        YearTest xyz=new YearTest(27,9,1989);

        System.out.println("ziua: "+prezent.getZiua()+" luna : "+prezent.getLuna()+" anul :"+prezent.getAnul());
        System.out.println("ziua: "+lunaviitoare.getZiua()+" luna : "+lunaviitoare.getLuna()+" anul :"+lunaviitoare.getAnul());
        System.out.println("ziua: "+xyz.getZiua()+" luna : "+xyz.getLuna()+" anul :"+xyz.getAnul());

    }
}
