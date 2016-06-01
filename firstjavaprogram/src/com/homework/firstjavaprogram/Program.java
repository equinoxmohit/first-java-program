/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homework.firstjavaprogram;

import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Name");
//        String name = input.next();
//        System.out.println("Enter Your Symbol Number");
//        String symbol = input.next();
//        String grade = "";
//        System.out.println("The marks of English is: ");
//        double eng = input.nextDouble();
//        System.out.println("The marks of Nepali is: ");
//        double nep = input.nextDouble();
//        System.out.println("The marks of Science is: ");
//        double sci = input.nextDouble();
//        System.out.println("The marks of Math is: ");
//        double math = input.nextDouble();
//        System.out.println("The marks of Comp is: ");
//        double comp = input.nextDouble();
//        double percentage = 0, total = eng + nep + sci + math + comp;
//        System.out.println("Hello " + name);
//        System.out.println("Your symbol number is:" + symbol);
//
//        if ((eng < 0 || eng > 100) || (nep < 0 || nep > 100) || (sci < 0 || sci > 100) || (math < 0 || math > 100) || (comp < 0 || comp > 100)) {
//            System.out.println("please enter a valid marks");
//        } else if (eng < 32 || nep < 32 || sci < 32 || math < 32 || comp < 32) {
//            System.out.println("Sorry. You have Failed");
//        } else {
//            percentage = (total / 500) * 100;
//            if (percentage >= 32 && percentage <= 50) {
//                grade = "Third Division";
//            } else if (percentage >= 51 && percentage <= 59) {
//                grade = "Second Division";
//            } else if (percentage >= 60 && percentage <= 79) {
//                grade = "First Division";
//            } else if (percentage >= 80) {
//                grade = "Distinction";
//            }
//
//            System.out.println("Your percentage is: " + percentage + " and your grade is: " + grade);
//        }
//-----------------------------------------------------------------------------------------------------------------
//        Scanner input = new Scanner(System.in);
//        while (true) {
//        System.out.println("Enter a number you want to multiply");
//        int number = input.nextInt();
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(number + "*" + i + "=" + (number * i));
//          }
//            System.out.println("Do you wish to continue[Y/N]");
//                String cont=input.next();
//            if(cont.equalsIgnoreCase("n"))
//            {
//              System.exit(0);
//            }
//        }
//        --------------------------------------------------------------------------------------------------------------------------------
//            int i=1,total=1;
//            while(i<10)
//            {
//                if(i%2==0)
//                {
//                   total=total*i;
//                  
//                }
//             i++;   
//            }
//            
//            System.out.println("The multiplication sum is " + total);
//      ------------------------------------------------HOMEWORK------------------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter First Number:");
            float a = input.nextFloat();
            System.out.println("Enter Second Number:");
            float b = input.nextFloat();
            float add, sub, div, mult, modulus;

            System.out.println("What do you want to do?");
            System.out.println("Your choices are: '1' for Add, '2' for Subtract, '3' for Divide, '4' for Multiply, '5' for Modulus, '6' to Exit");
            String choices = input.next();
            if (choices.equalsIgnoreCase("1")) {
                add = a + b;
                System.out.println(add);
            }
            if (choices.equalsIgnoreCase("2")) {
                sub = a - b;
                System.out.println(sub);
            }
            if (choices.equalsIgnoreCase("3")) {
                div = a / b;
                System.out.println(div);
            }
            if (choices.equalsIgnoreCase("4")) {
                mult = a * b;
                System.out.println(mult);
            }
            if (choices.equalsIgnoreCase("5")) {
                modulus = a % b;
                System.out.println(modulus);
            }
            if (choices.equalsIgnoreCase("6")) {
                System.exit(0);
            }
        }

    }
}

