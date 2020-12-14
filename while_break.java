package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // do - while
        // while ( condition )
        // { ... }

        // input number for bingo
        int counter = 1; // 77
        int guess;
        do {
            System.out.println(String.format("Please enter guess %d...", counter));
            guess = s.nextInt();
            if (guess == 77) {
                System.out.println("you guessed correct!!!");
                break;
            }
            if (guess <= 0) {
                System.out.println("You cheat!");
                break;
            }
            counter++;
        }
        while (counter <= 5);
        System.out.println(String.format("You had %d", counter));
        
        System.out.println("Goodbye");
    }
}
