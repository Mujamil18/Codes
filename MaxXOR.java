//Maximum XOP of Two numbers in an Array
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class XOR {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
        int[] arr= new int[]{3, 10, 5, 25, 2, 8};
        ArrayList<Integer> XOR= new ArrayList<>();
        for(int i=0; i<arr.length-1; i++)
        {
//            arr[i] = sc.nextInt();
            for(int j=i+1; j<arr.length; j++)
            {
            System.out.println(j);
                XOR.add(arr[i] ^ arr[j]);
            }
        }
        System.out.println("The maximum result of two Numbers is: " + Collections.max(XOR));
    }
}
