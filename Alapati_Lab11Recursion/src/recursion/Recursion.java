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
 * @author S530719
 */
public class Recursion {

    int sum = 0;
    ArrayList<ArrayList<Student>> finalList;
    String name1;
    String name2;

    public int sumOfOdd(int n) {

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
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
        this.name1 = name1;
        this.name2 = name2;
        permute(studentList, 0, studentList.size() - 1);
        return finalList;
    }

    public void permute(ArrayList<Student> str, int s, int r) {
        String currName = "";
        String prevName = "";
        int checkcount = 0;

        if (s == r) {
            ArrayList<Student> temp = new ArrayList<>();
            for (Student x : str) {
                prevName = currName;
                currName = x.getFname();
                if (prevName.equals(name1) && currName.equals(name2)
                        || prevName.equals(name2) && currName.equals(name1)) {
                    checkcount++;
                    break;
                }
                temp.add(x);
            }
            if (checkcount == 0) {
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

    public int evaluateExpression(String exp) {
        if (exp != null && exp.length() > 0) {
            int idxC, idxO = -1;
            idxC = exp.indexOf("");
            if (idxC != -1) {
                idxO = exp.lastIndexOf("(", idxC);
            }
            if (idxO != -1 && idxC > idxO) {
                String subExp = exp.substring(idxO + 1, idxC);
                exp = exp.replace("(" + subExp + ")", "" + evaluateSimpleExp(subExp));
                return evaluateExpression(exp);
            } else if (idxO == -1 && idxC == -1) {
                return evaluateSimpleExp(exp);
            }
        }
        return new Scanner(exp).nextInt();
    }

    private int evaluateSimpleExp(String exp) {
        if (exp.charAt(0) == '+' || exp.charAt(0) == '-') {
            exp = "0" + exp;
        }
        ArrayList<Integer> operands = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();
        char ch[] = exp.toCharArray();
        String temp = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] > 47 && ch[i] < 58) {
                temp += ch[i];
            } else if (ch[i] == '+' || ch[i] == '-' || ch[i] == '/' || ch[i] == '%'
                    || ch[i] == '*') {
                operators.add(ch[i]);
                operands.add(Integer.parseInt(temp));
                temp = "";
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
                int idx = operators.indexOf(op);
                operands.set(idx, evaluateExp(operators.get(idx),
                        operands.get(idx), operands.get(idx + 1)));
                operands.remove(idx + 1);
                operators.remove(idx);
            }
            if (operators.isEmpty()) {
                break;
            }
        }
        return operands.get(0);
    }

    private int evaluateExp(char op, int op1, int op2) {
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
