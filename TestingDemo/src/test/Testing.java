/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author S530719
 */
public class Testing {
    public String getGrade(int score)
  {
	 if(score < 0) {
		return "Error";
	 } else if(score < 60) {
		return "F";
	 } else if(score < 70){
		return "D";
	 }
         else if(score < 80){
		return "C";
	 }
         else if(score < 90){
		return "B";
	 }
         else{
             return "A";
         }
  }

    
}
