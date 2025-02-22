import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        
        Scanner obj =new Scanner(System.in);
        
        int check=0;
        
        System.out.print("Enter the Number to check: ");
        int num=obj.nextInt();
        
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                System.out.println("Not a prime Number.");
                check=1;
                break;
                    }
                else
                    continue;
                        }
        if (check==0)  
                System.out.println("It is a Prime number.");
                obj.close();
    }
}