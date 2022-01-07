package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static school.QualificationPercentage.*;

public class SchoolMain {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese un nombre, nota teorica, nota practica y nota de ejercicios resueltos");

        String studentData = in.nextLine();

        String[] splitStudentData = studentData.split(",");

        List<Student> students = new ArrayList<>();

        while (true) {

            String name = splitStudentData[0];

            if ("".equals(name)) {
                break;
            }

            Qualification qualification = new Qualification();
            qualification.setPractice(Double.parseDouble(splitStudentData[2]));
            qualification.setTheoretical(Double.parseDouble(splitStudentData[1]));
            qualification.setResolution(Double.parseDouble(splitStudentData[3]));

            Student student = new Student(name, qualification);

            students.add(student);

            System.out.println("Ingrese un nombre, nota teorica, nota practica y nota de ejercicios resueltos");

            studentData = in.nextLine();

            splitStudentData = studentData.split(",");

        }
        showResults(students);
    }

    public static void showResults(List<Student> studentsList){

        for (Student student: studentsList) {

            Qualification qualification = student.getQualification();

            double finalQualification = PRACTICE.getPercentage() * qualification.getPractice()
                    + THEORETICAL.getPercentage() * qualification.getTheoretical()
                    + RESOLUTION.getPercentage() * qualification.getResolution();

            System.out.println("La nota final del alumno " + student.getName() + " es "+ finalQualification);

        }

    }


}
