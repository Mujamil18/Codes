import java.util.*;
public class Triplets {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        ArrayList<ArrayList<Integer>> triplets = findTriplets(arr, n);
        if(!triplets.isEmpty())
            System.out.println(triplets);
        else
            System.out.println("Triplets can't be formed");
    }

    static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n) 
    {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        ArrayList<Integer> triplets = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) 
        {
            for (int j = i + 1; j < n - 1; j++) 
            {
                for (int k = j + 1; k < n; k++) 
                {
                    if (arr[i] + arr[j] + arr[k] == 0) 
                    {
                        String str = arr[i] + ":" + arr[j] + ":" + arr[k];
                        if (!set.contains(str)) {
                            triplets.add(arr[i]);
                            triplets.add(arr[j]);
                            triplets.add(arr[k]);
                            pairs.add(triplets);
                            triplets = new ArrayList<>();
                            set.add(str);
                        }
                    }
                }
            }
        }
        return pairs;
    }
}


