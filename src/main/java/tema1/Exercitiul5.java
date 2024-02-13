package tema1;
//Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int,
//un String si un boolean, apoi apelati metoda din metoda “main”
public class Exercitiul5 {
    public static void myVariables() {
        int numarIntreg = 10;
        String text = "Salut, lume!";
        boolean esteAdevărat = true;

        System.out.println("Variabila de tip int: " + numarIntreg);
        System.out.println("Variabila de tip String: " + text);
        System.out.println("Variabila de tip boolean: " + esteAdevărat);
    }
    public static void Exercitiul5(String[] args) {
        myVariables();
    }
}
