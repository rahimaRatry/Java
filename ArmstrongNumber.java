
package armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {

   
    public static void main(String[] args) {
       int n, c, rem, arm=0;
        System.out.println("Enter any number:");
        Scanner r= new Scanner(System.in);
        n=r.nextInt();
        c= n;
        while(n>0){
            rem = n%10;
            arm = (rem* rem* rem) + arm;
            n= n/10;
        }
        if(c == arm)
            System.out.println("The number is a Armstrong Number");
        else
            System.out.println("The number is not a Armstrong Number");
    }
    
}
