import java.util.ArrayList;
import java.util.Scanner;

public class MergSort {
    
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

         mergeSort(arr, 0, n-1);

        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
        
    }

    // time complexity O(nlogn)

    public static void mergeSort(int [] a, int low, int high){
        
        if(low == high) return;

        int mid = (low+high)/2;

        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a,low,mid,high);
    }

    public static void merge(int []a, int low , int mid , int high){

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right= mid+1;


        while (left<= mid && right <= high) {

            if(a[left]<a[right]){

                temp.add(a[left]);
                left++;
            }
            else{
                temp.add(a[right]);
                right++;
            }
            
        }

        while (left<=mid) {

            temp.add(a[left]);
            left++;
            
        }

        while (right<=high) {
            temp.add(a[right]);
            right++;

            
        }


        for(int i=low; i<=high;i++){
            a[i] = temp.get(i-low);
        }




    }





}
