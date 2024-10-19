package online.slot;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    static Random gen = new Random();
    static Scanner input = new Scanner(System.in);
    private static final int N = 10;


    public static void main(String[] args){

        String play = "y";
        while(play.equals("y")) {

            int a = gen.nextInt(N);
            int b = gen.nextInt(N);
            int c = gen.nextInt(N);

            System.out.println("The Numbers Are: " + a + b + c);

            if (a == b || b == c || a == c) {
                if (a == b && b == c) {
                    System.out.println("JACKPOT!");
                }

                System.out.println("Two are equal!");


            } else {

                System.out.println("Try again.");

            }

            System.out.println("Do you want to continue? y/n");

            play = input.nextLine();

        }

















    }









}
