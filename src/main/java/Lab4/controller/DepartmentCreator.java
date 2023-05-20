package Lab4.controller;

import Lab4.model.Department;
import Lab4.model.Group;

public class DepartmentCreator {
    public Department createDepartment(String name, Group group) {
        return new Department(name, group);
    }
}