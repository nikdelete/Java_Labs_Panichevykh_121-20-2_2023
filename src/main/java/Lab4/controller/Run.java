package Lab4.controller;

import Lab4.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();

        // Запис університету у форматі JSON
        JsonManager jsonManager = new JsonManager();
        jsonManager.saveUniversityToJson(university, "university.json");

        // Зчитування університету з файлу у форматі JSON
        University restoredUniversity = jsonManager.loadUniversityFromJson("university.json");

        System.out.println("University Name: " + restoredUniversity.getName());
        System.out.println("Faculty Name: " + restoredUniversity.getFaculty().getName());
        System.out.println("Department Name: " + restoredUniversity.getFaculty().getDepartment().getName());
        System.out.println("Group Name: " + restoredUniversity.getFaculty().getDepartment().getGroup().getName());
        System.out.println("Head Student: " + restoredUniversity.getFaculty().getDepartment().getGroup().getHead().getName());
    }
}
