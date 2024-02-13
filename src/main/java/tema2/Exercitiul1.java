package tema2;
//1. Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar random
// intre 1 si 100 si stocati acel numar intr-o alta variabila. Daca numarul introdus de la tastatura
// este mai mic decat numarul random generat, afisati mesajul “Numarul introdus este mai mic decat
// <numar_random>” (inserati valoarea numarului random generat in textul afisat).
import java.util.Scanner;
import java.util.Random;

public class Exercitiul1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int numarIntrodus = scanner.nextInt();


        Random random = new Random();
        int numarRandom = random.nextInt(100) + 1;


        if (numarIntrodus < numarRandom) {
            System.out.println("Numărul introdus este mai mic decât " + numarRandom);
        }
    }
}
