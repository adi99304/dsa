package basics;

import java.util.Scanner;

public class numberocc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number greater than 0 :- ");
        int a=in.nextInt();
        int count=0;
        while(a>0){
           int rem=a%10;
           if(rem==3){
               count++;
           }
           a=a/10;
        }
        System.out.println("no. of occureneces :- "+count);
    }
}
