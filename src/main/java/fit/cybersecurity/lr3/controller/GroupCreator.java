package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Group;
import fit.cybersecurity.lr3.model.Student;
import fit.cybersecurity.lr3.model.Sex;

import java.util.List;

public abstract class GroupCreator {
    public static Group create(String groupName, String headName, String headSurname, String headPatronymic, Sex headSex, List<Student> students) {
        return new Group(
                groupName,
                HumanCreator.create(
                        headName,
                        headSurname,
                        headPatronymic,
                        headSex
                ),
                students
        );
    }
}
