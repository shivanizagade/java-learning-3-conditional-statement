import java.util.*;
public class problem_2 {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature:");

        double temp = sc.nextDouble();

        if(temp>=100){
            System.out.println("you have a fewer");

        }
        else{
            System.out.println("you don't have a fewer ");
        }
    }
    
}
