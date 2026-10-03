
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //O (log n) best case o(1)
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int result = runBinarySearchIteratively(arr, 16, 0, arr.length - 1);
        System.out.println("Index of 16: " + result);
    }


}
