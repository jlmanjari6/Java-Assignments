/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiondemo;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class RecursionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial: " + factorial(5));
        System.out.println("GCD: " + calcGCD(18, 12));
        System.out.println("GCD: " + calcGCD(9, 8));
        System.out.println("GCD: " + calcGCD(48, 39));
        System.out.println("GCD: " + calcGCD(12, 15));
        System.out.println("GCD: " + calcGCD(1234, 456));
        System.out.println("F: " + calcF(2));
        System.out.println("F: " + calcF(3));
        System.out.println("F: " + calcF(5));
        System.out.println("F: " + calcF(10));
        System.out.println("Fibanocci Plus: " + fibanocciPlus(1));
        System.out.println("Fibanocci Plus: " + fibanocciPlus(2));
        System.out.println("Fibanocci Plus: " + fibanocciPlus(11));
        System.out.println("Fibanocci Plus: " + fibanocciPlus(3));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

//    gcd(a, b) = gcd(b, a modulo b) if b > 0;
//    gcd(a, 0) = a.
    public static int calcGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcGCD(b, a % b);
        }
    }

//    if n == 0, then f returns 0;
//    otherwise, f returns n * n + f(n – 1);
    public static int calcF(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n * n + calcF(n - 1);
        }
    }

//    The Fibonacci+ sequence is an infinite sequence that starts with 0 and 1. To find the next
//        value in this sequence, compute the sum of the previous two values and then add one.
    public static int fibanocciPlus(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibanocciPlus(n - 1) + fibanocciPlus(n - 2) + 1;
    }

}
