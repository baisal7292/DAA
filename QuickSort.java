import java.util.Random;

public class QuickSort {
    private static final Random rand = new Random();

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivotIndex = low + rand.nextInt(high - low + 1);
        int pivot = arr[pivotIndex];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                swap(arr, i, j);
                i++; j--;
            }
        }

        if (low < j) quickSort(arr, low, j);
        if (i < high) quickSort(arr, i, high);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
