
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    //O(n) , O(1) best case
    public static int search(int arr[], int x) {
        int n = arr.length;


        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
