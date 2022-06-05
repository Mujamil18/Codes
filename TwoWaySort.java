//program to two way sorting, means sort the odd number is descending order and even number in ascending order
package practice;

import java.util.Arrays;

public class AsceDesc
{
    public static void main(String[] args)
    {
        int[] arr = {0, 4, 5, 3, 7, 2, 1};
        int n=arr.length;
        //making all odd number as negative
        for(int i=0; i<n; i++)
        {
            if(arr[i] % 2 != 0)
            {
                arr[i] = arr[i] * -1;
            }
        }
        //sorting the array
        Arrays.sort(arr);
        //making the negative odd numbers as positive as it is in the original array
        for(int i=0; i< n; i++)
        {
            if(arr[i] % 2 != 0)
            {
                arr[i] = arr[i]  * -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
