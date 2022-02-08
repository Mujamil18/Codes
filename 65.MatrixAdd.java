import java.util.*;
public class MatrixAdd {
    public static void main(String[] args){
        int r1, c1, r2, c2, i, j, k;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Rows of First Matrix:");
        r1= sc.nextInt();
        System.out.print("Enter the Column of First Matrix:");
        c1 = sc.nextInt();
        System.out.print("Enter the Rows of Second Matrix:");
        r2= sc.nextInt();
        System.out.print("Enter the Column of Second Matrix:");
        c2= sc.nextInt();
        if(r1==r2 && c1==c2)
        {
            int [][] m1= new int[r1][c1];
            int [][] m2= new int [r2][c2];
            int [][] sum = new int[r2][c2];
            System.out.print("Enter the elements of first matrix:");
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c1; j++)
                {
                    m1[i][j]= sc. nextInt();
                    System.out.print(m1[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.print("Enter the elements of second matrix:");
            for(i=0; i<r2 ; i++)
            {
                for(j=0; j<c2; j++)
                {
                    m2[i][j]= sc. nextInt();
                    System.out.print(m2[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("The Addition of two matrices is:");
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c2; j++)
                {
                    for(k= 0; k< r2; k++) {
                        sum[i][j] = m1[i][j] + m2[i][j];
                    }
                    System.out.print(sum[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
