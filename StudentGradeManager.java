import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Module: Artificial Intelligence\n");

        //Get marks for each componet
        int assignment1 = getMark(scanner, "Assignment 1");
        int test1 = getMark(scanner, "Test 1");
        int assignment2 = getMark(scanner, "Assignment 2");
        int test2 = getMark(scanner, "Test 2 ");
        int project = getMark(scanner, "Project");

        //create student with component marks
        Student aiStudent = new Student("Artificial  Intelligence", assignment1, assignment2, test1, test2, project); 

        aiStudent.calculateWeightAverage();
        aiStudent.checkResults();
        aiStudent.assignLetterGrade();
        aiStudent.printReport();

        scanner.close();
    }
    
    //Method to get individual marks with input prompt
    public static int getMark(Scanner scanner, String componentName) {
        System.out.print("Enter mark for " + componentName + ":");
        return scanner.nextInt();
    }
}

class Student {
    String moduleName;
    int assignment1, assignment2, test1, test2, project;
    double average;
    String result;
    String grade;

    //contructor for module name and marks 
    public Student (String moduleName, int a1, int a2, int t1, int t2, int project){
        this.moduleName = moduleName;
        this.assignment1 = a1;
        this.assignment2 = a2;
        this.test1 = t1;
        this.test2 = t2;
        this.project = project;
    }
//calculate weight average
 public void calculateWeightAverage(){
    double a1Weight = assignment1 * 0.12;
    double a2Weight = assignment2 * 0.12;
    double t1Weight = test1 * 0.125;
    double t2Weight = test2 * 0.125;
    double projectWeight = project * 0.5;
    average = a1Weight + a2Weight + t1Weight + t2Weight + projectWeight;
 }
 //check results
 public void checkResults() {
    if (assignment1 < 50 || assignment2 < 50 || test1 < 50 || test2 < 50 || project < 50 ){
            result = "Fail";
        } else {
            result = "Pass";
        }
    }

 //assign letter grade
 public void  assignLetterGrade(){
    if (average >= 80) {
        grade = "A";
    } else if (average >= 70){
        grade = "B";
    }
    else if (average >= 60){
        grade = "C";
    }
    else if (average >=50){
        grade = "D";
    }
    else {
        grade = "F";
    }
 }
 //print Report
 public void printReport() {
    System.out.println("\n-------------------------------------------------------------");
    System.out.println("Student Name  : Bongani Ncube");
    System.out.println("Module Code   : COS 710");
    System.out.println("Module Title  : + moduleName");
    System.out.println("Period        : Semester 1, 2025");

    System.out.println("\n-------------------------------------------------------------");
    System.out.println("Semester Mark : ");
    System.out.println("- Assignment 1  : " +assignment1);
    System.out.println("- Assignment 2  : " + assignment2);
    System.out.println("- Test 1        : " + test1);
    System.out.println("- Test 2        : " + test2);
    System.out.println("-Project        : " + project);

    System.out.printf("\nFinal Mark: %.2f\n", average);
    System.out.println("Results         : " + result);
    System.out.println("Grade           : " + grade);

    //Remarks on Eligibility
    if (result.startsWith("Pass")) {
    System.out.println("Remark          : Eligible for final exam");
    } else {
    System.out.println("Remark        : Not Eligible for Final exam");
    }
 }
}

    
