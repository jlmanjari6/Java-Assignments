/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author S530719
 */
public class Calculator {

    private int numA;
    private int numB;

    public Calculator(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int add() {
        return numA + numB;
    }

    public int sub() {
        return numA - numB;
    }

    public int mul() {
        return numA * numB;
    }

    public int div() throws DividingByZeroException {
        if(numB == 0){
            throw new DividingByZeroException("Attempting to divide by zero.");
        }
        return numA / numB;
    }
}
