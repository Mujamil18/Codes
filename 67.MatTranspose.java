import java.util.Scanner;
public class MatTranpose {
    public static void main(String[] args)
    {
        int row , col, i, j;
        System.out.print("Enter the number of rows and columns ");
        Scanner sc= new Scanner(System.in);
        row= sc.nextInt();
        col= sc.nextInt();
        int [][] org= new int [row][col];

        System.out.println("Enter the elements of matrix");

        for(i= 0; i< row; i++)
        {
            for (j = 0; j < col; j++)
            {
                org[i][j] = sc.nextInt();
                System.out.print(org[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Transpose of the matrix is ");
            for(i=0; i<col; i++)
            {
                for(j=0; j<row; j++)
                {
                    System.out.print(org[j][i] + " ");
                }
                System.out.println();
            }
    }
}
