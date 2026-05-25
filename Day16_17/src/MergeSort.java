public class MergeSort {
    public static void mergeSort(Book[] books, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(books, left, mid);
            mergeSort(books, mid + 1, right);

            merge(books, left, mid, right);
        }
    }

    private static void merge(Book[] books, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Book[] leftArr = new Book[n1];
        Book[] rightArr = new Book[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = books[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = books[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge back into books[]
        while (i < n1 && j < n2) {
            if (leftArr[i].price <= rightArr[j].price) {
                books[k++] = leftArr[i++];
            } else {
                books[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            books[k++] = leftArr[i++];
        }
        while (j < n2) {
            books[k++] = rightArr[j++];
        }
    }
}
