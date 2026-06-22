import java.util.*;
public class problem_1 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        double number = sc.nextDouble();
        if (number >0){
            System.out.println("number is positive");
            
        }
        else if (number == 0){
            System.out.println("the number is neutral");
        }
        else {
            System.out.println("number is negative");
        }
    }
    
}
