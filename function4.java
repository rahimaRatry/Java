//make a function to find the factorial of a number.
import java.util.*;

public class function4 {
    public static void printFactorial(int n){

        if(n<0){
            System.out.println("Invalid number, please try again");
            return;
        }
    
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
            }
            System.out.println("The factorial is: "+factorial);
            return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printFactorial(n);
        sc.close();
    }
}
