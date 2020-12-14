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
        int index = 1;
         do {
            System.out.println(index);
            index++;
        }
        while (index <= 100);
        
        // 2. input 3 numbers from user: a,b,c until a+b==c using do-while
        int a,b,c;
        System.out.println("Please enter 3 numbers:");
        do {
            a = s.nextInt();// 1
            b = s.nextInt();// 2
            c = s.nextInt();// 3
        }
        while (a + b == c);
        
        // 3. input 3 numbers from user until all of them are different
        int x,y,z;
        System.out.println("Please enter 3 numbers:");
        do {
            x = s.nextInt();// 1
            y = s.nextInt();// 2
            z = s.nextInt();// 3
        }
        while (x == y || x == z || y == z);
        
        
        System.out.println("Goodbye");
    }
}
