package tema1;
//Scrieti un program incare cititi de la tastatura un numar, si calculati:
//rezultatul sumei cu 5 , rezultatul scaderii cu 12.3 ,rezultatul inmultirii cu -3.2 ,
//rezultatul impartirii cu 4 , rezultatul modulului cu 6 ;
import java.util.Scanner;

public class Exercitiul7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți un număr:");

        double numar = scanner.nextDouble();

        double sumaCu5 = numar + 5;
        System.out.println("Suma cu 5: " + sumaCu5);

        double scadereCu12_3 = numar - 12.3;
        System.out.println("Scăderea cu 12.3: " + scadereCu12_3);

        double inmultireCuMinus3_2 = numar * -3.2;
        System.out.println("Înmulțirea cu -3.2: " + inmultireCuMinus3_2);

        double impartireCu4 = numar / 4;
        System.out.println("Împărțirea cu 4: " + impartireCu4);

        double modulCu6 = numar % 6;
        System.out.println("Modulul cu 6: " + modulCu6);

        scanner.close();
    }
}
