package Lab3.controller;

import Lab3.model.Sex;
import Lab3.model.Student;
import Lab3.model.*;

public class StudentCreator {
    public Student createStudent(String name, String surname, String patronymic, Sex sex, String studentId) {
        return new Student(name, surname, patronymic, sex, studentId);
    }
}