//import Scanner class

import java.util.Scanner;
class input_tut3 {
public static void main(String[] args) {
    //create object of Scanner class
    Scanner obj = new Scanner(System.in);
    //output line
    System.out.print("Enter the Number: ");
    int num = obj.nextInt();
    //use num
    System.out.println("The Number entered: "+num);
    //close Scanner Object
    obj.close();
    }
}