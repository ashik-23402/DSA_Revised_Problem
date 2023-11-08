import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        leftrotate(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        
    }

    //left rotate the array by 1 place

    public static void leftrotate(int [] arr){

        int temp = arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;

    }
}
