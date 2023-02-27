import java.util.Scanner;

public class Main {
    public static String line = "=====";
    public static void main(String[] args) {
        School newSchool = new School(null,null,0);
        System.out.println("\n--=="+newSchool.getSchoolType()+" school "+newSchool.getSchoolName()+" ranked "+newSchool.getSchoolRank()+".==--");
        menu();
    }
    public static void menu(){
        String input = "";
        System.out.println(line.repeat(10));
        System.out.println("To add Students type \"AS\"");
        System.out.println("To add Teachers type \"AT\"");
        System.out.println("To Remove Students type \"RS\"");
        System.out.println("To remove Students type \"RT\"");
        System.out.println("To print course list type \"CL\"");
        System.out.println("To print Teacher List type \"TL\"");
        System.out.println("To print Student List type \"SL\"");
        System.out.println(line.repeat(10));
        System.out.println("Action: ");
        Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            switch (input) {
                case "AS":
                    School.addStudents();
                    break;
                case "AT":
                    School.addTeachers();
                    break;
                case "RS":
                    School.removeStudents();
                    break;
                case "RT":
                    School.removeTeachers();
                    break;
                case "SL":
                    School.printStudentList();
                    break;
                case "TL":
                    School.printTeacherList();
                    break;
                case "CL":
                    School.printCourseList();
                    break;
                default:
                    System.out.println("Unrecognized input, please try again.");
                    menu();

            }
        menu();
    }
}