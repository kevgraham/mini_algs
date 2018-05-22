package misc;

public class BinarySearch {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};

        System.out.println("Iterative");
        System.out.println(binarySearchIterative(test, 5));
        System.out.println(binarySearchIterative(test, 6));

        System.out.println("Recursive");
        System.out.println(binarySearchRecursive(test, 5));
        System.out.println(binarySearchRecursive(test, 6));


    }

    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1, mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (target > arr[mid]) {
                left = mid + 1;
            }
            else if (target < arr[mid]) {
                right = mid - 1;
            }
            else {
                return mid;
            }

        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchHelper(int[] arr, int target, int left, int right) {

        int mid = (left + right) / 2;

        if (left > right) {
            return -1;
        }
        else if (target > arr[mid]) {
            return binarySearchHelper(arr, target,mid + 1, right);
        }
        else if (target < arr[mid]) {
            return binarySearchHelper(arr, target, left, mid - 1);
        }
        else {
            return mid;
        }

    }
}
