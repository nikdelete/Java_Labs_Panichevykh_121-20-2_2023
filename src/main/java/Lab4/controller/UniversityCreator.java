package Lab4.controller;

import Lab4.model.University;
import Lab4.model.Department;
import Lab4.model.Faculty;
import Lab4.model.Group;
import Lab4.model.Student;
import Lab4.model.Sex;

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

    public University createNestedUniversity(int numFaculties, int numDepartmentsPerFaculty, int numGroupsPerDepartment) {
        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        University university = new University("University"); // Оновлення конструктора, додавши об'єкт Faculty

        for (int i = 0; i < numFaculties; i++) {
            Faculty faculty = facultyCreator.createFaculty("Faculty " + (i + 1));
            university.addFaculty(faculty);

            for (int j = 0; j < numDepartmentsPerFaculty; j++) {
                Department department = departmentCreator.createDepartment("Department " + (j + 1));
                faculty.addDepartment(department);

                for (int k = 0; k < numGroupsPerDepartment; k++) {
                    Student student = studentCreator.createStudent("John" + k, "Doe" + k, "Smith" + k, Sex.MALE, "12345" + k);
                    Group group = groupCreator.createGroup("Group " + (k + 1), student);
                    department.addGroup(group);
                }
            }
        }

        return university;
    }


}
