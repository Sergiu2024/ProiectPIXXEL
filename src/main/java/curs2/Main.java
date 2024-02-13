package curs2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sa calculam pe niste numere !");
        System.out.println("Introduceti primul numar fractionar:");

        Scanner scanner = new Scanner (System.in);
        double numar1 = scanner.nextDouble();

        System.out.println("Introduceti al doilea numar fractionar:");
        double numar2 = scanner.nextDouble();

        System.out.println(inmultire(numar1, numar2));
        System.out.println(adaugare(numar1, numar2));
        System.out.println(scadere(numar1, numar2));
        System.out.println(impartire(numar1, numar2));
        System.out.println(modul((int) numar1, (int) numar2));
    }
    public static double inmultire(double nr1, double nr2){
        double rezultat = nr1 * nr2 ;
        return rezultat ;
    }
    public static Double adaugare(double numar1, double nr2) {
        double rezultat = numar1 * nr2;
        return rezultat;
    }
    public static double scadere(Double numar1, Double numar2){
        Double rezultat = numar1 - numar2;
        return rezultat;
    }
    public static Double impartire(Double numar1, double numar2){
        return  numar1 / numar2;
    }
    public static int modul(int nr1, Integer nr2){
        return nr1 % nr2;
    }
}
