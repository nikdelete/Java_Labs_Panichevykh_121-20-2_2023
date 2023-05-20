package Lab3.controller;

import Lab3.model.Group;
import Lab3.model.Student;

public class GroupCreator {
    public Group createGroup(String name, Student head) {
        return new Group(name, head);
    }
}