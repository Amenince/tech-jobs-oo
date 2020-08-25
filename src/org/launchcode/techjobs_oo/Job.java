package org.launchcode.techjobs_oo;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(int id, String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.id = id;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString(Job obj) {
        if (obj.getName() == null) {
            return "\n" + "ID: " + obj.getId() + "\n" + "Data not available" + "\n" + "Employer: " + obj.getEmployer() + "\n" + "Location: " + obj.getLocation() + "\n" + "Position Type: " + obj.getPositionType() + "\n" + "Core Competency: " + obj.getCoreCompetency() + "\n";
        } else if (obj.getEmployer() == null) {
            return "\n" + "ID: " + obj.getId() + "\n" + "Name: " + obj.getName() + "\n" + "Data not available" + "\n" + "Location: " + obj.getLocation() + "\n" + "Position Type: " + obj.getPositionType() + "\n" + "Core Competency: " + obj.getCoreCompetency() + "\n";
        } else if (obj.getLocation() == null) {
            return "\n" + "ID: " + obj.getId() + "\n" + "Name: " + obj.getName() + "\n" + "Employer: " + obj.getEmployer() + "\n" + "Data not available" + "\n" + "Position Type: " + obj.getPositionType() + "\n" + "Core Competency: " + obj.getCoreCompetency() + "\n";
        } else if (obj.getPositionType() == null) {
            return "\n" + "ID: " + obj.getId() + "\n" + "Name: " + obj.getName() + "\n" + "Employer: " + obj.getEmployer() + "\n" + "Location: " + obj.getLocation() + "\n" + "Data not available" + "\n" + "Core Competency: " + obj.getCoreCompetency() + "\n";
        } else if (obj.getCoreCompetency() == null) {
            return "\n" + "ID: " + obj.getId() + "\n" + "Name: " + obj.getName() + "\n" + "Employer: " + obj.getEmployer() + "\n" + "Location: " + obj.getLocation() + "\n" + "Position Type: " + obj.getPositionType() + "\n" + "Data not available" + "\n";
        } else {
            return "\n" + "ID: " + obj.getId() + "\n" + "Name: " + obj.getName() + "\n" + "Employer: " + obj.getEmployer() + "\n" + "Location: " + obj.getLocation() + "\n" + "Position Type: " + obj.getPositionType() + "\n" + "Core Competency: " + obj.getCoreCompetency() + "\n";
        }
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
