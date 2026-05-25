public class QuickSort {

    // Method to perform Quick Sort
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {

            // Find partition index
            int pivotIndex = partition(prices, low, high);

            // Sort left side
            quickSort(prices, low, pivotIndex - 1);

            // Sort right side
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    public static int partition(int[] prices, int low, int high) {

        // Choosing last element as pivot
        int pivot = prices[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (prices[j] < pivot) {
                i++;

                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}
