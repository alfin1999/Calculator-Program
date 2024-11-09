package com.alfin;
// Calculator program is created in package called alfin. A package is like a folder that contain many classes and these feature provide security.
import java.util.Scanner;
// we created a class called Calculator, which is a public class.
public class Calculator {
    // program start here , compiler look for main key word to start.
    public static void main(String[] args) {
        // intialize the scanner class where input is the object of scanner class
        Scanner input = new Scanner(System.in);
        //intialize variable 'result' to store value
         int result = 0;
         // since we donot know how many loops are there so we take while loop.
         while (true){
             System.out.println("Enter the operator");
             char ch = input.next().trim().charAt(0);
             System.out.println();
             // we check if 'x' or 'X' occur program stop.
             if (ch == 'x' || ch == 'X') {
                 break;  // Exit the program if user types 'x' or 'X'
             }
             // based on the operation we give following condition
             if( ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                 System.out.println("Enter the number");
                 //Enter the two numbers num1 and num2
                 int num1 = input.nextInt();
                 int num2 = input.nextInt();
                 System.out.println();

                 if(ch == '+'){
                     result = num1 + num2;

                 }
                 if(ch == '-'){
                     result = num1 - num2;
                 }
                 if(ch == '*'){
                     result = num1*num2;
                 }
                 if(ch== '/'){
                     // if num2=0 we cannot divide
                     if(num2!=0){
                         result = num1/num2;
                     }
                     else {
                         System.out.println("Infinite number");
                     }
                 if(ch == '%') {
                     result = num1 % num2;
                 }

             else{
                 System.out.println("Invalid");
                 }

                 }
                 //output print here
                 System.out.println(result);

             }
         }


    }
}
