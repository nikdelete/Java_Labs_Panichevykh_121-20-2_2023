package Lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    private String name;
    private Faculty faculty;
    private List<Faculty> faculties;

    public University(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void addDepartment(Department department) {
        if (faculty != null) {
            faculty.setDepartment(department);
        }
    }

    public void addGroup(Group group) {
        if (faculty != null && faculty.getDepartment() != null) {
            faculty.getDepartment().setGroup(group);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(faculty, that.faculty) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, faculties);
    }
}
