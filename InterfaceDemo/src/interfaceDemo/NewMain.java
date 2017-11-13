/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDemo;

/**
 *
 * @author S530719
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Accountable a = new Employee(1);
      Payable a1 = new Employee(1);
        System.out.println(a.calcSalary());
System.out.println(a1.calcSalary());
    }
    
}
