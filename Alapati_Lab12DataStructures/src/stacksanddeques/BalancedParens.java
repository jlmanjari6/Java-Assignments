/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class BalancedParens {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner scan = new Scanner(new File("expressions.txt"));

        while (scan.hasNextLine()) {
            String expression = scan.nextLine();
            try {
                AStack<Character> parenStack = new AStack<>();

                char[] array = expression.toCharArray();
                for (char c : array) {
                    if (c == '(') {
                        parenStack.push(c);
                    } else if (c == ')') {
                        parenStack.pop();
                    }
                }
                if (parenStack.isEmpty()) {
                    System.out.println(expression + ": VALID\n");
                }
                else{
                    System.out.println(expression + ": INVALID");
                    System.out.println("Parsing complete, but the stack is not empty!\n");
                }
            } catch (Exception ex) {
                System.out.println(expression + ": INVALID");
                System.out.println("Trying to pop, but the stack is empty!\n");
            }
        }
    }

}
