package PART_1_EX.Conversation_file;
import java.util.Scanner;
public class Conversation {
    public static void main(String[] arg){
        System.out.println("Greetings! How are you doing?");
        Scanner input1 = new Scanner(System.in);
        String msg1 = input1.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        Scanner input2 = new Scanner(System.in);
        String msg2 = input2.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
