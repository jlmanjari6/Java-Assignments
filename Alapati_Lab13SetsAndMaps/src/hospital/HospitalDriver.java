/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class HospitalDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        String docName, SpecialityType, officeHours, hospitalName, hospitalAddress = "";
        AbstractHospitalInfo hospitalInfo = new OutPatient();
        hospitalName = sc.nextLine();
        hospitalAddress = sc.nextLine();

        System.out.println("****************************************\n"
                + "Patient Details: \n"
                + "****************************************");
        while (sc.hasNext()) {
            String type = sc.next();
            if (type.equals("Doctor")) {
                sc.nextLine();
                docName = sc.nextLine();
                SpecialityType = sc.nextLine();
                officeHours = sc.nextLine();
                Doctor doctor = new Doctor(docName, SpecialityType, officeHours);
                try {
                    hospitalInfo.addDoctors(doctor);
                } catch (InvalidDoctorSizeException ex) {
                    System.out.println("Invalid doctors size!");
                }
            } else {
                String genderString = type;
                char gender = genderString.charAt(0);
                int age = Integer.parseInt(sc.next());
                String firstName = sc.next();
                String lastName = sc.next();
                int insuranceId = Integer.parseInt(sc.next());
                sc.nextLine();
                String doctor = sc.nextLine();
                Patient patient = new Patient(firstName, lastName, insuranceId, age, gender, doctor);
                OutPatient outPatient = new OutPatient(hospitalName, hospitalAddress, patient);
                System.out.println(outPatient.toString());
                hospitalInfo.assignPatientsToDoctor(hospitalInfo.getAvailableDoctorsList(), patient);
                String billingDetails = sc.nextLine();
                double billGenerated = outPatient.calcBill(billingDetails);
                System.out.println("Bill Amount Generated before Insurance deduction: " + billGenerated);
                String InsuranceCompany = sc.nextLine();
                double InsuranceCoverage = Double.parseDouble(sc.next());
                if (age < 16) {
                    ChildInsurance childInsurance = new ChildInsurance(InsuranceCompany, InsuranceCoverage,
                            firstName, lastName, insuranceId, age, gender, doctor);
                    System.out.println(childInsurance.toString());
                    try {
                        String insurancePlanName = childInsurance.checkHealthInsurancePlan();
                        System.out.println("Insurance Plan Name: " + insurancePlanName);
                    } catch (InvalidInsuranceIDException ex) {
                        System.out.println("Invalid insurance Id!");
                    }
                    double premiumPaid = Double.parseDouble(sc.next());
                    try {
                        double amountPayable = childInsurance.calcAmountPayableToHospital(premiumPaid, billGenerated);
                        System.out.println("Amount to be paid by after insurance deduction: " + amountPayable);
                    } catch (NegativeAmountException ex) {
                        System.out.println("Negative amounts are not allowed!");
                    }
                } else {
                    AdultInsurance adultInsurance = new AdultInsurance(InsuranceCompany, InsuranceCoverage,
                            firstName, lastName, insuranceId, age, gender, doctor);
                    System.out.println(adultInsurance.toString());
                    try {
                        String insurancePlanName = adultInsurance.checkHealthInsurancePlan();
                        System.out.println("Insurance Plan Name: " + insurancePlanName);
                    } catch (InvalidInsuranceIDException ex) {
                        System.out.println("Invalid insurance Id!");
                    }
                    double premiumPaid = Double.parseDouble(sc.next());
                    try {
                        double amountPayable = adultInsurance.calcAmountPayableToHospital(premiumPaid, billGenerated);
                        System.out.println("Amount to be paid by after insurance deduction: " + amountPayable);
                    } catch (NegativeAmountException ex) {
                        System.out.println("Negative amounts are not allowed!");
                    }
                }
                System.out.println("****************************************\n"
                        + "****************************************");

            }
        }
        System.out.println("\n****************************************\n"
                + "Patients assigned to doctor \"Lisa DiStefano\": \n"
                + "****************************************");

        for (Doctor d : hospitalInfo.getPatientsMappedToDoctor().keySet()) {
            if (d.getName().equals("Lisa DiStefano")) {
                System.out.println(hospitalInfo.getPatientsMappedToDoctor().get(d));
            }
        }

    }

}
