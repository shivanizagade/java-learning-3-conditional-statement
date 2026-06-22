import java.util.*;
public class income_tax_calculator {
    public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    int number = sc.nextInt();
     
    if (number<500000){
        System.out.println(" your tax is 0% ");

    
    }
else if(number>=500000&& number<1000000){
    double tax = (int) (number*0.2);
    System.out.println("your tax is 20%,your tax on your income is:" +tax);
}
else {
    double tax = (int)(number*0.3);
    System.out.println("your tax is 30%, your tax is:"+tax);
}
    }
    
}
