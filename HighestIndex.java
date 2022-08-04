package practice;

import java.util.Scanner;

public class HighestIndex
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HighestIndex obj = new HighestIndex();
        int[] arr = {2, 4, 6, 8, 3, 5, 16, 7, 9};
        int maxIndex;
        maxIndex= obj.findHighest(arr);
        System.out.println("Index " + maxIndex);
        System.out.println(obj.compare(arr, maxIndex));
    }
    //To find the highest element in the array and this method returns the index of the highest element
    int findHighest(int[] arr)
    {
        int max= arr[0], index=0;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                index=i;
            }
        }
        System.out.println(max);
        return index;
    }
/* to compare the highest element and the other elements when multiplied with 2
returns the index of the highest element if highest element is greater than the other elements when multiplied with 2
and returns -1 when the highest element is lesser than the other elements when multiplied with 2 */
    int compare(int[] arr, int maxIndex)
    {
        int result=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i != maxIndex)
            {
                if (arr[i] * 2 > arr[maxIndex])
                {
                    result = -1;
                    break;
                }
                else
                {
                    result = maxIndex;
                }
            }
        }
        return result;
    }
}
