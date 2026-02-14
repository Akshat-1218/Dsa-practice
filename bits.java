public class bits {
    public static void oddAndeven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static int getithBit(int n,int i){
        int bitmask = 1<<i;
        if((n%bitmask)==0){
            return 0;
        }else{
        return 1;
    }}
    public static int setithBit(int n, int i){
            int bitmask = 1<<i;
            return n | bitmask;
}
public static int clearith(int n, int i){
    int bitmask = ~(1<<i);
    return n & bitmask;
}
public static int updateithBit(int n, int i, int newbit){
    n = clearith(n, i);
    int Bitmask = newbit<<i;
    return n | Bitmask;
}
public static int clearIBits(int n, int i){
    int Bitmask = (~0)<<i;
    return n & Bitmask;
}
public static int rangeBits(int n, int i,int j){
    int a =((~0)<<(j+1));
    int b = (1<<i)-1;
    int Bitmask = a | b;
    return n & Bitmask;
}
public static boolean Poweroftwo(int n){
    return (n&(n-1))==0;
}
public static int countSetBits(int n){
    int count = 0;
    while(n>0){
        if((n&1)!=0){
            count++;
        }
        n = n>>1;
    }
    return count;
}
public static int fastExpo(int a,int n){
    int ans = 1;
    while(n>0){
        if((n&1)!=0){
            ans = ans*a;
        }
        a = a*a;
        n = n>>1;
    }
    return ans;
}

// practice

public static void odd(int a){
    int bitmask = 1;
    if((a & bitmask)==0){
        System.out.print("Even");
    }
    else{
        System.out.println("Odd");
    }
}
public static int getIBit(int a,int i){
    int bitmask = 1<<i;
    if((a & bitmask)==0){
        return 0;
    }
    return 1;

}
public static int setIBit(int a,int i){
    int bitmask = 1<<i;
    return a | bitmask;
}
public static int clearIBit(int a,int i){
    int bitmask = ~(1<<i);
    return a & bitmask;
}
public static boolean powerTwo(int n){
    return (n&(n-1))==0;
}
public static void countBits(int n){
    int count = 0;
    while(n>0){
        if((n&1)!=0){
            count++;
        }
        n = n>>1;
    }
    System.out.println(count);
}
public static int fast(int a,int n){
    int ans = 1;
    while(n>0){
        if((n&1)!=0){
            ans = ans*a;
        }
        a = a*a;
        n = n>>1;
    }
    return ans;
}
    public static void main(String[] args) {
    //    System.out.println(5&6);       
    //    System.out.println(5|6);       
    //    System.out.println(5^6);       
    //    System.out.println(~5);  
    //    System.out.println(5<<2);  
    //    System.out.println(5>>2);  

       // check odd and even

    //    oddAndeven(3);           

    //    System.out.println(getithBit(5, 2));
    //    System.out.println(setithBit(5, 1));
    //    System.out.println(clearith(5, 2));
    //    System.out.println(updateithBit(10,2,1));
    //    System.out.println(clearIBits(15, 2));
    //    System.out.println(rangeBits(27, 2,5));

    // power of two

    // System.out.println(Poweroftwo(16));

    // count set bits

    // System.out.println(countSetBits(15));

    // System.out.println(fastExpo(3, 5));

    int a = 3;
    int i = 1;
    int n = 5;
    // odd(a);
    // System.out.println(getIBit(a, i));
    // System.out.println(setIBit(a, i));
    // System.out.println(clearIBit(a, i));
    // System.out.println(powerTwo(n));
    // countBits(n);
    System.out.println(fast(a, n));
 }
}
