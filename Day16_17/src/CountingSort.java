public class CountingSort {
    public static void countSort(int[] ages) {
        int maxAge = 18;

        int[] count = new int[maxAge + 1];

        // Store frequency
        for (int age : ages) {
            count[age]++;
        }

        // Cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[ages.length];

        // Place elements in correct position
        for (int i = ages.length - 1; i >= 0; i--) {

            output[count[ages[i]] - 1] = ages[i];

            count[ages[i]]--;
        }

        // Copy back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }
}