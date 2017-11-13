/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S530719
 */
public class Classes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student( "Ann" );
        Student s2 = new Student( "Bill", 176, 200 );

        System.out.println( s1.getName() ); 
        System.out.println( s2.average() ); 
        Student s = new Student( "Heather" );

        s.addScore( 87, 100 );
        s.addScore( 19, 20 );
        s.addScore( 60, 75 );

        System.out.println( s.getName()
                    + " has an average of "
                    + s.average() );
 
    }
    
}

class Student
{
 private String name;
   private int pointsEarned;
   private int pointsPossible;

   public Student( String nameIn )
   {
      name = nameIn;
      pointsEarned = 0;
      pointsPossible = 0;
   }
   
   public Student( String nameIn, int ptsEarnedIn, int ptsPossibleIn )
   {
      name = nameIn;
      pointsEarned = ptsEarnedIn;
      pointsPossible = ptsPossibleIn;
   }

   public void addScore( int ptsEarned, int ptsPossible )
   {
      pointsEarned += ptsEarned;
      pointsPossible += ptsPossible;
   }
   
   public double average()
   {
      return ( pointsEarned * 100.0 ) / pointsPossible;
   }
   
   public String getName()
   {
      return name;
   }
}
