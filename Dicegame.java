// DiceGame.java
import java.util.Random;
<<<<<<< HEAD
=======
import java.util.Scanner;

>>>>>>> experimental
public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name?\n> ");
        String name = sc.nextLine().trim();
        System.out.println("Hello, " + name + "!");

        Random rnd = new Random();
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int total = die1 + die2;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);

        if (total > 7) {
            System.out.println(name + " won");
        } else {
            System.out.println(name + " lost");
        }
    }
}