public class Expression22 {
    public static void main(String[] args){
        int  a= 28;
        a += a++ + ++a + --a + a--; //a-- never used , so a is 144
        System.out.println(a);

    }
}
