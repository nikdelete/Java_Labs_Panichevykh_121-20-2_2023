package Lab4.controller;

import Lab4.model.Sex;
import Lab4.model.Student;

public class StudentCreator {
    public Student createStudent(String name, String surname, String patronymic, Sex sex, String studentId) {
        return new Student(name, surname, patronymic, sex, studentId);
    }
}