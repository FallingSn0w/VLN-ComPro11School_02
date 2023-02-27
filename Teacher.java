import java.util.ArrayList;
import java.util.Scanner;
public class Teacher {
    private String teacherFName;
    private String teacherLName;
    private String teacherSubject;

    Teacher(String teacherFName, String teacherLName, String teacherSubject){
        this.teacherFName = assignTeacherFName();
        this.teacherLName = assignTeacherLName();
        this.teacherSubject = assignTeacherSubject();
    }

    public String assignTeacherFName(){
        System.out.println("Please enter Teacher first name:");
        Scanner scan = new Scanner(System.in);
        teacherFName = scan.nextLine();
        return teacherFName;
    }
    public String getTeacherFName() {
        return teacherFName;
    }

    public void setTeacherFName(String teacherFName) {
        this.teacherFName = teacherFName;
    }

    public String assignTeacherLName(){
        System.out.println("Please enter Teacher last name:");
        Scanner scan = new Scanner(System.in);
        teacherLName = scan.nextLine();
        return teacherLName;
    }
    public String getTeacherLName() {
        return teacherLName;
    }

    public void setTeacherLName(String teacherLName) {
        this.teacherLName = teacherLName;
    }
    public String assignTeacherSubject(){
        System.out.println("Please enter Teacher subject:");
        Scanner scan = new Scanner(System.in);
        teacherSubject = scan.nextLine();
        return teacherSubject;
    }
    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }
}