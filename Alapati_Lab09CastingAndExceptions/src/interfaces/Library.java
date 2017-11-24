/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import exceptions.NoFineException;

/**
 *
 * @author Vineeth Agarwal
 */
public interface Library {
 String LIBRARY_CODE="NWM";
 double calculateFine(String dateTime1,String dateTime2) 
         throws NoFineException;
 
}
