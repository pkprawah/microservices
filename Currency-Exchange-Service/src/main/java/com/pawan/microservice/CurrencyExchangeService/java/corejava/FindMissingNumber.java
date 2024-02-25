package corejava;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;

        // Function call
        findMissing(arr, n);
    }

    public static void findMissing(int arr[], int size)
    {
        int i;

        for (i = 0; i < size; i++) {
            if (Math.abs(arr[i]) - 1 == size) {
                continue;
            }
            int ind = Math.abs(arr[i]) - 1;
            arr[ind] *= -1;
        }

        int ans = size + 1;
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }

}
