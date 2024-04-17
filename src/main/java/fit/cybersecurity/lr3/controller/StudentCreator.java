package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Sex;
import fit.cybersecurity.lr3.model.Student;

public abstract class StudentCreator {
    public static Student create(String name, String surname, String patronymic, Sex sex) {
        return new Student(
                name,
                surname,
                patronymic,
                sex
        );
    }
}
