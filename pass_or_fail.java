import java.util.*;
public class pass_or_fail {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int marks=sc.nextInt();

        if (marks>=35){
            System.out.println("congratulation you are pass!");

        }
        else{
            System.out.println("sorry you are failed,try next time");
        }
       } 
    
}
