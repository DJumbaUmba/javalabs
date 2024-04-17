package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Department;
import fit.cybersecurity.lr3.model.Group;
import fit.cybersecurity.lr3.model.Sex;

import java.util.List;

public abstract class DepartmentCreator {
    public static Department create(String departmentName, String headName, String headSurname, String headPatronymic, Sex headSex, List<Group> groups) {
        return new Department(
                departmentName,
                HumanCreator.create(
                        headName,
                        headSurname,
                        headPatronymic,
                        headSex
                ),
                groups
        );
    }
}
