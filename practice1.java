// class Complex{
//     int real;
//     int imag;
//     public Complex(int r,int i){
//         real = r;
//         imag = i;
//     }
//     public static Complex add(Complex a,Complex b){
//     return new Complex((a.real+b.real),(a.imag+b.imag));
// }
// public static Complex diff(Complex a,Complex b){
//     return new Complex((a.real-b.real),(a.imag-b.imag));
// }
// public static Complex product(Complex a,Complex b){
//     return new Complex((a.real*b.real),(a.imag*b.imag));
// }
// public void printComplex(){
//     if(real==0 && imag !=0){
//         System.out.println(imag+"i");
//     }
//     else if(imag==0 && real!=0){
//         System.out.println(real);
//     }
//     else{
//         System.out.println(real+"+"+imag+"i");
//     }
// }
// }
public class practice1 {
    public static void occureneces(int arr[], int i, int key) {
        if(i == arr.length) {
            return;
        }
        if(arr[i] == key){
            System.out.println(i+" ");
        }
        occureneces(arr,i+1,key);
    }
    public static int length(String str, int idx) {
    if (idx == str.length()) return 0;
    return 1 + length(str, idx + 1);
}
static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
public static void printDigits(int number){
    if(number==0){
        return;
    }
    int lastDigit = number%10;
    printDigits(number/10);
    System.out.print(digits[lastDigit]+" ");
}
public static int countSubstrs(String str,int i,int j,int n){
    if(n==1){
        return 1;
    }
    if(n<=0){
        return 0;
    }
    int res = countSubstrs(str, i+1, j, n-1)+
            countSubstrs(str, i, j-1, n-1)-
            countSubstrs(str, i+1, j-1, n-2);
            if(str.charAt(i)==str.charAt(j)){
                res++;
            }
            return res;
}
public static int MajorityElement(int[] nums){       // Brute force
    int majorityCount = nums.length/2;
    for(int i=0;i<nums.length;i++){
        int count = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==nums[i]){
                count+=1;
            }
        }
        if(count>majorityCount){
            return nums[i];
        }
    }
    return -1;
}
public static int countInRange(int nums[],int num,int lo,int hi){    // divide and conquer
    int count = 0;
    for(int i=lo;i<=hi;i++){
        if(nums[i] == num){
            count++;
        }
    }
    return count;
}
private static int MajorityElementRec(int nums[],int lo,int hi){
    if(lo==hi){
        return nums[lo];
    }
    int mid = (hi-lo)/2+lo;
    int left = MajorityElementRec(nums, lo, mid);
    int right = MajorityElementRec(nums, mid+1,hi);

    // if two halves agree on majority element
    if(left==right){
        return left;
    }
    // otherwise count element and return
    int leftCount = countInRange(nums,left,lo,hi);
    int rightCount = countInRange(nums,right,lo,hi);

    return leftCount > rightCount ? left : right;
}
public static int MajorityElement1(int[] nums){
    return MajorityElementRec(nums, 0, nums.length-1);
}
public static int getInvCount(int arr[]){
    int n = arr.length;
    int invCount = 0;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                invCount++;
            }
        }
    }
    return invCount;
}
    public static void main(String[] args){
        // Complex c = new Complex(4,5);
        // Complex d = new Complex(9,4);
        // Complex e = Complex.add(c,d);
        // Complex f = Complex.diff(c,d);
        // Complex g = Complex.product(c,d);
        // e.printComplex();
        // f.printComplex();
        // g.printComplex();

        // int arr[] = {3,2,4,5,6,2,7,2,2};     q1
        // occureneces(arr, 0, 2);

        // String str = "abcde";
        // System.out.println(length(str,0));   q3

        // printDigits(1234);         q2

        // String str = "abcab";
        // int n = str.length();
        // System.out.println(countSubstrs(str, 0, n-1, n));

        // DIVIDE AND CONQUER

        // int nums[] = {2,2,1,1,1,2,2};
        int arr[] = {1,20,6,4,5};
        // System.out.println(MajorityElement(nums));
        // System.out.println(MajorityElement1(nums));
        System.out.println("Inversion Count = "+getInvCount(arr));


    }
}