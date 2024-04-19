package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Group;
import fit.cybersecurity.lr3.model.Student;
import fit.cybersecurity.lr3.model.Human;

public class GroupCreator {
    public static Group createGroup(String groupName, Human head, Student[] students) {
        return new Group(
                groupName,
                head,
                students
        );
    }
}
