package curs5;
//Write a Java program to create an array list,
// add some colors (strings) and print out the collection.
import java.util.ArrayList;

public class Exercitiu1 {
    public static void main(String[] args) {

        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Yellow");
        colorsList.add("Purple");

        System.out.println("Colors in the ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}
