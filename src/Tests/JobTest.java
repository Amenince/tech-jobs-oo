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

    @Before
    public void createJobObject() {
        first_job = new Job(1, "Steve", new Employer("McDonalds"), new Location("St. Louis"), new PositionType("Cook"), new CoreCompetency("Stuff"));
        second_job = new Job(1, "Bill", new Employer("Burger King"), new Location("St. Louis"), new PositionType("Manager"), new CoreCompetency("Other"));
        third_job = new Job(1,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        fourth_job = new Job(7,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        fifth_job = new Job(11,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

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
//        assertEquals("Formatting of jobs unsuccessful", "     " + "\n" + fifth_job + "\n" + "     ", jobToString(fifth_job));
        assertEquals("The string should contain label for each field", "ID: " + fifth_job.getId(),jobToString(fifth_job));
    }

}
