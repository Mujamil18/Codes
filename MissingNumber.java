/*Given an Array nums containing n distinct numbers in the range[0, n] returns
the only number in the range that is missing from the array.
In this program the missing number is 5
*/

package practice;

import java.util.Arrays;

public class MissingNumber
{
    public static void main(String[] args)
    {
        int[] arr= {4, 3, 0, 1, 2, 6};
        int n=arr.length;
        MissingNumber obj= new MissingNumber();
//        obj.sortArray(arr, n);
        Arrays.sort(arr);
        System.out.println(obj.findMissingNumber(arr, n));

    }
//    void sortArray(int[] arr, int n)
//    {
//        int temp;
//        for(int i=0; i<n-1; i++)
//        {
//            if(arr[i] > arr[i+1])
//            {
//                temp = arr[i];
//                arr[i] = arr[i+1] ;
//                arr[i+1] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    int findMissingNumber(int[] arr, int n)
    {
        int missing=-1;
        for(int i=0; i<n; i++)
        {
            if(i != arr[i])
                missing= i;
        }
        return missing;
    }
}
