//program to find the frequency of a number in an array
package practice;

public class Frequency
{
    public static void main(String[] args)
    {
        int[] arr= {1, 2, 3,4, 3, 5, 4, 2, 4, 3};
        int n= arr.length;
        int[] counts= new int[n];
        int visited= -1;
        for(int i=0; i < n; i++)
        {
            int count=1;
            for(int j=i+1; j<n; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    counts[j] = visited;
                }
            }
            if(counts[i] != visited)
            {
                counts[i] = count;
                System.out.print(arr[i]+"("+count+") ");
            }
        }
    }
}
