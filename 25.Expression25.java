public class Expression25 {
    public static void main(String[] args){
        int x= 5,x1;
        x1= ++x - x++ + --x; 
        System.out.println(x1);//6
        System.out.println(x); // 6
    }
}
