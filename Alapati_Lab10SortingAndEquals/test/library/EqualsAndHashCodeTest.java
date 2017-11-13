package library;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class EqualsAndHashCodeTest {

    public EqualsAndHashCodeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void equalsTest1() {
        boolean expectedResult = false;
        ArrayList<Faculty> fList1 = new ArrayList<>();
        ArrayList<Faculty> fList2 = new ArrayList<>();
        fList1.add(new Faculty("CSE", "Ajay Bandi", 30));
        fList1.add(new Faculty("IT", "Doug Hawley", 40));
        fList2.add(new Faculty("CSE", "Ajay Bandi", 30));
        fList2.add(new Faculty("IT", "Doug Hawley", 40));
        expectedResult = fList1.equals(fList2);
        assertEquals(false, expectedResult);
        //Declare a boolean variable expectedResult and assign false to it
        //Create two FacultyList objects fLsit1 and fLsit2 
        //Add different list of faculty names to fList1 and fList2
        //Test the objects on equals method written in FacultyList class
    }

    @Test
    public void equalsTest2() {
        boolean expectedResult = false;
        ArrayList<Faculty> fList1 = new ArrayList<>();
        ArrayList<Faculty> fList2 = new ArrayList<>();
        fList1.add(new Faculty("CSE", "Ajay Bandi", 30));
        fList1.add(new Faculty("IT", "Doug Hawley", 40));
        fList2.add(new Faculty("CSE", "Ajay Bandi", 30));
        fList2.add(new Faculty("ECE", "Denise Case", 20));
        fList2 = fList1;
        expectedResult = fList1.equals(fList2);
        assertEquals(false, expectedResult);
        ////Declare a boolean variable expectedResult and assign false to it
        //Create two FacultyList objects fLsit1 and fLsit2 
        //Assign fList1 to fList2
        //Test the objects on equals method written in FacultyList class
    }

    @Test
    public void hashCodeTest1() {
        int expectedResult, input;
        ArrayList<Faculty> fList1 = new ArrayList<>();
        ArrayList<Faculty> fList2 = new ArrayList<>();
        fList1.add(new Faculty("CSE", "Ajay Bandi", 30));
        fList1.add(new Faculty("IT", "Doug Hawley", 40));
        fList2.add(new Faculty("CSE", "Ajay Bandi", 30));
        fList2.add(new Faculty("ECE", "Denise Case", 20));
        expectedResult = fList1.hashCode();
        input = fList2.hashCode();
        assertEquals(expectedResult, input);
        //Declare two integer variables expectedResult, input
        //Create two FacultyList objects fLsit1 and fLsit2 
        //Add list of faculty names to fList1 and fList2 (with atleast one name different from other list)
        //Invoke hashCode() method on fLsit1 and assign the result to expectedResult
        //Invoke hashCode() method on fList2 and assign the result to input
        //Test expectedResult, input
    }

    @Test
    public void hashCodeTest2() {
        int expectedResult, input;
        ArrayList<Faculty> fList1 = new ArrayList<>();
        ArrayList<Faculty> fList2 = new ArrayList<>();
        fList1.add(new Faculty("CSE", "Ajay Bandi", 30));
        fList1.add(new Faculty("IT", "Doug Hawley", 40));
        fList2.add(new Faculty("CSE", "Ajay Bandi", 30));
        fList2.add(new Faculty("ECE", "Denise Case", 20));
        fList2 = fList1;
        expectedResult = fList1.hashCode();
        input = fList2.hashCode();
        assertEquals(expectedResult, input);
        //Declare two integer variables expectedResult, input
        //Create two FacultyList objects fLsit1 and fLsit2 
        //Add a list of faculty names to fLsit1 object
        //Assign fList1 to fList2
        //Invoke hashCode() method on fLsit1 and assign the result to expectedResult
        //Invoke hashCode() method on fList2 and assign the result to input
        //Test expectedResult, input
    }
}
