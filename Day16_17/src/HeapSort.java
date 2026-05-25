public class HeapSort {
    public static void heapSort(int[] salaries)
    {
        int n = salaries.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {

            // Move root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    private static void heapify(int[] arr, int size, int root) {

        int largest = root;

        int left = 2 * root + 1;
        int right = 2 * root + 2;

        // Left child larger
        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        // Right child larger
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        // Swap and recurse
        if (largest != root) {

            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }
}
