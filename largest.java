import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first on.:- ");
        int a = input.nextInt();
        System.out.print("enter second on.:- ");
        int b = input.nextInt();
        System.out.print("enter third on.:- ");
        int c =input.nextInt();
//        int max = a;
//        if(b>max){
//            max=b;
//        }
//        if (c>max) {
//            max=c;
//
//        }
        int max=Math.max(c,Math.max(a,b));
        System.out.println("Largest no. is :- "+ max);
    }
}
