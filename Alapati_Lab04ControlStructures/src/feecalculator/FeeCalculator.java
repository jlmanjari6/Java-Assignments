/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feecalculator;

/**
 * To develop the fee calculator for non-resident MS-ACS graduate students who enroll courses at Northwest Missouri State University.
 * This calculator shall calculate the total amount that students have to pay to the university. This would include the scholarship amounts also.
 * @author Lakshmi Manjari Alapati
 * @version 25th Sep, 2017
 */
public class FeeCalculator {
    private String studentName;
    
    public static final double UG_INCIDENTAL_FEE = 406.35;
    public static final double UG_DESIGNATED_FEE = 104.80;
    public static final double UG_TEXTBOOK_FEE = 6;
    public static final double UG_TECHNOLOGY_FEE = 20.70;
    public static final double UG_CS_FEE = 38;
    public static final double G_INCIDENTAL_FEE = 505.72;
    public static final double G_DESIGNATED_FEE = 115.55;
    public static final double G_TEXTBOOK_FEE = 0;
    public static final double G_TECHNOLOGY_FEE = 20.70;
    public static final double G_CS_FEE = 38;
    
    public static final int G_SCHOLARSHIP = 1000;
    
    public static final double SEM1_INSURANCE = 456.48;
    public static final double SEM2_SEM3_INSURANCE = 760.2;
    public static final double SEM4_INSURANCE = 456.48;
    
    public static final double INR_EXCHANGE = 64.55;
    public static final double EURO_EXCHANGE = 0.83;
    
    public static final double STUDENT_SERVICE_FEE = 75;
    public static final double ORIENTATION_FEE = 75;
    
    public static final double CREDIT_HOURS = 3;
    public static final double NO_OF_COURSES = 3;
    public static final double NO_OF_COURSES_NO_PREREQ = 2;
    
    /**
     * This is parameterized constructor
     * @param studentName 
     */
    public FeeCalculator(String studentName)
    {
        this.studentName = studentName;
    }

    /**
     * This is getter method
     * @return student name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This is setter method
     * @param studentName 
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    /**
     * This method returns the first letter of every word from the student name in uppercase
     * @return initials
     */
    public String getNameInitials()
    {
        String initials = "" + this.studentName.charAt(0);
      
       for(int i=0; i< this.studentName.trim().length();i++)
        {
            if(this.studentName.charAt(i) == ' ')
            {
                initials += "." + this.studentName.charAt(i+1);
            }
        }
       initials += ".";
       
       return initials.toUpperCase();
    }
    
    /**
     * This method takes number of prerequisite(s) as a parameter and returns the cost of prerequisite course(s)
     * @param noOfPreRequisites
     * @return cost of prerequisite course(s)
     */
    private double calcPrereqCost(int noOfPreRequisites)
    {
        double feePerCourse = UG_CS_FEE + UG_DESIGNATED_FEE + UG_INCIDENTAL_FEE + UG_TECHNOLOGY_FEE
                              + UG_TEXTBOOK_FEE;
        return noOfPreRequisites * CREDIT_HOURS * feePerCourse;
    }
    
    /**
     * This method takes number of prerequisite(s) as a parameter and returns the number of required course(s) of type integer
     * @param noOfPreRequisites
     * @return number of required courses for Semester 1
     */
    private int findReqCoursesForSem1(int noOfPreRequisites)
    {
        switch(noOfPreRequisites)
        {
            case 0: return 3;
            case 1: return 2;
            case 2: return 2;
            default: return -1;
        }
    }
    
    /**
     * This method returns the required course cost for a course 
     * @return required course cost for one course
     */
    private double calcReqCourseCostForOneCourse()
    {
        return (G_CS_FEE + G_DESIGNATED_FEE + G_INCIDENTAL_FEE + G_TECHNOLOGY_FEE + G_TEXTBOOK_FEE)* CREDIT_HOURS;
    }
    
