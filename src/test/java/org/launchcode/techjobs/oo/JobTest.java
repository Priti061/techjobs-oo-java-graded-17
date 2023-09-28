package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here


// Verify that the IDs of the two objects are distinct.
    @Test
    public void testSettingJobId() {
        Job test1= new Job();
        Job test2= new Job();

        assertNotEquals(test1.getId(), test2.getId());

    }

    // Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test3.getName() instanceof String);
        assertTrue(test3.getEmployer() instanceof Employer);
        assertTrue(test3.getLocation() instanceof Location);
        assertTrue(test3.getPositionType() instanceof PositionType);
        assertTrue(test3.getCoreCompetency() instanceof CoreCompetency);


        assertEquals("Product tester", test3.getName());
        assertEquals("ACME", test3.getEmployer().getValue());
        assertEquals("Desert", test3.getLocation().getValue());
        assertEquals("Quality control", test3.getPositionType().getValue());
        assertEquals("Persistence", test3.getCoreCompetency().getValue());



    }
    @Test
    public void testJobsForEquality() {
        Job test3= new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test4= new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test3.equals(test4));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test3= new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n',test3.toString().charAt(0));
        assertEquals('\n', test3.toString().charAt(test3.toString().length()-1));
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test4 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + test4.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n" , test4.toString());
    }


    @Test
    public void testToStringHandlesEmptyField() {
        Job test5= new Job("Product tester", new Employer("ACME"),new Location(""), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals ("\nID: " + test5.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Data not available\nPosition Type: Quality control\nCore Competency: Data not available\n" , test5.toString());

    }



}
