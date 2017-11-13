/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class GolfBallPacket {
    private int numberInPack ;
    private double cost;
    private String condition;
    
    public GolfBallPacket(int numberInPack, String condition){
        this.numberInPack = numberInPack;
        this.condition = condition;
        cost = 0.0;
    }
    
     public GolfBallPacket(int numberInPack, double cost, String condition){
        this.numberInPack = numberInPack;
        this.condition = condition;
        this.cost = cost;
    }

    public int getNumberInPack() {
        return numberInPack;
    }

    public double getCost() {
        return cost;
    }

    public String getCondition() {
        return condition;
    }

    public void setNumberInPack(int numberInPack) {
        this.numberInPack = numberInPack;
    }

    @Override
    public String toString() {
        return "GolfBallPacket{" + "numberInPack=" + numberInPack + ", cost=" + cost + ", condition=" + condition + '}';
    }
     
     public void increaseCost(double amount) {
         if(amount > 0){
             cost += amount;
         }
     }
     
     public double costPerBall() {
         return cost/numberInPack;
     }
     
     public String lastWordOfCondition(){
         if(!(condition.contains(" ")))
             return condition;
         
         return condition.substring(condition.lastIndexOf(" ")+ 1);
         
     }
}
