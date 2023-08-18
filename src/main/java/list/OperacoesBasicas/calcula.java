package main.java.list.OperacoesBasicas;

import javax.swing.*;

public class calcula {
    public static void main(String[] args) {
        String firstNumber,
                secondNumber;
        int number1;
        int number2;
        int sum;

        firstNumber =
                JOptionPane.showInputDialog("Enter first integer");

        secondNumber =
                JOptionPane.showInputDialog("Enter second integer");

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        sum = number1 * number2;

        JOptionPane.showInputDialog(
                null,"The sum is " + sum, "Results",
                JOptionPane.QUESTION_MESSAGE);
System.exit( 0 );
    }
}
