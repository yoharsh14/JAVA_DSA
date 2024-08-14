package CodeVita;
public class Caesar {

    // Find the maximum sum in array A that includes the midpoint
    public static int FMCSACA(int[] A, int low, int mid, int high) {

        // Gather the total # of elements on the left side of the midpoint
        int total = 0;
        int left = Integer.MIN_VALUE;
        for (int i = mid; i >= low; i--) {
            total = total + A[i];
            if (total > left) {
                left = total;
            }
        }

        // Gather the total # of elements on the right side of the midpoint
        total = 0;
        int right = Integer.MIN_VALUE;
        for (int i = mid; i <= high; i++) {
            total = total + A[i];
            if (total > right) {
                right = total;
            }
        }

        // Return the sum of the left side and right side of the midpoint
        return Math.max(left + right - A[mid], Math.max(left, right));
    }

    // Retrieve the sum of the maximum sub array
    public static int FMSACA(int[] A, int low, int high) {
        // If low > high return the minimum value
        if (low > high) {
            return Integer.MIN_VALUE;
        }

        // Find the midpoint
        int mid = (low + high) / 2;

        // Return the three possible cases:
        // 1) Retrieve the maximum sum in the left side of the midpoint
        // 2) Retrieve the maximum sum in the right side of the midpoint
        // 3) Retrieve the maximum sum in the midpoint
        return Math.max(Math.max(FMSACA(A,low,mid-1), FMSACA(A,mid+1,high)), FMCSACA(A,low,mid,high));
    }
    public static void main(String[] args) {

        // Create an array to calculate the maximum sum of the sub array
        int[] A = {10,2,15,5,19};
        int num = A.length;
        int maximumSum = FMSACA(A, 0, num - 1);

        // Print the maximum sum of the sub array
        System.out.println("Maximum sum of the sub array is: " + maximumSum);
    }
}