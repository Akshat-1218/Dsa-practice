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

        // System.out.println("Enter a number:- ");
        // int n = sc.nextInt();
        // int sum = 0;
        // while(n>0){
        //     int rem = n%10;
        //     sum = sum+rem;
        //     n/=10;
        // }
        // System.out.println("Sum of digits is:- "+sum);


        int nums[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(nums);
        // selectionSort(nums);
        // insertionSort(nums);
        countingSort(nums);
        printArr(nums);
        // System.out.println(containsDuplicate(nums));

        
    }
        // public static boolean isEven(int n){
        // if(n%2==0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        // }
    // public static boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=1;i<nums.length;i++){
            
    //             if(nums[i]==nums[i-1]){
    //             return true;
    //             }    
    //     }
    //     return false;
    // }

    // public static void prefix_sum_array(int numbers[]){
    //     int maxsum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];
    //     int currsum;
    //     prefix[0] = numbers[0];
    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i] = prefix[i-1]+numbers[i];
    //     }
    //      for(int i=0;i<numbers.length;i++){
    //         int start = i;
    //         for(int j=i;j<numbers.length;j++){
    //             int end = j;
    //             currsum = start==0?prefix[end]:prefix[end]-prefix[start-1];
    //             if(maxsum<currsum){
    //                     maxsum = currsum;
    //                 }
    //         }
    //     }
    // }

    // sorting

    // public static void bubbleSort(int nums[]){
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i;j<nums.length;j++){
    //             if(nums[i]<nums[j]){
    //                 int temp = nums[j];
    //                 nums[j] = nums[i];
    //                 nums[i] = temp;
    //             }
    //         }
    //     }
    // }

    // public static void selectionSort(int nums[]){
    //     for(int i=0;i<nums.length;i++){
    //         int largest = i;
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[largest] < nums[j]){
    //                 largest = j;
    //             }
    //         }
    //         int temp = nums[largest];
    //         nums[largest ]= nums[i];
    //         nums[i] = temp;
    //     }
    // }

    // public static void insertionSort(int nums[]){
    //     for(int i=1;i<nums.length;i++){
    //         int curr = nums[i];
    //         int prev = i-1;
    //         while(prev>=0 && nums[prev]<curr){
    //             nums[prev+1] = nums[prev];
    //             prev--;
    //         }
    //         nums[prev+1] = curr;
    //     }
    // }

    public static void countingSort(int nums[]){
        int larg = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(larg<nums[i]){
                larg = nums[i];
            }
        }
        int count[] = new int[larg+1];
        for(int i=0;i<nums.length;i++){            
                count[nums[i]]++;            
        }
        int j = 0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println("");
    }
}
