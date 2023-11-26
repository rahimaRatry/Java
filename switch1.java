import java.util.*;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("press any button: ");
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Hii");
            break;
            case 3 : System.out.println("Assalamu Alaikum");
            break;
            default : System.out.println("Invalid button, Please try again");
            
            sc.close();
        }
    }
    
}
