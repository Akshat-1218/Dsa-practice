import java.util.*;
public class _2Darray {
    // public static void printSpiral(int matrix[][]){
    //     int startrow=0;
    //     int startcol = 0;
    //     int endrow = matrix.length-1;
    //     int endcol = matrix[0].length-1;
    //     while(startrow<=endrow && startcol<=endcol){
    //         // top
    //         for(int j=startcol;j<=endcol;j++){
    //             System.out.print(matrix[startrow][j]+" ");
    //         }
    //         // right
    //         for(int i=startrow+1;i<=endrow;i++){
    //             System.out.print(matrix[i][endcol]+" ");
    //         }
    //         // bottom
    //         for(int j=endcol-1;j>=startcol;j--){
    //             System.out.print(matrix[endrow][j]+" ");
    //         }
    //         // left
    //         for(int i=endrow-1;i>=startrow+1;i--){
    //             System.out.print(matrix[i][startcol]+" ");
    //         }
    //         startrow++;
    //         startcol++;
    //         endrow--;
    //         endcol--;
    //     }
    // }
    // public static int diagonalSum(int matrix[][]){
    //     int sum = 0;
    //     // for(int i=0;i<matrix.length;i++){
    //     //     for(int j=0;j<matrix[0].length;j++){
    //     //         if(i==j){
    //     //             sum += matrix[i][j];
    //     //         }
    //     //         else if(i+j == matrix.length-1){
    //     //             sum += matrix[i][j];
    //     //         }
    //     //     }
    //     // }

    //     for(int i=0;i<matrix.length;i++){
    //         sum += matrix[i][i];
    //         if(i != matrix.length-1-i){
    //             sum += matrix[i][matrix.length-i-1];
    //         }
    //     }
    //     return sum;
    // }
    // public static boolean  searchSortedMatrix(int matrix[][],int key){
    //     int row=0,col = matrix[0].length-1;
    //     while(row < matrix.length && col>=0){
    //         if(matrix[row][col]==key){
    //             System.out.println("found key at (" + row + "," + col + ")");
    //             return true;
    //         }
    //         else if(key < matrix[row][col]){
    //             col--;
    //         }
    //         else{
    //             row++;
    //         }
    //     }
    //     System.out.println("Key not found");
    //     return false;
    // }
    
    // practice

    public static boolean search(int matrix[][],int search){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == search){
                    return true;
                }
            }
        }
        return false;
    }
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
        for(int j=startCol;j<=endCol;j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        for(int i=startRow+1;i<=endRow;i++){
            
            System.out.print(matrix[i][endCol]+" ");
        }
        for(int j=endCol-1;j>=startCol;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }
        for(int i=endRow-1;i>=startRow+1;i--){
            if(startCol==endCol){
                break;
            }
            System.out.print(matrix[i][startCol]+" ");
            
        }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        System.out.println("");
    }
    }
    public static void diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }

    public static void stairCase(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Key found at index ("+ row + "," + col + ")");
                return;
            }
            else if(matrix[row][col]<key){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.print("Key not found");
    }
        public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // Scanner sc = new Scanner(System.in);
        // int n=matrix.length,m=matrix[0].length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        // int matrix[][] = {{10,20,30,40},
        //                   {15,25,35,45},
        //                   {27,29,37,48},
        //                   {32,33,39,50}};
        int key = 16;
        // printSpiral(matrix);
        // System.out.println(diagonalSum(matrix)+" ");
        // searchSortedMatrix(matrix, key);

        Scanner sc = new Scanner(System.in);

        // int matrix[][] = new int[3][3];
        // int key = 8;
        // int n = matrix.length, m = matrix[0].length;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println("");
        // }
        // System.out.println(search(matrix, key));

        // spiralMatrix(matrix);

        // diagonalSum(matrix);

        stairCase(matrix,key);

    }

    
    
    

}