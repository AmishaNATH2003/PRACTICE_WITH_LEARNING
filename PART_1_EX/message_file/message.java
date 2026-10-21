package PART_1_EX.message_file;
import java.util.Scanner;
public class message{
    public static void main(String[] arg){
        Scanner Message = new Scanner(System.in);
        System.out.println("write a message:");
        String msg = Message.nextLine();
        System.out.println("Message is: " + msg);

    }
}
