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
        
        //-- targil:
        // class has 10 students
        // write program which inputs 10 grades
        // if negative grade was inserted, or grade > 100 inserted 
        //           then break
        // *etgar: if 5 students got 100 then break because 
        //          this is super class
        // **etgar: calculate the average
        

        System.out.println("Goodbye");
    }
}
