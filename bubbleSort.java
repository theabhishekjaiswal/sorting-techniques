import java.util.*;

public class Main {
    public static void main(String[] args) {
      int [] arr={2,0,4,8,9,1};
      bubbleSort(arr);
      for(int it: arr) System.out.print(it+" ");
  }
  
public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped)  break;
        }
    }
}
