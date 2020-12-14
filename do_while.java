package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // do - while
        // while ( condition )
        // { ... }


        int x1, x2, x3, x4, x5;
        do {
            System.out.println("Please enter number1: ");
            x1 = s.nextInt();
            System.out.println("Please enter number2: ");
            x2 = s.nextInt();
            System.out.println("Please enter number3: ");
            x3 = s.nextInt();
            System.out.println("Please enter number4: ");
            x4 = s.nextInt();
            System.out.println("Please enter number5: ");
            x5 = s.nextInt();
        }
        while ( x1+x2+x3+x4+x5 <= 100 );

        int num1, num2;
        do {
            System.out.println("Please enter two equal numbers");
            num1 = s.nextInt();
            num2 = s.nextInt();
        }
        while (num1 != num2);


        // 1. print numbers from 1 to 100 using do-while
        // 2. input 3 numbers from user: a,b,c until a+b==c using do-while
        // 3. input 3 numbers from user until all of them are different

        System.out.println("Goodbye");
    }
}
