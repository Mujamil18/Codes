{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        for (int i = max / 2; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("GCD of the numbers is " + i);
                break;
            }
        }
    }
}
