package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Department;
import fit.cybersecurity.lr3.model.Faculty;
import fit.cybersecurity.lr3.model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String facultyName, Human head, Department[] departments) {
        return new Faculty(
                facultyName,
                head,
                departments
        );
    }
}
