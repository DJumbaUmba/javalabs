package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Faculty;
import fit.cybersecurity.lr3.model.Department;
import fit.cybersecurity.lr3.model.Sex;

import java.util.List;

public abstract class FacultyCreator {
    public static Faculty create(String facultyName, String headName, String headSurname, String headPatronymic, Sex headSex, List<Department> departments) {
        return new Faculty(
                facultyName,
                HumanCreator.create(
                        headName,
                        headSurname,
                        headPatronymic,
                        headSex
                ),
                departments
        );
    }
}
