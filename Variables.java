import java.util.*;
public class Variables{
    public static void main(String[] args) {

        // System.out.print("Hello World!!\n");
        // System.out.println("Hello World!!");
        // System.out.println("Hello World!!");

        // Sum of a and b

        // int a=10;
        // int b=20;
        // int sum = a+b;
        // System.out.println(sum);

        // Input in java 

        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String name1 = sc.nextLine();
        // int age = sc.nextInt();
        // System.out.println(name);
        // System.out.println(name1);
        // System.out.println(age);

        // System.out.println("Enter number 1:-");
        // int a = sc.nextInt();
        // System.out.println("Enter number 2:-");
        // int b = sc.nextInt();
        // System.out.println("Sum is "+ (a+b));
        // System.out.println("Product is "+a*b);

        System.out.println("Enter the radius:- ");
        int radius = sc.nextInt();
        float area = 3.14F*radius*radius;
        System.out.println("Radius is "+ area);
    }
}