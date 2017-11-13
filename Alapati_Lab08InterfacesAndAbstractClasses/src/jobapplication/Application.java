/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Application implements Available {

    Applicant applicant;
    Job job;
    Supervisor supervisor;

    public Application() {

    }

    private void assignLevelOfCommunicationSkills(String level) {
        for (CommunicationSkill s : CommunicationSkill.values()) {
            if (level.equals(s.toString())) {
                applicant.levelOfCommunication = CommunicationSkill.valueOf(level).getLevelOfCommincationSkills();
            }
        }
    }

    public void fillJobApplicationDetails() {
        applicant = new Applicant();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        applicant.firstName = scan.nextLine();
        System.out.println("Enter your last name:");
        applicant.lastName = scan.nextLine();
        System.out.println("Enter your phone number:");
        applicant.phoneNumber = scan.nextLine();
        System.out.println("Enter your email id:");
        applicant.emailID = scan.nextLine();
        System.out.println("Do you have any work experience:");
        applicant.workExperience = (scan.nextLine().toLowerCase()).equals("yes");
        System.out.println("Enter your educational qualification:");
        applicant.educationQualification = scan.nextLine();
        System.out.println("Enter your level of communication skills:");
        applicant.levelOfCommunication = CommunicationSkill.valueOf(scan.nextLine().toUpperCase()).getLevelOfCommincationSkills();
        System.out.println("Enter your age:");
        applicant.age = Integer.parseInt(scan.nextLine());
    }

    public void produceTheJobDescriptionForApplicant() throws ParseException {
        if (applicant.educationQualification.toLowerCase().equals("masters") && applicant.levelOfCommunication <= 2
                && applicant.age >= 25 && applicant.isWorkExperience()) {
            supervisor = new Supervisor("John", "Ryan", "4125200909", "ryant@gmail.com");
            job = new Job(1100, "Senior Software Engineer", "Masters", new SimpleDateFormat("MM/dd/yyyy").parse("9/16/2017"),
                    new SimpleDateFormat("MM/dd/yyyy").parse("9/20/2017"), 50000,
                    "You have to develop software solutions and supervise the team under you", supervisor);
        } else if (applicant.educationQualification.toLowerCase().equals("masters") && applicant.levelOfCommunication <= 3
                && applicant.age >= 23 && !applicant.isWorkExperience()) {
            supervisor = new Supervisor("Feon", "Tim", "5125280229", "timf@gmail.com");
            job = new Job(1103, "Software Engineer", "Bachelors", new SimpleDateFormat("MM/dd/yyyy").parse("8/27/2017"),
                    new SimpleDateFormat("MM/dd/yyyy").parse("9/14 /2017"), 50000,
                    "You have to develop software solutions", supervisor);
        } else if ((applicant.educationQualification.toLowerCase().equals("bachelors")
                || applicant.educationQualification.toLowerCase().equals("masters")) && applicant.levelOfCommunication <= 3
                && applicant.age >= 22 && applicant.isWorkExperience()) {
            supervisor = new Supervisor("William", "Lee", "3206300980", "leew@gmail.com");
            job = new Job(1200, "Back end Developing", "Bachelors", new SimpleDateFormat("MM/dd/yyyy").parse("9/10/2017"),
                    new SimpleDateFormat("MM/dd/yyyy").parse("9/13/2017"), 50000,
                    "Have to write the code for server operations and data bases", supervisor);
        } else if (applicant.educationQualification.toLowerCase().equals("bachelors") && applicant.levelOfCommunication <= 3
                && applicant.age >= 22 && !applicant.isWorkExperience()) {
            supervisor = new Supervisor("David", "Martin", "4126290129", "martindav@gmail.com");
            job = new Job(1300, "front end", "Bachelors", new SimpleDateFormat("MM/dd/yyyy").parse("9/13/2017"),
                    new SimpleDateFormat("MM/dd/yyyy").parse("9/20/2017"), 50000,
                    "Have to write the code for front end and work with design aspects", supervisor);
        } else if (applicant.educationQualification.toLowerCase().equals("bachelors") && applicant.levelOfCommunication == 5
                && applicant.age >= 20) {
            supervisor = new Supervisor("Jose", "Ellizibeth", "3124482379", "s527890@gmail.com");
            job = new Job(1350, "tech support", "Bachelors", new SimpleDateFormat("MM/dd/yyyy").parse("9/16/2017"),
                    new SimpleDateFormat("MM/dd/yyyy").parse("9/20/2017"), 50000,
                    "Have to write the code for server operations and data bases", supervisor);
        } else {
            System.out.println("Not Eligible to apply for the jobs that are currently available");
            return;
        }
        System.out.println(job.printJobDetails());
    }

    @Override
    public boolean checkQualification() {
        return (applicant.educationQualification.toLowerCase().equals("masters")
                || applicant.educationQualification.toLowerCase().equals("bachelors"));
    }

    @Override
    public boolean checkAge() {
        return applicant.age > 20;
    }

    @Override
    public String verifyBackGround() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Have you ever been convicted for felony:");
        boolean q1 = scan.nextLine().toLowerCase().equals("yes");
        System.out.println("Are you a social worker part of criminal justice system:");
        boolean q2 = scan.nextLine().toLowerCase().equals("yes");
        System.out.println("Have you ever charged for traffic violations:");
        boolean q3 = scan.nextLine().toLowerCase().equals("yes");
        if (q1 == true || q2 == true || q3 == true) {
            System.out.println("You are not eligible to apply");
            return "You are not eligible to apply";
        } else {
            System.out.println("You are eligible to apply");
            return "You are eligible to apply";
        }
    }

    @Override
    public boolean haveAGoodBackGround() {
        return verifyBackGround().equals("You are eligible to apply");
    }

    @Override
    public String checkAvailabilityOfJob() {
        Date currentdate = new Date();
        return (currentdate.after(job.closingDate)) ? "The job dead line is closed you cannot apply for it"
                : "The job is still open, you can apply for this job";
    }

    @Override
    public String toString() {
        return applicant + "\n" + job + "\n";
    }
}
