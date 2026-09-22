package Classroom;
import Classmate.Arc;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r1 = new Random();
        int randomInt = r1.nextInt(100);
        Arc myArc = new Arc("Arcadio", 23);

        System.out.println("Your random Grade is: " + randomInt);
        System.out.println("Name: " + myArc.name);
        System.out.println("Age: " + myArc.age);

    }
}