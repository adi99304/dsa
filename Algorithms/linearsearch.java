package Algorithms;

public class linearsearch {
    public static void main(String[] args) {
int[] arr={2,3,4,5,6,7};
int target=6;
int start=2;
int end=4;
int a=linear(arr,target,start,end);
        System.out.println(a);

    }
 static int linear(int[] arr,int target,int start,int end) {
     if (target == arr[0]) {
         System.out.println("we found the number at zero index");
     } else {
         for (int i = start; i < end; i++) {
             if (target == arr[i]) {
                 return i;
             }
// DONT PUT ELSE COMMENT HERE BECAUSE IN FIRST ITERATION ONLY IT WILL run  THE CODE IN ELSE part ie RETURN 0
         }
     }
     ;
     return -1;
 }}
