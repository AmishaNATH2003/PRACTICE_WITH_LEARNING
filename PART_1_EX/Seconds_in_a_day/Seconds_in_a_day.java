package PART_1_EX.Seconds_in_a_day;
import java.util.*;

public class Seconds_in_a_day {
    public static void main(String[] arg){
        System.out.println("Enter the number of days: ");
        Scanner scanner = new Scanner(System.in);
        int days = Integer.valueOf(scanner.nextInt()); 
        int seconds = days * 24 * 60 * 60;
        System.out.println("number of second in days: " + seconds);
    }    
}
