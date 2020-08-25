package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest extends Job {
    Job first_job;
    Job second_job;
    Job third_job;
    Job fourth_job;
    Job fifth_job;
    Job sixth_job;
    Job seventh_job;
    Job eighth_job;
    Job ninth_job;
    Job tenth_job;

    @Before
    public void createJobObject() {
        first_job = new Job(1, "Steve", new Employer("McDonalds"), new Location("St. Louis"), new PositionType("Cook"), new CoreCompetency("Stuff"));
        second_job = new Job(1, "Bill", new Employer("Burger King"), new Location("St. Louis"), new PositionType("Manager"), new CoreCompetency("Other"));
        third_job = new Job(1,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        fourth_job = new Job(7,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        fifth_job = new Job(11,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        sixth_job = new Job(10,null, new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        seventh_job = new Job(10,"Product tester", null, new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        eighth_job = new Job(10,"Product tester", new Employer("ACME"), null, new PositionType("Quality control"), new CoreCompetency("Persistence"));
        ninth_job = new Job(10,"Product tester", new Employer("ACME"), new Location("Desert"), null, new CoreCompetency("Persistence"));
        tenth_job = new Job(10,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), null);

    }

    @Test
    public void testSettingJobId() {
        assertEquals("Oops, Id's are equal!", first_job.getId(), second_job.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("No Match!", third_job.getId(), 1, 1);
        assertEquals("No Match!", "Product tester", third_job.getName());
        assertEquals("No Match", "ACME", third_job.getEmployer().toString());
        assertEquals("No Match", "Desert", third_job.getLocation().toString());
        assertEquals("No Match", "Quality control", third_job.getPositionType().toString());
        assertEquals("No Match", "Persistence", third_job.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals("This will fail if ID's are equal!", fourth_job.getId(), fifth_job.getId());
    }

    @Test
    public void toStringTest() {
        assertEquals("The string should contain label for each field", "\n" + "ID: " + fifth_job.getId() + "\n" + "Name: " + fifth_job.getName() + "\n" + "Employer: " + fifth_job.getEmployer() + "\n" + "Location: " + fifth_job.getLocation() + "\n" + "Position Type: " + fifth_job.getPositionType() + "\n" + "Core Competency: " + fifth_job.getCoreCompetency() + "\n", toString(fifth_job));
        assertEquals("This should test if name field is blank", "\n" + "ID: " + sixth_job.getId() + "\n" + "Data not available" + "\n" + "Employer: " + sixth_job.getEmployer() + "\n" + "Location: " + sixth_job.getLocation() + "\n" + "Position Type: " + sixth_job.getPositionType() + "\n" + "Core Competency: " + sixth_job.getCoreCompetency() + "\n", toString(sixth_job));
        assertEquals("This should test if employer field is blank", "\n" + "ID: " + seventh_job.getId() + "\n" + "Name: " + seventh_job.getName() + "\n" + "Data not available" + "\n" + "Location: " + seventh_job.getLocation() + "\n" + "Position Type: " + seventh_job.getPositionType() + "\n" + "Core Competency: " + seventh_job.getCoreCompetency() + "\n", toString(seventh_job));
        assertEquals("This should test if location field is blank", "\n" + "ID: " + eighth_job.getId() + "\n" + "Name: " + eighth_job.getName() + "\n" + "Employer: " + eighth_job.getEmployer() + "\n" + "Data not available" + "\n" + "Position Type: " + eighth_job.getPositionType() + "\n" + "Core Competency: " + eighth_job.getCoreCompetency() + "\n", toString(eighth_job));
        assertEquals("This should test if position type field is blank", "\n" + "ID: " + ninth_job.getId() + "\n" + "Name: " + ninth_job.getName() + "\n" + "Employer: " + ninth_job.getEmployer() + "\n" + "Location: " + ninth_job.getLocation() + "\n" + "Data not available" + "\n" + "Core Competency: " + ninth_job.getCoreCompetency() + "\n", toString(ninth_job));
        assertEquals("This should test if core competency field is blank", "\n" + "ID: " + tenth_job.getId() + "\n" + "Name: " + tenth_job.getName() + "\n" + "Employer: " + tenth_job.getEmployer() + "\n" + "Location: " + tenth_job.getLocation() + "\n" + "Position Type: " + tenth_job.getPositionType() + "\n" + "Data not available" + "\n", toString(tenth_job));
    }

}
