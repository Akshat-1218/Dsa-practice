public class divideandconquer {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] =arr[i++];
        }
        while(j<=ei){
            temp[k++] =arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx = partition(arr,si,ei);
        quicksort(arr, si, pidx-1);
        quicksort(arr, pidx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;
    }
    public static int search(int arr[],int tar,int si,int ei){
        int mid = si+(ei-si)/2;
        if(si>ei){
            return -1;
        }
        // case found
        if (arr[mid]==tar){
            return mid;
        }
        // mid on l1
        if(arr[si]<=arr[mid]){
            // case a:left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        // mid on l2
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static int searchIteration(int arr[],int tar,int si,int ei){
        int mid = si + (ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[si]<=tar && tar<= arr[mid-1]){
            for(int i=si;i<mid;i++){
                if(tar==arr[i]){
                    return i;
                }
            }
        }
        else{
            for(int i=mid+1;i<=ei;i++){
                if(tar==arr[i]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        // mergeSort(arr, 0, arr.length-1);

        // quicksort(arr,0,arr.length-1);
        // printArray(arr);

        int target = 0;
        int taridx = search(arr, target, 0, arr.length-1);
        int targidx = searchIteration(arr, target, 0, arr.length-1);
        System.out.println(taridx);
        System.out.println(targidx);
}
}