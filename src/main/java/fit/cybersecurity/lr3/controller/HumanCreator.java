package fit.cybersecurity.lr3.controller;

import fit.cybersecurity.lr3.model.Sex;
import fit.cybersecurity.lr3.model.Human;

public abstract class HumanCreator {
    public static Human create(String name, String surname, String patronymic, Sex sex) {
        return new Human(name, surname, patronymic, sex);
    }
}