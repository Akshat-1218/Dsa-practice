import java.util.*;
public class Conditional{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter age:- ");
        // int a = sc.nextInt();
        // if(a>=18){
        //     System.out.println("Person can drive");
        // }
        // if(a>13 && a<18){
        //     System.out.println("Teenager");
        // }
        // else{
        //     System.out.println("Cannot drive");
        // }

        // Largest of 2

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a>=b){
        //     System.out.println(a);
        // }
        // else{
        //     System.out.println(b);
        // }

        // Odd even

        // int a = sc.nextInt();
        // if(a%2==0){
        //     System.out.println(a + " is even");
        // }
        // else{
        //     System.out.println(a + " is odd");
        // }

        // income tax

        // System.out.println("Enter your income:- ");
        // int income = sc.nextInt();
        // int tax;
        // if(income<500000){
        //     tax = 0;
        // }
        // else if(income>=500000 && income<=1000000){
        //     tax = (int)(income*0.2);
        // }
        // else{
        //     tax = (int)(income*0.3);
        // }
        // System.out.println("Total tax is " + tax);

        // System.out.println("Enter number 1:- ");
        // int a = sc.nextInt();
        // System.out.println("Enter number 2:- ");
        // int b = sc.nextInt();
        // System.out.println("Enter number 3:- ");
        // int c = sc.nextInt();
        // if(a>b){
        //     if(b>c){
        //         System.out.println(a + " is largest");
        //     }
        //     else{
        //         System.out.println(c + " is largest");
        //     }
        // }
        // else{
        //     if(b>c){
        //         System.out.println(b + " is largest");
        //     }
        //     else{
        //         System.out.println(c + " is largest");
        //     }
        // }

        // pass or fail

        // float marks = sc.nextFloat();
        // if(marks>=33){
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        // float marks = sc.nextFloat();
        // String result = marks>=33?"Pass":"Fail";
        // System.out.println(result);

        // Switch statement
        
        // int number = 2;
        // switch(number){
        //     case 1:System.out.println("Samosa");break;
        //     case 2:System.out.println("Burger");break;
        //     case 3:System.out.println("Pizza");break;
        //     default:System.out.println("None");
        // }

        // calculator

        System.out.println("Enter number 1:- ");
        int a = sc.nextInt();
        System.out.println("Enter number 2:- ");
        int b = sc.nextInt();
        System.out.println("Enter operator:- ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println(a+b);break;
            case '-':System.out.println(a-b);break;
            case '*':System.out.println(a*b);break;
            case '/':System.out.println(a/b);break;
            case '%':System.out.println(a%b);break;
            default:System.out.println("enter a valid operator");break;

        }

    }
}