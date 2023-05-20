package Lab4.controller;

import Lab4.model.Group;
import Lab4.model.Student;

public class GroupCreator {
    public Group createGroup(String name, Student head) {
        return new Group(name, head);
    }
}