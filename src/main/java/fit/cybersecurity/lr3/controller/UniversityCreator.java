package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.University;
import fit.cybersecurity.lr3.model.Faculty;
import fit.cybersecurity.lr3.model.Human;

public class UniversityCreator {
    public static University createUniversity(String universityName, Human head, Faculty[] faculties) {
        return new University(
                universityName,
                head,
                faculties
        );
    }
}
