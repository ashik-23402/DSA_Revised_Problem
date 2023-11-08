import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quickSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        qs(arr, 0, n - 1);

        System.out.println(arr);

    }

    static int Partition(List<Integer> arr, int low, int high) {

        int pivot = arr.get(low);

        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }
            while (arr.get(j) > pivot && j >= low + 1) {
                j--;

            }

            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);

        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {

        if (low < high) {
            int pIndex = Partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }

    }
}
