/*
In this project, you will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

Add two integers
Subtract two integers
Multiply two integers
Divide two integers
Apply the modulo operator on two integers

The instructions provided are general guidelines. Upon completion of the project, feel free to explore more in the learning environment.
*/

//Begin Scanner

import java.util.Scanner;

//Begin Class

public class Calculator {

    //Defining inicial variables for calculation

    int valueA = 0;
    int valueB = 0;

    //Inicial Operator

    public Calculator(){

    }

    //Defining operational methods

    public String add(int valueA, int valueB){
        int answer = valueA + valueB;
        String completeAnswer = "The answer is: " + answer;
        return completeAnswer;
    }

    public String subtract(int valueA, int valueB){
        int answer = valueA - valueB;
        String completeAnswer = "The answer is: " + answer;
        return completeAnswer;
    }

    public String multiply(int valueA, int valueB){
        int answer = valueA * valueB;
        String completeAnswer = "The answer is: " + answer;
        return completeAnswer;
    }

    public String divide(int valueA, int valueB){
        int answer = valueA / valueB;
        String completeAnswer = "The answer is: " + answer;
        return completeAnswer;
    }

    public String modulo(int valueA, int valueB){
        int answer = valueA % valueB;
        String completeAnswer = "The answer is: " + answer;
        return completeAnswer;
    }

    //Main 

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        //Enter first number

        System.out.println("Enter with the first number: ");
        int valueA = scanner.nextInt();

        //Enter second number

        System.out.println("Enter with the second number: ");
        int valueB = scanner.nextInt();

        //Choose mathematical operation

        System.out.println("Enter with the operation needed (1 for sum, 2 for subtract, 3 for multiply, 4 for divide and 5 for modulo;): ");
        Integer operation = scanner.nextInt();

        //Output solution

        if (operation.equals(1)) {
            System.out.println(myCalculator.add(valueA, valueB));
        }

        if (operation.equals(2)) {
            System.out.println(myCalculator.subtract(valueA, valueB));
        }

        if (operation.equals(3)) {
            System.out.println(myCalculator.multiply(valueA, valueB));
        }

        if (operation.equals(4) && (valueB != 0)) {
            System.out.println(myCalculator.divide(valueA, valueB));
        }

        if (operation.equals(5)) {
            System.out.println(myCalculator.modulo(valueA, valueB));
        }
    }
}