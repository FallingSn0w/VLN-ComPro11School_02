import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    private String studentFName;
    private String studentLName;
    private int studentGrade;
    private int studentID;
    private static int studentIDNum;

    Student(String studentFName, String studentLName, int studentGrade) {
        this.studentFName = assignStudentFName();
        this.studentLName = assignStudentLName();
        this.studentGrade = assignStudentGrade();
        this.studentID = studentIDNum;
        studentIDNum++;
    }

    public String assignStudentFName(){
        System.out.println("Student First Name:" );
        Scanner scan = new Scanner(System.in);
        studentFName = scan.nextLine();
        return studentFName;
    }
    public String getStudentFName() {
        return studentFName;
    }

    public void setStudentFName(String studentFName) {
        this.studentFName = studentFName;
    }

    public String assignStudentLName(){
        System.out.println("Student Last Name:");
        Scanner scan = new Scanner(System.in);
        studentLName = scan.nextLine();
        return studentLName;
    }
    public String getStudentLName() {
        return studentLName;
    }

    public void setStudentLName(String studentLName) {
        this.studentLName = studentLName;
    }

    public int assignStudentGrade(){
        System.out.println("Student Grade:" );
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            studentGrade = scan.nextInt();
        }else{
            System.out.println("Please enter an integer value.");
            assignStudentGrade();
        }
        return studentGrade;
    }
    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentID() {
        return studentID;
    }
    public int getStudentIDNum(){
        return studentIDNum;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}