package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //constructors

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // custom equals and hashcode methods and toString

    @Override
    public String toString(){
        String output = "";
        ArrayList<String> labelsArray = new ArrayList<String>();
        labelsArray.add("NAME: ");
        labelsArray.add("EMPLOYER: ");
        labelsArray.add("LOCATION: ");
        labelsArray.add("POSITION TYPE: ");
        labelsArray.add("CORE COMPETENCY: ");

        ArrayList<String> valuesArray = new ArrayList();
        valuesArray.add(this.getName());
        valuesArray.add(this.getEmployer().getValue());
        valuesArray.add(this.getLocation().getValue());
        valuesArray.add(this.getPositionType().getValue());
        valuesArray.add(this.getCoreCompetency().getValue());

        for (int i = 0; i<labelsArray.size(); i++) {
            if (valuesArray.get(i).isBlank()) {
                output += labelsArray.get(i) + "Data Not Available" + "\n";
            } else {
                output += labelsArray.get(i) + valuesArray.get(i) + "\n";
            }
        }

        return  "\n"+ "ID: " + this.getId() + "\n" + output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    //getters and setters

    public int getId() {
        return id;
    }

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
}
