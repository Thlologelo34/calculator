/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Calculator {

   

    public static void main(String[] args) {

        int option;

        double num1, num2;



        do {

            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));

            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));



            option = Integer.parseInt(JOptionPane.showInputDialog(

                    "Select an operation:\n" +

                    "1. Addition\n" +

                    "2. Subtraction\n" +

                    "3. Division\n" +

                    "4. Multiplication\n" +

                    "0. Exit"));



            switch (option) {

                case 1:

                    JOptionPane.showMessageDialog(null, "Result: " + (num1 + num2));

                    break;

                case 2:

                    JOptionPane.showMessageDialog(null, "Result: " + (num1 - num2));

                    break;

                case 3:

                    if (num2 != 0)

                        JOptionPane.showMessageDialog(null, "Result: " + (num1 / num2));

                    else

                        JOptionPane.showMessageDialog(null, "Error: Division by zero");

                    break;

                case 4:

                    JOptionPane.showMessageDialog(null, "Result: " + (num1 * num2));

                    break;

                case 0:

                    JOptionPane.showMessageDialog(null, "Exiting...");

                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Calculation not recognized");

            }

        } while (option != 0);

    }

}

    
