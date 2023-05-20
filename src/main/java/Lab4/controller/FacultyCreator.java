package Lab4.controller;

import Lab4.model.Department;
import Lab4.model.Faculty;

public class FacultyCreator {
    public Faculty createFaculty(String name, Department department) {
        return new Faculty(name, department);
    }
}