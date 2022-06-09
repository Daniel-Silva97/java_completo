package introducaoOrientadaObjeto.exercises.StudentGrades.entities;

public class Student {


    /*
    -------------------
    Student
    -------------------
    name: String
    gradeOne: double
    gradeTwo: double
    gradeThree: double
    -------------------
    finalGrade: double
    missingPoints: double
     */

    public String name;
    public double gradeOne;
    public double gradeTwo;
    public double gradeThree;

    public double finalGrade(){
        return gradeOne + gradeTwo + gradeThree;
    }

    public double missingPoints(){
        if (finalGrade() < 60){
            return 60 - finalGrade();
        }
        else {
            return 0.0;
        }
    }
}