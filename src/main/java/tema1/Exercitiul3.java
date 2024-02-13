package tema1;
//Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
public class Exercitiul3 {
    public static void main(String[] args) {
        int varstaAna = 24;
        int diferentaVarste = 6;
        int varstaDavid = ( varstaAna - diferentaVarste );
        System.out.println("Ana are 24 de ani");
        System.out.println("Fratele ei, David, este cu 6 ani mai mic");
        System.out.println("David are " + varstaDavid + " ani");
    }
}
