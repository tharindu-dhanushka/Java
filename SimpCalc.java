import java.util.Scanner;
public class SimpCalc {
    public static void main (String args[]){
        Scanner input=new Scanner(System.in);
        char sign;
        int Ans=0;
        int n1=input.nextInt();
        sign=input.next().charAt(0);
        int n2=input.nextInt();
        switch(sign){
            case '+':
            Ans=n1+n2;
            break;
            case '-':
            Ans=n1-n2;
            break;
            case '*':
            Ans=n1*n2;
            break;
            case '/':
            Ans=n1/n2;
            break;
            default:
               System.out.println("Invalid Syntax");
        }
        System.out.println(Ans);
    }
}
