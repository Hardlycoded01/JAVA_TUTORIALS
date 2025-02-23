package conditional_statements_programs;
import java.util.Scanner;
//Program to print Grade on the basis of marks.
public class tut2_con {
    public static void main(String[] args) {
        //Object of Scanner class.
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Marks: ");
        int marks = obj.nextInt();
        if (marks >= 90)
            System.out.println("A grade");
        else if (marks >= 80)
            System.out.println("B grade");
        else if (marks >= 70)
            System.out.println("C grade");
        else if (marks >= 60)
            System.out.println("D grade");
        else
            System.out.println("E grade, study hard. ");
            //Remember to close the object.
            obj.close();
    }

}
