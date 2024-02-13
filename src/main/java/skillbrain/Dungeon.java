package skillbrain;

import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //variabile de jucator
        int sanatate = 100;
        int atacDeteriorare = 20;
        int potiuni = 3;
        int valoareRegenerarePotiune = 30;
        int sansePotiune = 50; //procente

        //variabile inamici
        String[] inamici = {"Zombie " + "Scheletum " + "Warrior " + "Assasin "};
        int maxSanatateInamic = 100;
        int inamicAtacDeteriorare = 25;

        boolean running = true;
        System.out.println("Bine ai venit in Temnita !");

        GAME:
        while (running) {
            System.out.println("....................................");
            int sanatateInamic = rand.nextInt(maxSanatateInamic);
            String inamic = inamici[rand.nextInt(inamici.length)];

            System.out.println("\t#" + inamic + " a aparut ! #");

            while (sanatateInamic > 0){
                System.out.println("\t Sanatatea ta este: " + sanatate);
                System.out.println("\t Sanatatea inamicului " + inamic + "este: " + sanatateInamic);
                System.out.println("\t\n Ce ai vrea sa faci ?");
                System.out.println("\t1 Ataca");
                System.out.println("\t2 Bea potiune");
                System.out.println("\t3 Fugi");

                String input = in.nextLine();

                if (input.equals("1")){
                    //cod pentru actiunea de a ataca
                    int deteriorareProdusa = rand.nextInt(atacDeteriorare);
                    int deteriorarePrimita = rand.nextInt(inamicAtacDeteriorare);

                    sanatateInamic -= deteriorareProdusa;
                    sanatate -= deteriorarePrimita;
                    System.out.println("\t L-ai lovit pe " + inamic + " cu " + deteriorareProdusa + " deteriorare. ");
                    System.out.println("\t Ai primit " + deteriorarePrimita + " deteriorare.");
                    if (sanatate < 1) {
                        System.out.println("\t Ai fost lovit prea tare, esti prea slabit sa continui.");
                        break;
                    }

                }else if (input.equals("2")){
                    //cod pentru optiunea de a bea potiune
                    if (potiuni > 0){
                        sanatate += valoareRegenerarePotiune;
                        System.out.println("\tAi baut o potiune, te-ai vindecat cu " + valoareRegenerarePotiune +
                                "\n\t Acum ai " + sanatate + " sanatate " +
                                "\n\t Ti-au ramas " + potiuni + " potiuni ");

                    } else {
                        System.out.println("\tNu mai ai potiuni! Invinge un inamic ca sa mai castigi potiuni. ");
                    }

                }else if (input.equals("3")){
                    //cod pentru optiunea de a fugi
                    System.out.println("\t Ai fugit de inamic " + inamic);
                    continue GAME;
                }else {
                    //cod pentru optiune invalida
                    System.out.println("\t Comanda invalida! ");
                }
            }
            if (sanatate < 1){
                System.out.println("Te-au batut crunt in Temnita, esti prea slab.");
                break ;
            }
            System.out.println(".................................");
            System.out.println(" # " + inamic + " a fost invins! # ");
            System.out.println(" # Ai" + sanatate + "sanatate. # ");
            if (rand.nextInt(100) < sansePotiune) {
                potiuni++;
                System.out.println(" # Ai castigat o potiune pe urma infrangerii lui " + inamic + "! # ");
                System.out.println(" # Mai ai " + potiuni + "potiuni. # ");
            }

            System.out.println("Ce ai vrea sa faci in continuare?");
            System.out.println("1. Continui lupta");
            System.out.println("2. Termina jocul");
            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Comanda invalida!");
                input = in.nextLine();
            }
            switch (input) {
                case "1":{
                    System.out.println("Continui cu aventura!");
                    break ;
                }
                case "2": {
                    System.out.println("\nAi ales sa iesi din Temnita. Drum bun!");
                    break GAME;
                }
            }
        }

    }
}
