package Lab4.controller;

import Lab4.model.University;
import Lab4.controller.UniversityCreator;
import Lab4.controller.JsonManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {
    @Test
    public void testUniversityEquality() {
        UniversityCreator universityCreator = new UniversityCreator();

        // Створення oldUniversity згідно завдання
        University oldUniversity = universityCreator.createNestedUniversity(2, 2, 2);

        // Запис oldUniversity у форматі JSON
        JsonManager jsonManager = new JsonManager();
        jsonManager.saveUniversityToJson(oldUniversity, "university.json");

        // Зчитування університету з файлу у форматі JSON
        University newUniversity = jsonManager.loadUniversityFromJson("university.json");

        // Порівняння newUniversity та oldUniversity
        assertEquals(oldUniversity, newUniversity);
    }
}