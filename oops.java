public class oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Black");
        // System.out.println(p1.getColor());
        // p1.setTip(5);


        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());

        // BankAccount ba = new BankAccount();
        // ba.username = "akshatpandey";
        // ba.setPassword("abcj");
        // System.out.println(ba.password);    we cant acces this as this is private

        // Student s1 = new Student();,
        // Student s2 = new Student("Akshat");
        // Student s3 = new Student(12);
        // s1.roll = 12;
        // s1.password = "abcd";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;
        // Student s2 = new Student(s1);
        // s2.password =  "xyz";
        // s1.marks[2] = 100;
        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }


        // inheritance

        // Fish shark = new Fish();
        // shark.eat();

        // dog dobby = new dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // sum s = new sum();
        // System.out.println(s.sum(1,2));
        // System.out.println(s.sum((float)0.1,(float)2.99 ));
        // System.out.println(s.sum(1,2,3));

        // dog d = new dog();
        // d.eat();

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // chicken c = new chicken();
        // c.eat();
        // c.walk();

        // Animal a = new Animal();     error due to abstraction

        // Mustang m = new Mustang();

        // queen q = new queen();
        // q.moves();
    }
}

// interface

// interface ChessPlayer{
//     void moves();
// }
// class queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal");
//     }
// }
// class rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }
// }
// class king implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal(by one move)");
//     }
// }
// abstraction
// abstract class Animal{
//     Animal(){
//         System.out.println("Animal constructor called");
//     }
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor called");
//     }
//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang constructor called");
//     }
// }
// class chicken extends Animal{
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
// method overriding
// class Animal{
//     void eat(){
//         System.out.println("Animals eats");
//     }
// }
// class dog extends Animal{
//     void eat(){
//         System.out.println("Dog eats");
//     }
// }
// // method overloading
// class sum{
//     int sum(int a,int b){
//         return a+b;
//     }
//     float sum(float a,float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
// }
// base class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// class Mammals extends Animal{
//     int legs;
// }
// class dog extends Mammals{
//     String breed;
// }

// // derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }
// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pass){
//         password = pass;
//     }
// }
// class Pen{
//     private String color;
//     private int tip;

//     void setColor(String newcolor){
//         color = newcolor;
//     }
//     void setTip(int newTip){
//         tip = newTip;
//     }
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
    
// }
// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];


    // shallow copy
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     for(int i=0;i<marks.length;i++){
    //         this.marks[i] = s1.marks[i];
    //     }
    // }

    // Student(){
    //     marks = new int[3];
    //     System.out.println("Constructor is called...");
    // }
    // Student(String name){
    //     marks = new int[3];
    //     this.name= name;
    // }
    // Student(int age){
    //     marks = new int[3];
    //     this.roll= age;
    // }
    // void calculatePercentage(int phy,int chem,int maths){
    //     percentage = (phy+chem+maths)/3;
    // }
// }