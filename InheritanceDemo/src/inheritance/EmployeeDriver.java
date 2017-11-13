/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author S530719
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Employee emp = new Employee("Manjari", "Alapati", 1234, 590167);
//        System.out.println(emp);
//        
//        HourlyEmployee obj = new HourlyEmployee("Manjari", "Alapati", 1234, 590167, 8, 60);
//        System.out.println(obj);
//        
//        System.out.println(emp.calcSalary());
//        System.out.println(obj.calcSalary());
//        System.out.println(obj.calcInsurance());
//        System.out.println(emp.getFullName());
//        System.out.println(obj.getFullName());
//        
//        emp = obj; //The instance of a sub class is an instance of super class.
//        
//        Employee emp1 = new HourlyEmployee("d", "lastName", 0, 0, 0, 0); 
//          Employee emp2 = new HourlyEmployee("sfd", "lastName", 0, 0, 20, 20); 
//        HourlyEmployee h1 = (HourlyEmployee) new Employee("firstName", "lastName", 0, 0);
//        System.out.println(emp2.calcSalary());

//        Object o = new String("Hi");
//        String s = "hello";
//        s = (String) o;
//        System.out.println(s);
        
//        Employee e = new Employee("", "", 0, 0);
//        HourlyEmployee h=new HourlyEmployee("", "", 0, 0, 0, 0);
//        e=h;
//        h=(HourlyEmployee) e;
//        System.out.println(h);

//            Employee e1 = new HourlyEmployee("", "", 0, 0, 0, 0);
//            Employee e2 = new MonthlyEmployee("", "", 0, 0);
//            e2 = (Employee)e1;
//            e1 = (Employee)e2;
//            
//            NewInterface i = new MonthlyEmployee("", "lastName", 0, 0);
//            Employee e = new NewInterface() ;

MonthlyEmployee m = new MonthlyEmployee("", "lastName", 0, 0, 0, 0);
Employee e = new HourlyEmployee("", "lastName", 0, 0, 0, 0);
e=m;

Employee e1= new HourlyEmployee("", "lastName", 0, 0, 0, 0);

    }

}
