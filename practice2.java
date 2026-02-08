import java.util.*;
public class practice2{
    public static void main(String args[]){

        // functions and methods

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first number:- ");
        // double a = sc.nextInt();
        // System.out.println("Enter the first number:- ");
        // double b = sc.nextInt();
        // System.out.println("Enter the first number:- ");
        // double c = sc.nextInt();

        // double avg = (a+b+c)/3;
        // System.out.println("Average of three numbers is "+avg);

        // System.out.print("Enter a number:- ");
        // int n = sc.nextInt();
        // boolean result = isEven(n);
        // if(result){
        //     System.out.println(n + " is even");
        // }
        // else{
        //     System.out.println(n + " is odd");
        // }

        // System.out.println("Enter a number:- ");
        // int n = sc.nextInt();
        // int result = n;
        // int ans = 0;
        // while(n>0){
        //     int rem = n%10;
        //     ans = ans*10+rem;
        //     n = n/10;
        // }
        // if(result==ans){
        //     System.out.println("Number is palindrome "+result);
        // }
        // else{
        //     System.out.println("Number is not a palindrome "+result);
        // }

        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n/=10;
        }
        System.out.println("Sum of digits is:- "+sum);
    }
        // public static boolean isEven(int n){
        // if(n%2==0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        // }
}
