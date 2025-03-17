package basics;

import java.util.Scanner;

public class varargs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        varar(1,2,3,4,5,6,7);
    }
    static void varar(int ...v){
//        System.out.println(Arrays.toString(v));
        System.out.println(v);
        System.out.println("Aditya Hegde");
    }
}
