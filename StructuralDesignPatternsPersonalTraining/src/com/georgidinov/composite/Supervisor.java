package com.georgidinov.composite;

import java.util.ArrayList;
import java.util.List;

//Class that plays Composite Node (one that has children) in our Composite Design Pattern
//Mind that there is a data structure that holds Faculty objects
class Supervisor implements Faculty{

    private final String name;
    private final String position;
    private final List<Faculty> faculties;

    public Supervisor(String name, String position) {
        this.name = name;
        this.position = position;
        this.faculties = new ArrayList<>();
    }//end of constructor

    public List<Faculty> getMyFaculties() {
        return new ArrayList<>(this.faculties);
    }//end of method getFaculties

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void add(Faculty faculty) {
        if (faculty != null) {
            this.faculties.add(faculty);
        }
    }//end of method add

    public Faculty remove(Faculty faculty) {
        int index = findFaculty(faculty);
        if (index == -1) {
            return null;
        }
        return this.faculties.remove(index);
    }//end of method remove

    public Faculty remove(int facultyIndex) {
        if (facultyIndex < 0 || facultyIndex > this.faculties.size() - 1) {
            return null;
        }
        return this.faculties.remove(facultyIndex);
    }//end of overloaded method remove

    private int findFaculty(Faculty faculty) {
        if (faculty != null) {
            for (int i = 0; i < this.faculties.size(); i++) {
                if (faculty.getDetails().equals(this.faculties.get(i).getDetails())) {
                    return i;
                }
            }
        }
        return -1;
    }//end of method findFaculty

    @Override
    public String getDetails() {
        return this.name+" is the "+this.position;
    }//end of method getDetails

}//end of composite class Supervisor
