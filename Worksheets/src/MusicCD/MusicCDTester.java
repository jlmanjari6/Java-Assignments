/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicCD;

/**
 *
 * @author S530719
 */
public class MusicCDTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MusicCD cd1 = new MusicCD();
        System.out.println(cd1.getTitle());
        System.out.println(cd1.getArtist());
        
        MusicCD cd2= new MusicCD("abc", "Constructor2 artist");
        System.out.println(cd2.getTitle());
        System.out.println(cd2.getArtist());
        cd2.setTitle("xyz");
        cd2.setArtist("xyzacv");
        
        System.out.println(cd2.getTitle());
        System.out.println(cd2.getArtist());
        
        
    }
    
}
