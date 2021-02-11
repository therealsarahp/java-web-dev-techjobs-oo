package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTests {

    Job jobOneEmpty;
    Job jobTwoEmpty;
    Job jobTestOne;
    Job jobTestTwo;

    @Before
    public void createJobObjects() {
         jobOneEmpty = new Job();
         jobTwoEmpty = new Job();
         jobTestOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         jobTestTwo = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));

    }

    @Test
    public void testEmptyConstructor(){
        assertFalse(jobOneEmpty.getId() == jobTwoEmpty.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(jobTestOne.getEmployer() instanceof Employer);
        assertEquals(jobTestOne.getEmployer().getValue(), "ACME");
        assertTrue(jobTestOne.getLocation() instanceof Location);
        assertEquals(jobTestOne.getLocation().getValue(), "Desert");
        assertTrue(jobTestOne.getPositionType() instanceof PositionType);
        assertEquals(jobTestOne.getPositionType().getValue(), "Quality control");
        assertTrue(jobTestOne.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(jobTestOne.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Employer employerTest = new Employer("Employer");
        Location locationTest = new Location("Location");
        PositionType positionTest = new PositionType("Position Type");
        CoreCompetency competencyTest = new CoreCompetency("Core Competency");
        Job jobEqualityOne = new Job("Job Equality", employerTest, locationTest, positionTest, competencyTest);
        Job jobEqualityTwo = new Job("Job Equality", employerTest, locationTest, positionTest, competencyTest);

        assertFalse(jobEqualityOne.equals(jobEqualityTwo));

    }

    @Test
    public void testJobtoStringMethod(){
        Job jobTestToString = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toStringTest= "\nID: " + jobTestToString.getId() +"\nNAME: Product tester\nEMPLOYER: ACME\nLOCATION: Desert\nPOSITION TYPE: Quality control\nCORE COMPETENCY: Persistence\n";

        assertTrue(jobTestOne.toString().contains("\n"));
        assertEquals(jobTestToString.toString(), toStringTest);
        assertTrue(jobTestTwo.toString().contains("Data Not Available"));

    }

}
