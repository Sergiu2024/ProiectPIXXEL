package curs5;
//Write a Java program to iterate through all elements in an array list
import java.util.ArrayList;

public class Exercitiul2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Car 1");
        arrayList.add("Car 2");
        arrayList.add("Car 3");

        System.out.println("Iterating through all cars in the ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
