import java.util.*;
public class Loops {
    public static void main(String args[]){
        // int counter=0;
        // while(counter<10){
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println(counter);

        // int counter = 1;
        // while(counter<=100){
        //     System.out.print(counter+" ");
        //     counter++;
        // }

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter = 1;
        // while(counter<=n){
        //     System.out.println(counter);
        //     counter++;
        // }

        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i<=n){
        //     sum = sum+i;
        //     i++;
        // }
        // System.out.println(sum);

        // For loopss 

        // for(int i=1;i<10;i++){
        //     System.out.println("Hello World!!");
        // }

        // for(int i=1;i<=4;i++){
        //     System.out.println("****");
        // }

        // int n = sc.nextInt();
        // int result = 0;
        // int rem;
        // while(n>0){
        //     rem =  n%10;
        //     result = result*10 + rem;
        //     n = n/10;
        // }
        // System.out.println(result);

        // Do while loopss

        // int counter = 1;
        // do{
        //     System.out.println("Hello World!");
        //     counter++;
        // }while(counter<=10);

        // while (true) { 
        //     System.out.println("Enter your number:- ");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         break;
        //     }
        //     else{
        //         System.out.println(n);
        //     }
        // }

        // while (true) { 
        //     System.out.print("Enter a number:- ");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         continue;
        //     }
        //     System.out.println(n);
        // }

        //  Prime number 

        int n = sc.nextInt();
        boolean isprime=true;
        if(n==2){
            System.out.println("Prime number");
        }
        for(int i=2;i<=n-1;i++){       // for(int i=2;i<)
            if(n%i==0){
                isprime = false;
            }
        }
        if(isprime==true){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
