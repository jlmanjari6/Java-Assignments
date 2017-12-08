/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SamplePackage;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author S530719
 */
public class SampleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Sample sampleObj = new Sample(10, "Fault in the Stars", "John Green");
//        System.out.println(sampleObj.getBookId());
//        System.out.println(sampleObj.getBookName());
//        System.out.println(sampleObj.getBookAuthor());
//        
//        Sample sampleObj2 = new Sample(12,"abc","def");
//        System.out.println(sampleObj2.getBookId());
//        System.out.println(sampleObj2.getBookName());
//        System.out.println(sampleObj2.getBookAuthor());
//        sampleObj2.setBookId(11);
//        sampleObj2.setBookName("The girl with the dragon tattoo");
//        sampleObj2.setBookAuthor("Stieg Larrison");
//        System.out.println(sampleObj2.getBookId());
//        System.out.println(sampleObj2.getBookName());
//        System.out.println(sampleObj2.getBookAuthor());
//        System.out.println(sampleObj2.toString());
//        

//        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        StringBuilder salt = new StringBuilder();
//        Random rnd = new Random();
//        while (salt.length() < 2) { // length of the random string.
//            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
//            salt.append(SALTCHARS.charAt(index));
//        }
//        String saltStr = salt.toString();
//        System.out.println(saltStr);
//{
//        String a = "";
//        for (int i = 0; i < 2; i++) {
//            char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//            Random random = new Random();
//
//            // randomly selects an index from the arr
//            int select = random.nextInt(arr.length);
//
//            // prints out the value at the randomly selected index
//            a += arr[select];
//
//        }
//        System.out.println(a.toUpperCase());
//        String str = "sanja";
//        ArrayList<String> strArray = new ArrayList<>();
//        for (int i = 0; i < str.length(); i++) {
//            strArray.add("" + str.charAt(i));
//        }
//
//        for (int i = 0; i < strArray.size(); i++) {
//            if (!(strArray.size() - i < 3)) {
//                String ele = strArray.get(i);
//                strArray.remove(i);
//                strArray.add(i + 2, ele);
//                i = i + 2;
//            }
//        }
//        str = "";
//        for (String s : strArray) {
//            str += s.trim();
//        }
//        System.out.println(str);
//        Random r = new Random();
//        r.setSeed(20);
//        int n = r.nextInt() + 900000;
//        System.out.println(n);
//        String s[] = {"Lakshmi Manjari Alapati", "Chandrika Meda", "Hitesh Kolla"};
//        String fn, ln, mn;
//        for (String item : s) {
//            fn = item.substring(0, item.indexOf(" "));
//            ln = item.substring(item.lastIndexOf(" "));
//            mn = item.substring(item.indexOf(" "), item.lastIndexOf(" "));
//            
//        System.out.println("fn: " +fn);
//        System.out.println("mn: " +mn);
//        System.out.println("ln: " +ln);
        System.out.println(SumofOdd(8));
        System.out.println(SumofEven(8));
        System.out.println(SumofN(8));
    }

    public static int SumofOdd(int n) {
        int s = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            n = n - 1;
        }
        s += n + SumofOdd(n - 2);
        return s;
    }

    public static int SumofEven(int n) {
        int s = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        if (n % 2 == 1) {
            n = n - 1;
        }
        s += n + SumofEven(n - 2);
        return s;
    }

    public static int SumofN(int n) {
        int s = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        s += n + SumofN(n - 1);
        return s;
    }
// if (n > 0) {
//            if (n == 1) {
//                sum += 1;
//            } else {
//                sum += 2 * n - 1 + sumOfOdd(n - 1);
//            }
//        }
//
//        return sum;

}
