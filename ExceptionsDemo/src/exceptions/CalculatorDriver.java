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
public class CalculatorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Calculator cal = new Calculator(1, 0);
            System.out.println("Sum: " + cal.add());
            System.out.println("Differece: " + cal.sub());
            System.out.println("Bye!");
            System.out.println("Product: " + cal.mul());
            System.out.println("Quotient: " + cal.div());
            System.out.println("Bye!");
        }  catch (Exception ex) {
            System.out.println(ex.getClass()+ ", "+ ex.getMessage());
        }
//        catch (DividingByZeroException ex) {
//            System.out.println(ex.getClass()+ ", "+ ex.getMessage());
//        }
    }

}
