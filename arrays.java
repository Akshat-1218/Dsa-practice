



// public class arrays {
//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i] = marks[i]+1;
//         }
//     }
//     public static int linear_search(int numbers[],int key){
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static int largest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]>largest){
//                  largest = numbers[i];
//             }
//             if(numbers[i]<smallest){
//                  smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest number is = "+ smallest);
//         return largest;
//     }
//     public static int binary_search(int numbers[], int key){
//         int start = 0;
//         int end = numbers.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start = mid+1;
//             }
//             else{
//                 end = mid-1;
//             }
//         } 
//         return -1;
//     }
//     public static void reverse_array(int numbers[]){
//         int first = 0, last = numbers.length-1;
//         while(first<last){
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;
//             first++;
//             last--;
//         }
//     }
//     public static void pair(int numbers[]){
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i+1;j<numbers.length;j++){
//                 System.out.print("("+numbers[i]+","+numbers[j]+")"+" ");
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void subarray(int numbers[]){
//         int ts=0;
//          for(int i=0;i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//                 int end = j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(numbers[k]+" ");
//                 }
//                 ts++;
//                 System.out.println(" ");
//             }
//             System.out.println(" ");
//          }
//          System.out.println("total subarrays = "+ts);
//     }
//     public static void max_sum_brute_force(int numbers[]){
//         int maxsum = Integer.MIN_VALUE;
//          for(int i=0;i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//                 int end = j;
//                 int currsum=0;
//                 for(int k=start;k<=end;k++){
//                     currsum+=numbers[k];
//                 }
//                 System.out.println(currsum);
//                 if(maxsum<currsum){
//                         maxsum = currsum;
//                     }
//             }
//          }
//          System.out.println("max sum = "+maxsum);
//     }
//     public static void prefix_sum_array(int numbers[]){
//         int maxsum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
//         int currsum;
//         prefix[0] = 0;
//         for(int i=1;i<prefix.length;i++){
//             prefix[i] = prefix[i-1]+numbers[i];
//         }
//          for(int i=0;i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//                 int end = j;
//                 currsum = start==0?prefix[end]:prefix[end]-prefix[start-1];
//                 if(maxsum<currsum){
//                         maxsum = currsum;
//                     }
//             }
//          }
//          System.out.println("max sum = "+maxsum);
//     }
//     public static void kadane_max_sum(int numbers[]){
//         int maxsum = Integer.MIN_VALUE;
//         int currsum = 0;
//          for(int i=0;i<numbers.length;i++){
//             currsum+=numbers[i];
//                 if(currsum<0){
//                     currsum=0;
//                 }
//                 maxsum = Math.max(currsum,maxsum);
//             }
//          System.out.println("max sum = "+maxsum);
//     }
//     public static int trappedRainwater(int height[]){
//         int n = height.length;
//         // calculate left max boundary - array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1;i<n;i++){
//             leftMax[i] = Math.max(height[i],leftMax[i-i]);
//         }
//         // calculate right max boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMax[i] = Math.max(height[i],rightMax[i+1]);
//         }
//         int trappedWater = 0;
//         //loop
//         for(int i=0;i<n;i++){
//             //water level = min(leftmax bound,rightmax bound)
//             int waterLevel = Math.min(leftMax[i],rightMax[i]);
//             //trapped water = water level-height[i]
//             trappedWater+=waterLevel-height[i];
//         }
//         return trappedWater;
//     }
//      public static int buysellStock(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0;i<prices.length;i++){
//             if(buyPrice<prices[i]){
//                 int profit = prices[i]-buyPrice;
//                 maxProfit = Math.max(maxProfit,profit);
//             }
//             else{
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//      }
//     public static void main(String[] args) {
//         // int marks[] = new int[50];
//         // int numbers[] = {1,2,3};

//         // int marks[] = {97,98,99};
//         // update(marks);
//         // for(int i=0;i<marks.length;i++){
//         //     System.err.println(marks[i]);
//         // }

//         // linear search

//         // int numbers[] = {2,4,6,8,10,12,14,16,18,20};
//         // int key = 10;
//         // int index = linear_search(numbers, key);
//         // if(index==-1){
//         //     System.out.println("not found");
//         // }
//         // else{
//         //     System.out.println("key is at index "+ index);
//         // }

//         // largest number

//         // int numbers[] = {1,2,3,5,9};
//         // int key = 8;
//         // // int result = largest(numbers);
//         // // System.out.println("largest number is = "+result);
//         // System.out.println("index for key is " + binary_search(numbers,key));

//         // int numbers[] = {1,-2,6,-1,3};
//         // reverse_array(numbers);
//         // for(int i=0;i<numbers.length;i++){
//         //     System.out.print(numbers[i]+" ");
//         // }

//         // pair(numbers);   

//         // subarray(numbers);

//         // max_sum_brute_force(numbers);

//         // prefix_sum_array(numbers);

//         // kadane_max_sum(numbers);

//         // int height[] = {4,2,0,6,3,2,5};
//         // System.out.println(trappedRainwater(height));

//         int prices[] = {7,1,5,3,6,4};
//         System.out.println(buysellStock(prices));
//     }
// }

// revision
public class arrays{
    public static int buyandsellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        // int key =40;
        int prices[] = {7,1,5,3,6,4};
        int result = buyandsellstocks(prices);
        System.out.println(result);
        
    }
}