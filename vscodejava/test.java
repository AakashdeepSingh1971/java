package vscodejava;

import java.util.Scanner;
// import java.util.function.Function;

public class test {

    public static int avarage(int a, int b, int c) {
        int avarage = (a + b + c) / 3;

        return (avarage);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int c = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(avarage (a,b,c));

        }
    }

}
