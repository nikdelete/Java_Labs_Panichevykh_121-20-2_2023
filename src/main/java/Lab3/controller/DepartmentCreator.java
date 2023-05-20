package Lab3.controller;

import Lab3.model.Department;
import Lab3.model.Group;
import Lab3.model.*;

public class DepartmentCreator {
    public Department createDepartment(String name, Group group) {
        return new Department(name, group);
    }
}