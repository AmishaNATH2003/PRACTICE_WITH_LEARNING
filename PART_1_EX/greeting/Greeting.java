package PART_1_EX.greeting;
import java.util.Scanner;
public class Greeting {
    public static void main(String [] arg){
        Scanner name = new Scanner(System.in);
        System.out.println("What's your name? ");
        String msg = name.nextLine();
        System.out.println("Hi " + msg);
    }
    
}
