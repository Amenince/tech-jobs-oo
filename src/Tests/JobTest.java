package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {
    Job first_job;
    Job second_job;
    Job third_job;

    @Before
    public void createJobObject() {
        first_job = new Job(1, "Steve", new Employer("McDonalds"), new Location("St. Louis"), new PositionType("Cook"), new CoreCompetency("Stuff"));
        second_job = new Job(1, "Bill", new Employer("Burger King"), new Location("St. Louis"), new PositionType("Manager"), new CoreCompetency("Other"));
        third_job = new Job(1,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
        assertEquals("Oops, Id's are equal!", first_job.getId(), second_job.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("No Match!", third_job.getId(), 1, 1);
        assertEquals("No Match!", third_job.getName(), "Product tester");
        assertEquals("No Match", third_job.getEmployer().toString(), "ACME");
        assertEquals("No Match", third_job.getLocation().toString(), "Desert");
        assertEquals("No Match", third_job.getPositionType().toString(), "Quality control");
        assertEquals("No Match", third_job.getCoreCompetency().toString(), "Persistence");
    }

}
