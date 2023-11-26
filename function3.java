import java.util.Scanner;

public class function3 {
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
       
        System.out.println("The product of 2 numbers is: "+calculateProduct(a, b));
        sc.close();

    }
}
