import java.util.*;
public class practice{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void palindrome(int n){
        int oldnum = n;
        int rem;
        int result = 0;
        while(n>0){
            rem = n%10;
            result = result*10+rem;
            n = n/10;
        }
        if(oldnum==result){
            System.out.println("number is Palindrome");
        }    
        else{
            System.out.println("number is not Palindrome");
        }
    }
    public static void sumofnum(int n){
        int rem;
        int sum=0;
        while(n>0){
            rem = n%10;
            sum = sum + rem;
            n=n/10;
        }
        System.out.println("Sum of digits of a number is "+sum);
    }
    public static void bubblesort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void Selectionsort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int maxpos = i;
            for(int j=i+1;j<n;j++){
                if(arr[maxpos]<arr[j]){
                    maxpos = j;
                }
                int temp = arr[i];
                arr[i] = arr[maxpos];
                arr[maxpos] = temp;
            }
        }
    }
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1; 
            while(prev>0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
             arr[prev+1] = curr;
        }
    }
    public static void countingSort(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int count[] = new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]<0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void number_7(int number[][]){
        int count = 0;
        int n = number.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<number[0].length;j++){
                if(number[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Number of 7 in 2d array are "+count);
    }
    public static void sum_in_second_row(int number[][]){
        int sum = 0;
            for(int j=0;j<number[0].length;j++){
                sum = sum + number[1][j];
            }
        System.out.println("Sum is "+sum);
    }
    public static void printMatrix(int matrix[][]){
        System.out.println("The matrix is:- ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
    public static int countLowercase(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    // anagrams of string


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter side of a square- ");
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println("Area of square is "+ area);

        // for(int i=0;i<5;i++){
        //     System.out.println("Hello");
        //     i+=2;
        // }

        // System.out.println("Enter the number of integers you want to read:- ");
        // int n = sc.nextInt();
        // int sume=0;
        // int sumo=0;
        // while(n>0){
        //    int i = sc.nextInt();
            
        // if(n%2==0){
        //     sume = sume +1;
        // }
        // else{
        //     sumo=sumo+1;
        // }
        // n--;
        // }
        
        // System.out.println("Sum of even integers "+sume);
        // System.out.println("Sum of odd integers "+sumo);

        // int fact=1;
        // System.out.println("Enter the number:- ");
        // int n = sc.nextInt();
        // while(n>0){
        //     fact = fact*n;
        //     n--;
        // }
        // System.out.println("Factorial is "+ fact);


        // int n = sc.nextInt();
        // for(int i = 1;i<=10;i++){
        //     System.out.println(n+"*"+i+"="+n*i);
        // }

        // int a = 5;    average of three number
        // int b = 6;
        // int c = 7;
        // int avg = (a+b+c)/3;
        // System.out.println(avg);

        // System.out.println(isEven(6));  

        // palindrome(12521);

        // sumofnum(4554);

        // int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubblesort(arr);
        // printarr(arr);
        // Selectionsort(arr);
        // printarr(arr);
        // insertionSort(arr);
        // printarr(arr);
        // countingSort(arr);
        // printarr(arr);

        // 2d array

        // int number[][] = {{1,4,9},{11,4,3},{2,2,3}};
        // // number_7(number);
        // sum_in_second_row(number);
        // int row=2,col = 3;
        // int[][] matrix = {{2,3,7},{5,6,7}};
        // printMatrix(matrix);
        // int[][] transpose = new int[col][row];
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         transpose[j][i] = matrix[i][j];
        //     }
        // }
        // printMatrix(transpose);

        // string

    //    String str = sc.nextLine();
    //    System.out.println(countLowercase(str));

    // String str1 = "earth";
    // String str2 = "heart";
    // str1 = str1.toLowerCase();
    // str2 = str2.toLowerCase();

    // if(str1.length() == str2.length()){
    //     char[] str1charArray = str1.toCharArray();
    //     char[] str2charArray = str2.toCharArray();

    //     Arrays.sort(str1charArray);
    //     Arrays.sort(str2charArray);

    //     boolean result = Arrays.equals(str1charArray, str2charArray);
    //     if(result){
    //         System.out.println(str1 + " and "+str2 + " are anagrams of each other");
    //     }
    //     else{
    //         System.out.println(str1 + " and "+str2 + " are not anagrams of each other");

    //     }
    // }
    // else{
    //     System.out.println(str1+ " and "+str2 +" are not anagrams of each other");
    // }

    // Bit manipulation

    System.out.println(2^2);

    for(char ch='A';ch<='Z';ch++){
        System.out.println((char)(ch | ' '));
    }

    int a = 3,b=4;
    System.out.println("Before swapping a= "+a+" b= "+b);
    a = a^b;
    b = a^b;
    a = a^b;
    System.out.println("After swapping a= "+a+" b= "+b);

}}  