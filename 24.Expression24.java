public class Expression24 {
    public static void main(String[] args){
        int y=10, z;
        z= ( ++y * (y++ + 5));
        System.out.println(z); // 176
        System.out.println(y); // 12

    }
}
