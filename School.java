import java.util.ArrayList;
import java.util.Scanner;
public class School {
    public static String line = "====";
    public static String lineTwo = "---";

    private static String schoolName;
    private static String schoolType;
    private static int schoolRank;

    private static ArrayList<Student> studentList = new ArrayList<>();
    private static ArrayList<Teacher> teacherList = new ArrayList<>();
    private static ArrayList<String> courseList = new ArrayList<>();

    School(String schoolName, String schoolType, int schoolRank) {
        this.schoolName = assignSchoolName();
        this.schoolType = assignSchoolType();
        this.schoolRank = assignSchoolRank();
    }

    public static String assignSchoolName() {
        System.out.println("Enter School Name:");
        Scanner scan = new Scanner(System.in);
        schoolName = scan.nextLine();
        return schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public static String assignSchoolType() {
        System.out.println("Enter School Type:");
        Scanner scan = new Scanner(System.in);
        schoolType = scan.nextLine();
        return schoolType;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public static int assignSchoolRank() {
        System.out.println("Enter School Rank:");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            schoolRank = scan.nextInt();
        } else {
            System.out.println("this is not an integer value");
            assignSchoolRank();
        }
        return schoolRank;
    }

    public int getSchoolRank() {
        return schoolRank;
    }

    public void setSchoolRank(int schoolRank) {
        this.schoolRank = schoolRank;
    }


    public static void printStudentList() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("StudentID: " + studentList.get(i).getStudentID() + " - " + studentList.get(i).getStudentFName() + ", " + studentList.get(i).getStudentLName() + " - Gr" + studentList.get(i).getStudentGrade() + ".");
        }
    }

    public static void addStudents() {
        System.out.println("How many Students to add?");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                Student newStudent = new Student("", "", 0);
                studentList.add(newStudent);
                System.out.println("ADDED: " + newStudent.getStudentID() + " - " + newStudent.getStudentFName() + " " + newStudent.getStudentLName() + " Grade: " + newStudent.getStudentGrade());
                System.out.println(lineTwo.repeat(10));
            }
        } else {
            System.out.println("Please enter an integer value.");
            System.out.println(lineTwo.repeat(10));
            addStudents();
        }
    }

    public static void removeStudents() {
        printStudentList();
        System.out.println(lineTwo.repeat(10));
        System.out.println("Enter Student ID number: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int delID = scan.nextInt();
            for (int y = 0; y < studentList.size(); y++) {
                if ((studentList.get(y).getStudentID()) == delID) {
                    System.out.println("Student " + studentList.get(y).getStudentID() + " removed");
                    System.out.println(lineTwo.repeat(10));
                    studentList.remove(y);
                    printStudentList();
                }
            }
        } else {
            System.out.println("Student ID not found.");
        }
    }


    public static void printTeacherList() {
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i).getTeacherFName() + " " + teacherList.get(i).getTeacherLName() + " teaching - " + teacherList.get(i).getTeacherSubject());
        }
    }

    public static void addTeachers() {
        System.out.println("How many Teachers to add?");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                Teacher newTeacher = new Teacher("", "", "");
                teacherList.add(newTeacher);
                courseList.add(newTeacher.getTeacherSubject());
                System.out.println("ADDED: " + newTeacher.getTeacherFName() + " " + newTeacher.getTeacherLName() + " - " + newTeacher.getTeacherSubject());
                System.out.println(lineTwo.repeat(10));
            }
        } else {
            System.out.println("Please enter an integer value.");
            System.out.println(lineTwo.repeat(10));
            addTeachers();
        }
    }

    public static void removeTeachers() {
        printTeacherList();
        System.out.println(lineTwo.repeat(10));
        System.out.println("Enter Teacher First Name: ");
        Scanner scan = new Scanner(System.in);
        String delTeach = scan.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if ((teacherList.get(i).getTeacherFName()).equals(delTeach)) {
                System.out.println("REMOVED: " + teacherList.get(i).getTeacherFName() + ", " + teacherList.get(i).getTeacherLName() + " teaching - " + teacherList.get(i).getTeacherSubject());
                teacherList.remove(i);
                courseList.remove(i);
                System.out.println(lineTwo.repeat(10));
                printTeacherList();
            }
        }
    }


        public static void printCourseList() {
            for (int i = 0; i < courseList.size(); i++) {
                System.out.println(courseList.get(i) + " - taught by " + teacherList.get(i).getTeacherFName());
            }
        }

    }