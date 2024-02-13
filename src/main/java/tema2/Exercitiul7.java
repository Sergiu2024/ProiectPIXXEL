package tema2;
//7. Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
import java.util.ArrayList;
import java.util.List;

public class Exercitiul7 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(6);
        lista.add(9);
        lista.add(12);
        lista.add(15);
        lista.add(18);

        int suma = 0;
        for (Integer numar : lista) {
            suma += numar;
        }
        System.out.println("Suma tuturor elementelor din listă: " + suma);
    }
}
