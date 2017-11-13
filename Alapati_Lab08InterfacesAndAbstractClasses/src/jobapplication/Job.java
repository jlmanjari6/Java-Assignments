/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

import java.util.Date;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class Job {

    Date closingDate;
    int jobID;
    String jobTitle;
    String minimumRequiredDegree;
    Date openingDate;
    String responsibilities;
    double salary;
    Supervisor supervisor;

    public Job(int jobID, String jobTitle, String minimumRequiredDegree, Date openingDate,
            Date closingDate, double salary, String responsibilities, Supervisor s) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.minimumRequiredDegree = minimumRequiredDegree;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.responsibilities = responsibilities;
        this.salary = salary;
        this.supervisor = s;
    }

    public String printJobDetails() {
        return "The job details are as follows: \n" + toString();
    }

    @Override
    public String toString() {
        return "The details of job the applicant applied for \n"
                + "JobID: " + jobID
                + "\nJobTitle: " + jobTitle
                + "\nMinimumRequiredDegree: " + minimumRequiredDegree
                + "\nOpeningDate: " + openingDate
                + "\nClosingDate: " + closingDate
                + "\nSalary: " + salary
                + "\nResponsibilities of the job includes: " + responsibilities
                + "\nSupervisor details: \n" + supervisor.toString();
    }

}
