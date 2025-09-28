public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3, 6};

        System.out.println("Original:");
        printArray(arr);

        dnc.MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("After MergeSort:");
        printArray(arr);


        int[] arr2 = {10, 4, 7, 1, 3, 8, 5};
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("After QuickSort:");
        printArray(arr2);


        int k = 3;
        int kth = DeterministicSelect.select(arr2, 0, arr2.length - 1, k);
        System.out.println(k + "-th largest element: " + kth);


        ClosestPair.Point[] points = {
                new ClosestPair.Point(2, 3),
                new ClosestPair.Point(12, 30),
                new ClosestPair.Point(40, 50),
                new ClosestPair.Point(5, 1),
                new ClosestPair.Point(12, 10),
                new ClosestPair.Point(3, 4)
        };

        double minDist = ClosestPair.closestPair(points);
        System.out.println("Minimum distance between points: " + minDist);
    }

    private static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
