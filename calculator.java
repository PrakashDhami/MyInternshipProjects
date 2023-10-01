import java.util.*;
public class calculator{

    public static void main(String args[]){
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number-1 : ");
        int a = sc.nextInt();
        System.out.print("\n"); 
        System.out.print("Enter the number-2 : ");
        int b = sc.nextInt();
        System.out.print("\n");
        System.out.print("Enter The Following Option :\n 1.Addition\n2.subtraction\n3.Multiplication\n4.Division\n");
        System.out.print("\n");
        int c = sc.nextInt();
        System.out.print("\n");
        switch(c){
            case 1 :
                    result=a+b;
                    System.out.print("Addition Of Given Number is :"+result+"\n\n");
                    break;
            case 2:
                    result=a-b;
                    System.out.print("Subtraction Of Given Number is :"+result+"\n\n");
                    break;
            case 3 :
                    result=a*b;
                    System.out.print("Addition Of Given Number is :"+result+"\n\n");
                    break;
            case 4:
                    result=a/b;
                    System.out.print("Subtraction Of Given Number is :"+result+"\n\n");
                    break;
            default :
                    System.out.print("Enter The Correct Option");

        }
        
    }
}