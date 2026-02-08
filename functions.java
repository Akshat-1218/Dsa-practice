
public class functions{
    public static void print_hello(){
        System.out.println("Hello World");        
        System.out.println("Hello World");        
        System.out.println("Hello World");        
        System.out.println("Hello World");        
        System.out.println("Hello World");        
        System.out.println("Hello World");        
        System.out.println("Hello World");        
    }
    public static void calculateSum(int a, int b){
        
        int sum = a+b;
        System.out.println("Sum is "+ sum);
    }
    public static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        
        
    }
    public static int pro(int a,int b){
        return a*b;
    }
    public static int factorial(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int binomial(int n,int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n-r);
        int ans = nfact / (rfact*nrfact);
        return ans;
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n==2){
            return isPrime;
        }
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }
    public static boolean isPrimeoptimised(int n){
        if(n==2){
            return true;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void Primerange(int n){
    for(int i = 2;i<=n;i++){
        if(isPrime(i)){
            System.out.print(i + " ");
        }
    }
}
    public static void binarytodecimal(int n){
        int pow = 0;
        int dec = 0;
        int mynum = n;
        while(n>0){
            int ld = n%10;
            dec = dec+(ld*(int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("Decimal of "+ mynum + " = "+ dec);
    }
    public static void decimaltobinary(int n){
        int result = 0;
        int rem;
        int pow = 0;
        while(n>0){
            rem = n%2;
            n = n/2;
            result = result + rem*(int)Math.pow(10,pow);
            pow++;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        // print_hello();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculateSum(a,b);

        // int a = 10;
        // int b= 5;
        // swap(a,b);

        // System.out.println("Value of a is:- "+a);
        // System.out.println("Value of b is:- "+b);

        // int a=5;
        // int b=10;
        // int result = pro(a,b);
        // System.out.println("Multiply of a and b is "+result);

        // int a = 5;
        // int result = factorial(a);
        // System.out.println("Factorial of a is "+result);

        // System.out.println(binomial(5, 2));    // binomial coefficient

        // boolean result = isPrime(2);   prime number
        // System.out.println(result);

        // System.out.println(isPrimeoptimised(2));

        // Primerange(20);

        // binarytodecimal(111);      binarytodecimal

        decimaltobinary(7);
        
    }
}