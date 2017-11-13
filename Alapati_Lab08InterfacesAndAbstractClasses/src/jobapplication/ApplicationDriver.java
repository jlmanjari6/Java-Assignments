/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class ApplicationDriver {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        ArrayList<Application> applicationsList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean iterate = true;
        System.out.println("************************************\n"
                + "Welcome to the Career Builder System\n"
                + "************************************");
        while (iterate) {
            System.out.println("Fill your details to know the jobs that suits your profile\n");
            Application application = new Application();
            application.fillJobApplicationDetails();
            if (!(application.haveAGoodBackGround())) {
                System.out.println("You shouldn't have any criminal or illicit background");
                break;
            }
            if (!(application.checkQualification())) {
                System.out.println("You need a higher need to apply the job posistions we have currently");
                break;
            }
            if (application.checkAge()) {
                application.produceTheJobDescriptionForApplicant();
                System.out.println(application.checkAvailabilityOfJob());
                System.out.println("Would you like to apply for this job?");
                if (scan.nextLine().toLowerCase().equals("yes")) {
                    applicationsList.add(application);
                }
                System.out.println("Would you like to apply for another applicant?");
                iterate = !(scan.nextLine().toLowerCase().equals("no"));
            }
        }
        if (!applicationsList.isEmpty()) {
            System.out.println("*********************************************\n"
                    + "Here is the list of applications you created \n"
                    + "*********************************************  \n");
            for (Application application : applicationsList) {
                System.out.println(application);
                System.out.println("*********************************************");
            }
        }
    }
}
