package Lab5;

import java.sql.*;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:students.db";

    public void getStudentsByBirthMonth(String birthMonth) {
        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM students WHERE strftime('%m', birth_date) = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, birthMonth);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String middleName = resultSet.getString("middle_name");
                String birthDate = resultSet.getString("birth_date");
                String studentId = resultSet.getString("student_id");

                Student student = new Student(id, lastName, firstName, middleName, birthDate, studentId);
                System.out.println(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
