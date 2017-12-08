/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.*;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class OutPatient extends AbstractHospitalInfo  {

    private Patient patient;

    public OutPatient() {
    }

    public OutPatient(String hospitalName, String hospitalAddress, Patient patient) {
        super(hospitalName, hospitalAddress);
        this.patient = patient;
    }

    @Override
    public double calcBill(String billingDetails) {
        double bill = 0.0;
        String[] items = billingDetails.split(",");
        for (String item : items) {
            if (item.equals("Diphtheria")) {
                bill += 10.25;
            } else if (item.equals("Tetanus")) {
                bill += 12.99;
            } else if (item.equals("Acellular pertussis")) {
                bill += 17.89;
            } else if (item.equals("Haemophilus influenzae")) {
                bill += 7.5;
            } else if (item.equals("Pneumococcal conjugate")) {
                bill += 9.9;
            } else {
                bill += EMERGENCY_FEE;
            }
        }
        return BASE_CONSULTATION_FEE + bill;
    }

    @Override
    public void assignPatientsToDoctor(List<Doctor> doctorList,
            Patient patient) {
        for (Doctor doctor : doctorList) {
            if (doctor.getName().equals(patient.getDoctorToVisit())) {
                if (super.getPatientsMappedToDoctor().get(doctor) != null) {
                    super.getPatientsMappedToDoctor().get(doctor).add(patient);
                } else {
                    super.getPatientsMappedToDoctor().put(doctor, new HashSet<Patient>() {
                        {
                            add(patient);
                        }
                    });
                }
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + patient;
    }
}
