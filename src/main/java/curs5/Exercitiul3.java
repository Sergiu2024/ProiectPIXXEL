package curs5;
//Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;

public class Exercitiul3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Student 1");
        arrayList.add("Student 2");
        arrayList.add("Student 3");

        System.out.println("Original ArrayList: " + arrayList);

        arrayList.add(0, "New Student");

        System.out.println("ArrayList after inserting an student at the first position: " + arrayList);
    }
}
