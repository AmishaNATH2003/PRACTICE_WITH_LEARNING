//package Various Variables;
import java.util.*;
public class Various_Variables {
    public static void main(String[] arg){
        System.out.println("Chicken: ");
        Scanner chicken = new Scanner(System.in);
        int chicken_no = chicken.nextInt();
        System.out.println("Chicken: \n" + chicken_no );
        System.out.println("Bacon(kg): ");
        Scanner bacon = new Scanner(System.in);
        float bacon_kg = bacon.nextFloat();
        System.out.println("Bacon(kg): \n" + bacon_kg);
        Scanner Tractor = new Scanner(System.in);
        System.out.println("Tractor:");
        String Tractor_no = Tractor.nextLine();
        System.out.println("Tractor: \n" + Tractor_no );

        System.out.println("And finally, a summary:");
        System.out.println(chicken_no + "\n" + bacon_kg + "\n" + Tractor_no);



    }
}
