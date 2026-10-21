package PART_1_EX.message_three_time;
import java.util.Scanner;
public class MESSAGE_THREE_TIME {
    public static void main(String[] arg){
        Scanner message1 = new Scanner(System.in);
        System.out.println("Write a message:");
        String msg = message1.nextLine();
        for(int i =0; i< 3; i++){
            
            System.out.println("message is : " + msg);
        }

    }
    
}
