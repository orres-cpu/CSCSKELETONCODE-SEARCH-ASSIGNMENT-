
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    if ( n < 2 )
    {
        return 0;
    }

    //Space O(n)//ONLY INPUT
    boolean[] composite = new boolean[ n + 1 ];

    for (int i = 2; (long) i * i <= n; i++) // goes up to sqrtn
    {
        if (!composite[i])
        {
            for (int j = i * i; j <= n; j += i) // runs n / i
            {
              composite[j] = true;
            }
        }
    }

    long sum = 0;
    for (int i = 2; i <= n; i++)
    {
        if (!composite[i])
        {
            sum += i;
        }
    }
    return sum;
    }
    //Time : O(N LOG LOG N)

    public static void main(String[] args) {
        System.out.println(getSumOfPrimes(10));        // 17    (2+3+5+7)
        System.out.println(getSumOfPrimes(100));       // 1060
        System.out.println(getSumOfPrimes(1000));      // 76127

        // Edge cases
        System.out.println(getSumOfPrimes(2));         // 2
        System.out.println(getSumOfPrimes(1));         // 0
        System.out.println(getSumOfPrimes(0));         // 0
        System.out.println(getSumOfPrimes(-5));        // 0

        // Larger input (sum is far beyond int range, which is why we return long)
        System.out.println(getSumOfPrimes(2_000_000)); // 142913828922
    }



}
