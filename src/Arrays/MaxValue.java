package Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 32, 9, 18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 3, 4));
    }

    // imagine arr is not empty
    static int max(int[] arr) {
        int maxVal = arr[0]; // if arr is empty then in place of arr[0], apply Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start]; // if arr is empty then in place of arr[0], apply Integer.MIN_VALUE
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
