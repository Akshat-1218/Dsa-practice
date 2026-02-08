// public class pattern{
//     public static void hollow_rectangle(int totrows, int totcols){
//         for(int i=1;i<=totrows;i++){
//             for(int j=1;j<=totcols;j++){
//                 if(i==1 || i ==totrows || j==1 || j== totcols){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
//     public static void invertedRotatedHalfPyramid(int totrows, int totcols){
//         for(int i=1;i<=totrows;i++){
//             for(int j=1;j<=totrows-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void Inverted_rotated_numbers(int rows){
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=rows-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void FLoyds_triangle(int n){
//         int num = 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void zero_one_triangle(int r , int c){
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void butterfly(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j = 1;j<=2*(n-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void rhombus(int r){
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=r-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=r;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void hollow_rhombus(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=n;j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void number_pyramid(int n){
//         int counter = 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(counter+" ");
//             }
//             counter++;
//             System.out.println(" ");
//         }
//     }
//     public static void palindrome_pyramid(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>0;j--){
//                 System.out.print(j+"");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j+"");
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void main(String args[]){
//         // for(int i=1;i<=10;i++){
//         //     for(int j=1;j<=i;j++){
//         //         System.out.print(" * ");
//         //     }
//         //     System.out.println(" ");
//         // }

//         // inverted star pattern

//         // for(int i=1;i<=4;i++){
//         //     for(int j=1;j<=4-i+1;j++){
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println("");
//         // }

//         // half pyramid 

//         // for(int i=1;i<=4;i++){
//         //     for(int j=1;j<=i;j++){
//         //         System.out.print(j);
//         //     }
//         //     System.out.println("");
//         // }

//         // print character

//         // char a = 'A';
//         // for(int i=1;i<=4;i++){
//         //     for(int j=1;j<=i;j++){
//         //         System.out.print(a);
//         //         a++;
//         //     }
//         //     System.out.println(" ");
//         // }

//         // hollow_rectangle(10, 7);

//         // invertedRotatedHalfPyramid(8, 4);

//         // Inverted_rotated_numbers(5);

//         // FLoyds_triangle(5);

//         // zero_one_triangle(5, 4);

//         // butterfly(4);

//         // rhombus(5);

//         // hollow_rhombus(5);

//         // number_pyramid(5);

//         palindrome_pyramid(5);
//     }
// }

// again 

public class pattern{
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        hollow_rhombus(5);
    }
}