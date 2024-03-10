package InterfacePractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student(1, "White", "Walter",
                "James", new Date("2024/01/01"), "Building 1",
                123, "Faculty 1", 1, "Group 1");
        Student student2 = new Student(2, "Black", "Mike",
                "Alex", new Date("2024/02/02"), "Building 2",
                456, "Faculty 2", 2, "Group 2");
        Student student3 = new Student(1, "Fring", "Skyler",
                "John", new Date("2024/03/03"), "Building 3",
                789, "Faculty 3", 3, "Group 3");


        Student[] arrayOfObjects = new Student[]{student1, student2, student3};

        String check1 = "Faculty 1";
        String check2 = "Faculty 2";
        String check3 = "Faculty 3";

//        Student.checkFaculty(check1, arrayOfObjects);
//        Student.checkFaculty(check2, arrayOfObjects);
//        Student.checkFaculty(check3, arrayOfObjects);

        Student.pickTheFacultyAndGradeInfo(arrayOfObjects);

    }
}
