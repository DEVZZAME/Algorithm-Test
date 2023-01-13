package 최백준강의;

import java.util.Scanner;

public class Q4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int reminder = 0;

            for (int i = 1; ; i++) {
                reminder = (reminder * 10) + 1;
                reminder %= n;
                if (reminder == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
