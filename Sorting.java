import java.util.Scanner;

public class Sorting {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        insertionSort(arr, n);

        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
        
    }



    //time complexity O(n^2)
    public static void selection_sort(int []arr,int n){


        for(int i=0;i<n-1;i++){
            int min = i;

            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]) min=j;
            }

            swap(arr, i, min);
        }

    }



    //time complexity O(n^2) in best case O(n)
    public static void bubbleSort(int []a, int n){

        for(int i=n-1;i>=0;i--){

            int didswap = 0;
            for(int j=0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    didswap=1; 
                }
            }

            if(didswap==0)break;
        }
    }



    // time complexity O(n^2) best case O(n)
    public static void insertionSort(int[]a, int n){

        for(int i=0;i<n;i++){
            int j=i;

            while (j>0 && a[j]<a[j-1]) {
                swap(a, j, j-1);
                j--;
            }
        }
    }







    public static void swap(int []a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