    /**
     * This method takes semester, prerequisites and GPA as parameters and returns the scholarship for a particular semester of type double. 
     * The scholarship should be calculated based on the semester and GPA. 
     * @param semester
     * @param noOfPrequisites
     * @param gpa
     * @return scholarship
     */
    private double calcScholarship(int semester, int noOfPrequisites, double gpa)
    {
        if(semester == 1)
            return G_SCHOLARSHIP;
        else if(semester != 1 && gpa >= 3.33)
            return G_INCIDENTAL_FEE * CREDIT_HOURS * NO_OF_COURSES/2;
        else
            return 0;
    }
    
    /**
     * ): This method takes semester, prerequisites and GPA as the parameters and returns the total scholarship upto that semester.
     * @param semester
     * @param noOfPrequisites
     * @param gpa
     * @return total scholarship up till the given semester.
     */
    private double calcTotalScholarship(int semester, int noOfPrequisites, double gpa)
    {        
        double scholarship = 0.0;
        for(int i = semester;i >= 1;i--)
        {
            scholarship += calcScholarship(i, noOfPrequisites, gpa);            
        }
        return scholarship;
    }
    
    /**
     * This method takes semester, prerequisites and GPA as the parameters and returns the cost for a semester 
     * @param semester
     * @param noOfPrequisites
     * @param gpa
     * @return cost for a given semester.
     */
    public double calcSemCost (int semester, int noOfPrequisites, double gpa)
    {
        switch(semester)
        {
            case 1:
                 return ORIENTATION_FEE + STUDENT_SERVICE_FEE + SEM1_INSURANCE + 
                    calcPrereqCost(noOfPrequisites) + calcReqCourseCostForOneCourse()
                        * (findReqCoursesForSem1(noOfPrequisites)) - G_SCHOLARSHIP;
            case 2:            
                 return STUDENT_SERVICE_FEE + SEM2_SEM3_INSURANCE - calcScholarship(semester, noOfPrequisites, gpa) + 
                         NO_OF_COURSES * calcReqCourseCostForOneCourse();
                 
            case 3:
                 return STUDENT_SERVICE_FEE - calcScholarship(semester, noOfPrequisites, gpa) + 
                         NO_OF_COURSES * calcReqCourseCostForOneCourse();
            
            case 4:
                 return STUDENT_SERVICE_FEE + SEM4_INSURANCE - calcScholarship(semester, noOfPrequisites, gpa) + 
                         ((noOfPrequisites == 0) ? NO_OF_COURSES_NO_PREREQ : NO_OF_COURSES)* calcReqCourseCostForOneCourse();
                 
            default: return 0.0;                 
        }        
    }
    
    /**
     * This public method takes semester, prerequisites and GPA as the parameters and 
     *  returns the total cost for all the semesters passing to this method.
     * @param semesters
     * @param noOfPrerequisites
     * @param gpa
     * @return the total cost for all the semesters passed.
     */
    public double calcTotalCost(int semesters, int noOfPrerequisites, double gpa)
    {
        double totalCost = 0.0;        
        for(int i=1;i<=semesters;i++)
        {
           totalCost += calcSemCost(i, noOfPrerequisites, gpa);
        }
        return totalCost;
    }
    
    /**
     * This public method takes the total cost as a parameter in USD and returns the Indian currency value.
     * @param amount
     * @return Indian amount exchange.
     */
    public double exchUSDToINR(double amount)
    {
        return amount*INR_EXCHANGE;
    }
    
    /**
     * This public method takes the total cost as a parameter in USD and returns value in Euros.
     * @param amount
     * @return Euro exchange.
     */
    public double exchUSDToEuro(double amount)
    {
        return amount*EURO_EXCHANGE;
    }
    
    /**
     * This method returns the initials of the name.
     * @return initials.
     */
    @Override
    public String toString()
    {
        return getNameInitials();
    }
    
    /**
     * This method is used to print the receipt.
     * @param semester
     * @param noOfPrerequisites
     * @param gpa
     * @return the receipt with fee summary.
     */
    public String printReceipt(int semester, int noOfPrerequisites, double gpa)
    {
        return toString() + ", on a whole the total scholarship till semester " + semester + " is: $ " + 
                 String.format("%8.2f", calcTotalScholarship(semester, noOfPrerequisites, gpa)) +"\nTotal fee till semester " 
                + semester + " is: $ " +  String.format("%8.2f", calcTotalCost(semester, noOfPrerequisites, gpa));
    }
}
