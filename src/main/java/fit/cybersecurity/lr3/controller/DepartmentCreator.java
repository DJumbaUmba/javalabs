package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Group;
import fit.cybersecurity.lr3.model.Department;
import fit.cybersecurity.lr3.model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String departmentName, Human head, Group[] groups) {
        return new Department(
                departmentName,
                head,
                groups
        );
    }
}
