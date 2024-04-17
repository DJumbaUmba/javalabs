package fit.cybersecurity.lr3;

import fit.cybersecurity.lr3.controller.*;
import fit.cybersecurity.lr3.model.*;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println(university);
    }

    public static University createTypicalUniversity() {
        Student student_1 = StudentCreator.create("Петро", "Шевченко", "Олександрович", Sex.MALE);
        Student student_2 = StudentCreator.create("Марія", "Коваленко", "Іванівна", Sex.FEMALE);
        Student student_3 = StudentCreator.create("Олег", "Мельник", "Васильович", Sex.MALE);
        Student student_4 = StudentCreator.create("Наталія", "Бойко", "Юріївна", Sex.FEMALE);
        Student student_5 = StudentCreator.create("Андрій", "Захарчук", "Миколайович", Sex.MALE);

        List<Student> students = new ArrayList<>();
        students.add(student_1);
        students.add(student_2);
        students.add(student_3);
        students.add(student_4);
        students.add(student_5);
        Group group = GroupCreator.create(
                "125-20-3",
                "Вікторія",
                "Сидоренко",
                "Петрівна",
                Sex.FEMALE,
                students
        );

        List<Group> groups = new ArrayList<>();
        Department department = DepartmentCreator.create(
                "БІТ",
                "Ігор",
                "Кравчук",
                "Ярославович",
                Sex.MALE,
                groups
        );

        List<Department> departments = new ArrayList<>();
        Faculty faculty = FacultyCreator.create(
                "ФІТ",
                "Юлія",
                "Романенко",
                "Сергіївна",
                Sex.FEMALE,
                departments
        );

        List<Faculty> faculties = new ArrayList<>();
        University university = UniversityCreator.create(
                "НТУДП",
                "Володимир",
                "Литвин",
                "Дмитрович",
                Sex.MALE,
                faculties
        );

        return university;
    }
}
