/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horses;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class HorseDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HerdOfHorses herd = new HerdOfHorses();

        herd.addHorseToHerd(new Horse("Horse1", "Breed1", 1992));
        herd.addHorseToHerd(new Horse("Horse2", "Breed2", 1995));
        herd.addHorseToHerd(new Horse("Horse3", "Breed3", 1997));
        herd.addHorseToHerd(new Horse("Horse3", "Breed3", 1997));
        herd.addHorseToHerd(new Horse("Horse3", "Breed4", 1998));       
        
        Horse h1 = new Horse("Horse3", "Breed4", 1998);
        herd.addHorseToHerd(h1);
        herd.addHorseToHerd(h1);

        System.out.println(herd.getSize());
    }

}
