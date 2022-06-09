package introducaoOrientadaObjeto.exercises.StudentGrades.application;

import introducaoOrientadaObjeto.exercises.StudentGrades.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter your grade details: ");
        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Grade 1: ");
        student.gradeOne = sc.nextDouble();
        System.out.print("Grade 2: ");
        student.gradeTwo = sc.nextDouble();
        System.out.print("Grade 3: ");
        student.gradeThree = sc.nextDouble();


        System.out.println("FINAL GRADE: " + student.finalGrade());
        if (student.finalGrade() < 60){
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", student.missingPoints()) + " POINTS");
        }
        else{
            System.out.println("PASS");
        }


        sc.close();
    }
}
