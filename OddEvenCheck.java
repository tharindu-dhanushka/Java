import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        if(number % 2==1){
            System.out.println("This is an odd number.");
        }else{
            System.out.println("This is an even number.");
        }
    }
}
