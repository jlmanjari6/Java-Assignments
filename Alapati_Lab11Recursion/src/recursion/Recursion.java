/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Recursion {

    int sum = 0;
    ArrayList<ArrayList<Student>> finalList;
    String name1;
    String name2;

    public int sumOfOdd(int n) {
        if (n > 0) {
            if (n == 1) {
                sum += 1;
            } else {
                sum += 2 * n - 1 + sumOfOdd(n - 1);
            }
        }

        return sum;
    }

    public ArrayList<ArrayList<Student>> organizeSeats(ArrayList<Student> studentList) {
        finalList = new ArrayList<>();
        permute(studentList, 0, studentList.size() - 1);
        return finalList;
    }

    public ArrayList<ArrayList<Student>> organizeSeats(ArrayList<Student> studentList, String name1, String name2) {
        finalList = new ArrayList<>();
        this.name1 = name1.toLowerCase();
        this.name2 = name2.toLowerCase();
        permute(studentList, 0, studentList.size() - 1);
        return finalList;
    }

    public void permute(ArrayList<Student> str, int s, int r) {
        String currName = "";
        String prevName = "";
        int count = 0;

        if (s == r) {
            ArrayList<Student> temp = new ArrayList<>();
            for (Student x : str) {
                prevName = currName;
                currName = x.getFname();
                if (prevName.toLowerCase().equals(name1) && currName.toLowerCase().equals(name2)
                        || prevName.toLowerCase().equals(name2) && currName.toLowerCase().equals(name1)) {
                    count++;
                    break;
                }
                temp.add(x);
            }
            if (count == 0) {
                finalList.add(temp);
            }

        } else {
            for (int i = s; i <= r; i++) {
                swap(str, s, i);
                permute(str, s + 1, r);
                swap(str, s, i);
            }
        }
    }

    public ArrayList<Student> swap(ArrayList<Student> a, int i, int j) {
        Student temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
        return a;
    }

    public int evaluateExpression(String expression) {
        if (expression != null && expression.length() > 0) {
            int indexA, indexB = -1;
            indexA = expression.indexOf(")");
            if (indexA != -1) {
                indexB = expression.lastIndexOf("(", indexA);
            }
            if (indexB != -1 && indexA > indexB) {
                String subExp = expression.substring(indexB + 1, indexA);
                expression = expression.replace("(" + subExp + ")", "" + parseExpression(subExp));
                return evaluateExpression(expression);
            } else if (indexB == -1 && indexA == -1) {
                return parseExpression(expression);
            }
        }
        return new Scanner(expression).nextInt();
    }

    private int parseExpression(String expression) {
        if (expression.charAt(0) == '+' || expression.charAt(0) == '-') {
            expression = "0" + expression;
        }
        ArrayList<Integer> operands = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();
        char ch[] = expression.toCharArray();
        String temp = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] > 47 && ch[i] < 58) {
                temp += ch[i];
            } else if (ch[i] == '+' || ch[i] == '-' || ch[i] == '/' || ch[i] == '%'
                    || ch[i] == '*') {
                operators.add(ch[i]);
                operands.add(Integer.parseInt(temp));
                temp = "";
                if (ch[i + 1] == '+' || ch[i + 1] == '-') {
                    temp = ch[++i] + temp;
                }
            } else {
                return Integer.parseInt(expression);
            }
        }
        operands.add(Integer.parseInt(temp));
        String operations = "";
        if (operators.contains('/')) {
            operations += "/";
        }
        if (operators.contains('*')) {
            operations += "*";
        }
        if (operators.contains('%')) {
            operations += "%";
        }
        if (operators.contains('-')) {
            operations += "-";
        }
        if (operators.contains('+')) {
            operations += "+";
        }
        for (char op : operations.toCharArray()) {
            while (operators.contains(op)) {
                int index = operators.indexOf(op);
                operands.set(index, calculate(operators.get(index),
                        operands.get(index), operands.get(index + 1)));
                operands.remove(index + 1);
                operators.remove(index);
            }
            if (operators.isEmpty()) {
                break;
            }
        }
        return operands.get(0);
    }

    private int calculate(char op, int op1, int op2) {
        switch (op) {
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            case '%':
                return op1 % op2;
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
        }
        return 1 / 0;
    }

}
