{
    public static int[][] Multiplication(int[][] m1, int[][] m2, int r1, int c1, int c2) {
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] = m1[i][j] * m2[i][j];
                }
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2, i, j;
        System.out.print("Enter the rows and columns of First Matrix ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.print("Enter the rows and columns of Second Matrix ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        System.out.print("Enter the elements of first matrix: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the elements of second matrix: ");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] mul = Multiplication(m1, m2, r1, c1, c2); //Multiply
        display(mul); // Display
    }
        public static void display(int[][] mul){

        System.out.println("The Product of Matrices is ");
        for (int[] row : mul)
        {
            for(int col: row)
            {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
