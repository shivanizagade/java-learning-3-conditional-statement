public class else_if {
    public static void main(String args[]){

        int age= 19;
        if (age>=18){
            System .out.println("you are an adult");

        }
        else if ( age>=13&&age<=18){
            System.out.println("you are teenager" );

        }
        else{
            System.out.println("you are child");
        }
    }
    
}
