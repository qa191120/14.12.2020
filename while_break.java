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
        // ***etgar: calculate the average for each grade (danger!)


        int students_counter = 1;
        int counter_100 = 0;
        int grade;
        do {
            System.out.println("Enter grade:");
            grade = s.nextInt();
            if (grade < 0 || grade > 100) {
                System.out.println("Grade not in range! exit...");
                break;
            }
            if (grade == 100) {
                counter_100++;
                if (counter_100 == 5) {
                    System.out.println("Super star class!");
                    break;
                }
            }

            students_counter++;
        }
        while (students_counter <= 10);
        
        // aaaa
        // while () {
        // cccc
        // ...
        // }
        
        // do  {
        // ccccc
        // }
        // while(..)
        
        // do {
        // ....
        // ... if {
        //    break }
        // }
        // while (true)
        
        // while (true) {
        // ....
        // }

        // while true
        int x = 0;
        while (true) {
            x++;
            System.out.println(x);
            if (x == 10) {
                break;
            }
        }
        
        // targil:
        // 1. print numbers from 200 to 0 jump 5 : 200, 195, 190 ... 0
        // 2. input number until user inputs 77
        // 3. input 3 numbers until a + b > c
        // 4. *etgar: change the student targil (above) to while(true) loop 
        
        System.out.println("Goodbye");
    }
}
