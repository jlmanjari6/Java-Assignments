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
public abstract class AbstractHospitalInfo implements Hospital {

    private String hospitalName;
    private String hospitalAddress;
    private List<Doctor> availableDoctorsList;
    private HashMap<Doctor, HashSet<Patient>> patientsMappedToDoctor;

    public AbstractHospitalInfo() {
        availableDoctorsList = new ArrayList<>();
        patientsMappedToDoctor = new HashMap<>();
    }

    public AbstractHospitalInfo(String hospitalName, String hospitalAddress) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        availableDoctorsList = new ArrayList<>();
        patientsMappedToDoctor = new HashMap<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public List<Doctor> getAvailableDoctorsList() {
        return availableDoctorsList;
    }

    public HashMap<Doctor, HashSet<Patient>> getPatientsMappedToDoctor() {
        return patientsMappedToDoctor;
    }
    
    public void setAvailableDoctorsList(List<Doctor> availableDoctorsList) {
        this.availableDoctorsList = availableDoctorsList;
    }
    
    public static double getEMERGENCY_FEE(){
        return EMERGENCY_FEE;
    }
    
    public static double getBASE_CONSULTATION_FEE(){
        return BASE_CONSULTATION_FEE;
    }
    
    public void addDoctors(Doctor doctor)
                throws InvalidDoctorSizeException{
//        if(availableDoctorsList.size() < 0){
//            throw new InvalidDoctorSizeException();
//        }
        availableDoctorsList.add(doctor);
    }
    
    @Override
    public abstract double calcBill(String billingDetails);
    
    @Override
    public abstract void assignPatientsToDoctor(List<Doctor> doctorList,
                                            Patient patient);

    @Override
    public String toString() {
        return "HospitalName: " + hospitalName + ",\nHospitalAddress: " + hospitalAddress;
    }
}
