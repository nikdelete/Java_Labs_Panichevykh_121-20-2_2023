package Lab3.controller;

import Lab3.model.Department;
import Lab3.model.Faculty;
import Lab3.model.*;

public class FacultyCreator {
    public Faculty createFaculty(String name, Department department) {
        return new Faculty(name, department);
    }
}