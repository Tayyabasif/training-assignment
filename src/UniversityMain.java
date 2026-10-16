//9.Business requirement: A university evaluates multiple assessment types:
// multiple-choice exams, programming assignments, and practical lab assessments.
//Each assessment type has different grading logic, but all belong to the assessment domain.

abstract class Assesment{
    String type;
    int marks;

    Assesment(String type, int marks){
        this.type = type;
        this.marks = marks;
    }

    public void showDetails(){
        System.out.println("Type: "+type);
        System.out.println("Marks: "+marks);
    }

    public abstract char calGrade();

}

class ProgrammingAssesment extends Assesment{

    public ProgrammingAssesment(String type, int marks) {
        super(type, marks);
    }

    @Override
    public char calGrade() {
        if(marks>=90)
            return 'A';
        else if(marks>=80)
            return 'B';
        else
            return 'F';
    }
}

class LabAssesment extends Assesment{

    public LabAssesment(String type, int marks) {
        super(type, marks);
    }

    @Override
    public char calGrade() {
        if(marks>=90)
            return 'A';
        else if(marks>=70)
            return 'B';
        else if(marks>=60)
            return 'C';
        else
            return 'F';
    }
}

class MCQAssesment extends Assesment{

    public MCQAssesment(String type, int marks) {
        super(type, marks);
    }

    @Override
    public char calGrade() {
        if(marks>=80)
            return 'A';
        else if(marks>=60)
            return 'B';
        else if(marks>=50)
            return 'C';
        else
            return 'F';
    }
}

public class UniversityMain {

    public static void main(String[] args){
        Assesment obj1 = new ProgrammingAssesment("Programming", 80);
        obj1.showDetails();
        System.out.println("Grade: "+obj1.calGrade());
        System.out.println();
        Assesment obj2 = new LabAssesment("Lab", 80);
        obj2.showDetails();
        System.out.println("Grade: "+obj2.calGrade());
        System.out.println();
        Assesment obj3 = new MCQAssesment("MCQ", 80);
        obj3.showDetails();
        System.out.println("Grade: "+obj3.calGrade());
    }
}
