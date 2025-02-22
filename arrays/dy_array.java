import java.util.Scanner;
public class dy_array{  
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
            
            System.out.println("Enter the size of the Array: ");
            int size=obj.nextInt();
                   
            int mat[]=new int[size];
            for(int i=0;i<size;i++){
                System.out.print("Enter the Element at Index "+i+": ");
                mat[i]=obj.nextInt();
            }
        System.out.print("[ ");
        for(int i:mat){
            System.out.print(i);
            System.out.print(" ");
        }   
        System.out.println("]");
    obj.close();
    }
}
