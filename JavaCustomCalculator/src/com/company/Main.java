package com.company;
import java.util.*;
import java.util.Scanner;


    class InvalidInputException extends Exception{
        public String toString(){
            return "It is an invalid input exception";
        }
        public String getMessage(){ return " Please enter any new Number, 'a' and 'b' cannot be 0  "; }
    }
    class CannotDivideByZero extends Exception{
        public String toString(){
            return "Cannot divide by zero";
        }
        public String getMessage(){ return " Please enter the value of 'b' other than 0 "; }
    }
    class InputGreaterThan extends Exception{
        public String toString(){
            return "Input is greater then 10000" ;
        }
        public String getMessage(){ return " The value of 'a' and 'b' must be less than 10000 "; }
    }
    class MaximumLimitExceed extends Exception{
        public String toString() { return "Product is exceeding the limit " ;}
        public String getMessage(){ return " The limit of the Answer is exceeding, The  Answer Limit must be less than 20000"; }
    }
public class Main {

  //  public static void main(String[] args) {
	// Java Custom Calculator using error and exceptions
        /*
         Exercise 6: You have to create the custom calculator with following operations:
         1. + -> Addition
         2. - -> Subtraction
         3. * -> Multiplication
         4. / -> Division
         which throws the following Exceptions:
         1. Invalid input Exception ex: 6 & 9
         2. Cannot divide by 0 Exception
         3. Max Inout exception if any of the input is greater than 10000
         4. Max multiplier Reached exception - Don't allow any multiplication input to be greater than 7000
        */

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            try {
                System.out.println("1-Addition 2-Subtraction 3-Multiplication 4-Division");
                int choice, a, b;
                System.out.println("Enter your choice");
                choice = sc.nextInt();
                System.out.println("Enter the value of a");
                a = sc.nextInt();
                if (a >= 10000) {
                    throw new InputGreaterThan();
                }
                System.out.println("Enter the value of b");
                b = sc.nextInt();
                if (b >= 10000) {
                    throw new InputGreaterThan();
                }
                if (a == 0 && b == 0) {
                    throw new InvalidInputException();
                }

                switch (choice) {
                    case 1:
                        if ( a+b > 20000){
                            throw new MaximumLimitExceed();
                        }
                        else{
                        System.out.println(a + b); }
                        break;
                    case 2:
                        if( a - b > 20000) {
                           throw new MaximumLimitExceed();
                        }
                        else{
                            System.out.println(a - b);
                        }
                        break;
                    case 3:
                        if( a * b > 20000){
                            throw new MaximumLimitExceed();
                        }
                        else{
                            System.out.println(a * b);
                        }
                        break;
                    case 4:
                        if (b == 0) {
                            throw new CannotDivideByZero();
                        }
                        else if( a/b > 20000){
                            throw new MaximumLimitExceed();
                        }
                        else{
                            System.out.println(a / b);
                        }
                        break;

                }
            }
            catch(CannotDivideByZero e){
                System.out.println("Error! Please try again -> " + e);
                CannotDivideByZero Z = new CannotDivideByZero();
                String S = Z.getMessage();
                System.out.println(S);
            }
            catch(InputGreaterThan e){
                System.out.println("Error! Please try again -> " + e);
                InputGreaterThan Z2 = new InputGreaterThan();
                String S2 = Z2.getMessage();
                System.out.println(S2);
            }
            catch(InvalidInputException e){
                System.out.println("Error! Please try again -> " + e);
                InvalidInputException Z3 = new InvalidInputException();
                String S3 = Z3.getMessage();
                System.out.println(S3);
            }
            catch(MaximumLimitExceed e){
                System.out.println("Error! Please try again -> " + e);
                MaximumLimitExceed Z4 = new MaximumLimitExceed();
                String S4 = Z4.getMessage();
                System.out.println(S4);
            }
            System.out.println("Thanks ! for using our Program");
        }

    }









