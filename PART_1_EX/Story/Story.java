package PART_1_EX.Story;
import java.util.Scanner;
public class Story {
   public static void main(String[] arg){
    System.out.println("I will tell you a story, but I need some information first.");
    System.out.println("What is the main character called?");
    Scanner ans1 = new Scanner(System.in);
    String name = ans1.nextLine();
    System.out.println("What is their job?");
    Scanner ans2 = new Scanner(System.in);
    String job = ans2.nextLine();
    System.out.println("Here is the story: ");
    System.out.println("Once upon a time there was " + name + ", who was a " + job + ".");
    System.out.println("On the way to work, " + name + " reflected on life.");
    System.out.println("And " + name + " will be a " + job + " forever.");
   } 
}
