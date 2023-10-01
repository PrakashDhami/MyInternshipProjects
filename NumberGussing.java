import java.util.*;
public class NumberGussing{

    public static void main(String args[]){
    int total=0;
    //generating random number in range of 0 to 99
    Random obj = new Random();   
    Scanner sc =new Scanner(System.in);
    int a=obj.nextInt(100);
    while(true){
    System.out.print("Enter the number : \t");
    int b = sc.nextInt();
     System.out.print("\n");
    if(a==b){
        System.out.print("Your guess is correct ......!!!!!\n\n");
        System.out.print("You tried "+total+" times\n\n");
        break;
    }
    else if(a>b){
        total++;
        System.out.println("number is too low enter grater number\n\n");
    }
    else{
        total++;
        System.out.println("number is too high enter lowest number\n\n");
    }
    

   }
 }
}   