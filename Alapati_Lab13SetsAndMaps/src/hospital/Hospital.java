/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.List;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public interface Hospital {
    static final double EMERGENCY_FEE = 30.0;
    static final double BASE_CONSULTATION_FEE = 20.0;
    
    double calcBill(String billingDetails);
    void assignPatientsToDoctor(List<Doctor> doctorList,
                            Patient patient);
}
