package Lab3.controller;

import Lab3.model.*;
import Lab3.model.*;

public class UniversityCreator {
    public University createTypicalUniversity() {
        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        Student student1 = studentCreator.createStudent("John", "Doe", "Smith", Sex.MALE, "12345");
        Student student2 = studentCreator.createStudent("Jane", "Smith", "Doe", Sex.FEMALE, "67890");
        Group group = groupCreator.createGroup("Group 1", student1);
        Department department = departmentCreator.createDepartment("Department 1", group);
        Faculty faculty = facultyCreator.createFaculty("Faculty 1", department);
        University university = new University("University", faculty);

        return university;
    }
}