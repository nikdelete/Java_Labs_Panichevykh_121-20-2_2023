package Lab5;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        // Створити об'єкт Scanner для отримання введення користувача
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть місяць народження (наприклад, 05): ");
        String month = scanner.nextLine();  // Зчитати введений користувачем місяць

        DatabaseManager databaseManager = new DatabaseManager();
        databaseManager.getStudentsByBirthMonth(month);
    }
}