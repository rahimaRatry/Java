package pkg1st;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
         int n, count=0;
        System.out.println("Enter any number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count ++ ;
            }
        }
        if(count==2)
            System.out.println("It is a Prime Number");
        else
            System.out.println("It is not a Prime Number");
    }
}
