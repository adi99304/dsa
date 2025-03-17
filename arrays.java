import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] fruits={"Mango","Apple"};
        System.out.println(Arrays.toString(fruits ));
        System.out.println( fruits[0]);
//        for(int i=0;i<fruits.length;i++){
//            System.out.println(fruits[i]);
//        }
        for(String i : fruits){
            System.out.println(i);
        }
    }
}
