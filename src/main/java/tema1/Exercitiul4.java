package tema1;
//Scrieti un program in care cititi o propozitie de la tastatura

import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {
        // Creăm un obiect Scanner pentru a citi de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Afisam un mesaj pentru a indica utilizatorului să introducă o propoziție
        System.out.println("Introduceți o propoziție:");

        // Citim propoziția introdusă de la tastatură
        String propozitie = scanner.nextLine();

        // Afisam propozitia citita
        System.out.println("Ați introdus: " + propozitie);

        // Inchidem obiectul Scanner
        scanner.close();
    }
}
