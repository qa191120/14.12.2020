package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        /*
        1. input two int numbers from the user a, b
   print a > b, or a < b or a == b
   for example, if a = 3 and b = 4:
       print "3 < 4"
   for example, if a = 7 and b = 1:
       print "7 > 1"
   for example, if a = 9 and b = 9:
       print "9 == 9"
         */
        System.out.println("Please enter a");
        int a = s.nextInt();
        System.out.println("Please enter b");
        int b = s.nextInt();

        System.out.println(a);
        System.out.println(">");
        System.out.println(b);
        if (a == b) {
            System.out.print(a);
            System.out.println(" == ");
            System.out.println(b);
            System.out.println(String.format("%d == %d", a, b));
            //System.out.println(String.format("%d + %d = %d", a, b, a+b));
        }
        else if (a > b) {
            System.out.println(String.format("%d > %d", a, b));
        }
        else {
            // a < b
            System.out.println(String.format("%d < %d", a, b));
        }

        // write a loop which prints all the numbers from 5 to 10
        int index = 5;
        while (index <= 10) {
            System.out.println(index);
            //index = index + 1;
            //index += 1;
            index++;
        }

        // write a loop which inputs a number from the user until a number
        // bigger than 100 is given
        System.out.println("Please enter a mumber");
        int number = s.nextInt();
        while (number <= 100) {
            System.out.println("Please enter a mumber");
            number = s.nextInt();
        }

        // etgar: print all the even numbers from 4 to 100.
        //           should be like: 4, 6, 8, 10, ... 100
        int index4 = 4;
        while (index4 <= 100) {
            System.out.println(index4);
            index4 += 2;
        }

        // *etgar: input two numbers from the user until the two numbers are the same
        System.out.println("Enter two equal integer numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        while (num1 != num2) {
            System.out.println("Enter two equal integer numbers:");
            num1 = s.nextInt();
            num2 = s.nextInt();
        }

        System.out.println("Goodbye");
    }
}
