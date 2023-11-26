import java.util.*;

public class switch2 {
    public static void main(String[] args) {
        /*Make a calculator, Take 2 numbers(a & b) from the user and an operation 
         * as follows....
         */
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator number:");
        int operator = sc.nextInt();

        switch(operator){
            case 1: System.out.println("Addition result is "+ (a+b));
            break;
            case 2: System.out.println("Subtraction result is "+ (a-b));
            break;
            case 3: System.out.println("Multiplicatuion result is " + (a*b));
            break;
            case 4: System.out.println("Division result is : " + (a/b));
            break;
            case 5: System.out.println("Remainder is : " + (a%b));
            break;
            default: System.out.println("Invalid operator, Please try again");

            sc.close();

        }

    }
}
