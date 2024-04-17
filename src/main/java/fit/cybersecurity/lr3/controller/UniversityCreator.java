package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.University;
import fit.cybersecurity.lr3.model.Faculty;
import fit.cybersecurity.lr3.model.Sex;

import java.util.List;

public abstract class UniversityCreator {
    public static University create(String universityName, String headName, String headSurname, String headPatronymic, Sex headSex, List<Faculty> faculties) {
        return new University(
                universityName,
                HumanCreator.create(
                        headName,
                        headSurname,
                        headPatronymic,
                        headSex
                ),
                faculties
        );
    }
}
