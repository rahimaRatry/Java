 //write a java program to check if a number is prime or not.

import java.util.*;

public class primeLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");

        }
        else{
            System.out.println("It's not a prime Number");
        }
        sc.close();

    }
}
