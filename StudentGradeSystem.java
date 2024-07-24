
import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[]args) {
        System.out.println("!Student Grade Calculator");
        Scanner sc = new Scanner(System.in);
        // OM is Obtained marks,TM is total marks,& AP is Average percentage
        System.out.println("Enter the obtained marks:");
        int OM = sc.nextInt();
        System.out.println("Enter the total marks:");
        int TM = sc.nextInt();
        double AP = (double) OM / TM * 100;
        String Grade;
        if (AP >= 95) {
            Grade = "O";
        }
        else if (AP >= 85) {
            Grade = "A";
        }
        else if (AP >= 75) {
        Grade = "B";
    }
        else if (AP>=65) {
            Grade="C";
        }
        else if (AP>=55) {
            Grade = "D";
        } else if (AP>=45) {
            Grade = "E";
        }
        else {
            Grade = "F";
        }
        sc.close();
        System.out.println("Percentage is"+AP);
        System.out.println("Grade is"+Grade);

    }
}
