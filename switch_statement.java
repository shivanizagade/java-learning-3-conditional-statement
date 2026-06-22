/*
in switch if one statement is true then all statement below it start to become true to avoid this we need to 
break the statement*/
import java.util.*;
public class switch_statement  {
    public static void main (String args[]){
     Scanner sc= new Scanner (System.in);
     int button = sc.nextInt();

     switch(button){
        case 1: System.out.println("Samosa");
                 break;
        case 2:System.out.println("burger");
                 break;
        case 3 :System.out.println("Mangoshake");
                 break;
        default :System.out.println(" you are in dream.");
     }

     

    }
    
}
