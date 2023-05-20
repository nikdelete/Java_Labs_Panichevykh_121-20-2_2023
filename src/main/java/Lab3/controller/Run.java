package Lab3.controller;

import Lab3.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();

        System.out.println("University Name: " + university.getName());
        System.out.println("Faculty Name: " + university.getFaculty().getName());
        System.out.println("Department Name: " + university.getFaculty().getDepartment().getName());
        System.out.println("Group Name: " + university.getFaculty().getDepartment().getGroup().getName());
        System.out.println("Head Student: " + university.getFaculty().getDepartment().getGroup().getHead().getName());
    }
}