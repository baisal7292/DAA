public class DeterministicSelect {

    public static int select(int[] arr, int left, int right, int k) {
        if (left == right) return arr[left];

        int pivotIndex = partition(arr, left, right);
        int length = pivotIndex - left + 1;

        if (k == length) return arr[pivotIndex];
        else if (k < length) return select(arr, left, pivotIndex - 1, k);
        else return select(arr, pivotIndex + 1, right, k - length);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
