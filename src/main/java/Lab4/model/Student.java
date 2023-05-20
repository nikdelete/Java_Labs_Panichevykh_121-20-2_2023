package Lab4.model;

public class Student extends Human {
    private String studentId;

    public Student(String name, String surname, String patronymic, Sex sex, String studentId) {
        super(name, surname, patronymic, sex);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}