package vscodejava;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
        int[] marks= new int[n];
       marks[0]=98;
       marks[1]=97;
       marks[2]=96;
       marks[3]=95;
    //    System.out.println(marks[0]);
    //    System.out.println(marks[1]);
    //    System.out.println(marks[2]);
    //    System.out.println(marks[3]);
    
    for (int i=0; i<n; i++){
        System.out.println(marks[i]);
    }
    }
}
