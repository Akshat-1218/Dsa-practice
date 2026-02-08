

public class Recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n + " ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        // int fnm1 = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum = n + sum(n-1);
        return sum;
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibn = fibonacci(n-1)+fibonacci(n-2);
        return fibn;
        
    }
    public static boolean sorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr,i+1);
    }
    public static int first_occur(int arr[], int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return first_occur(arr, key, i+1);

    }
    public static int last_occur(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        int isFound = last_occur(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int xToN(int num,int pow){
        if(pow==1){
            return num;
        }
        return num * xToN(num, pow-1);
    }
    public static int xToN_Optimised(int num, int pow){
        if(pow==1){
            return num;
        }
        // int halfPower = xToN_Optimised(num, pow/2)*xToN_Optimised(num, pow/2);
        int halfPower = xToN_Optimised(num, pow/2);
        int halfPowerSqr = halfPower*halfPower;
        if(pow%2!=0){
            halfPowerSqr = num*halfPowerSqr;
        }
        return halfPowerSqr;
    }
    public static int tiling_problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int nm1 = tiling_problem(n-1);
        int nm2 = tiling_problem(n-2);
        int totalways = nm1 + nm2;
        return totalways;
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static int friends_pairing_problem(int n){
        if(n==1 || n==2){
            return n;
        }
        // int fnm1 = friends_pairing_problem(n-1);
        // int fnm2 = friends_pairing_problem(n-2);
        // int pairways = (n-1)*fnm2;
        // int totalways = fnm1 + pairways;
        // return totalways;
        return friends_pairing_problem(n-1) + (n-1)*friends_pairing_problem(n-2);
    }
    public static void printBinaryStrings(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        // print numbers in decreasing order
        // int n = 25;
        // printDec(n);

        // printInc(n);

        // System.out.println(factorial(5));
        
        // System.out.println(sum(5));

        // System.out.println(fibonacci(n));

        // int arr[] = {1,2,3,4,5,4,3,7,8,9,4,3,4};
        // System.out.println(sorted(arr, 0));

        // System.out.println(first_occur(arr, 4, 0));

        // System.out.println(last_occur(arr, 3, 0));

        // System.out.println(xToN(2, 10));

        // System.out.println(xToN_Optimised(2, 10));

        // System.out.println(tiling_problem(3));

        // removeDuplicates("appnaacollege", 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friends_pairing_problem(3));/

        printBinaryStrings(3, 0, "");

    }
}