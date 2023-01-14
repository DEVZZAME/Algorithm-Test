package 쇼미더코드23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        int left = 0;
        int right = 0;
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if(list[i] == 1){
                if (i == 0 & (list[i] != list[i+1])) {
                    ans1.add(left);
                }else if (i > 0 && (list[i] == list[i-1])) {
                    left += 2;
                    if (i > 1 && (list[i] == list[i-2])) {
                        left -= 1;
                        if (i == N-1) {
                            ans1.add(left);
                        }
                    }
                    if (i == N-1) {
                        ans1.add(left);
                    }
                } else if (i != 0 && (list[i] != list[i-1])) {
                    ans2.add(right);
                    right = 0;
                }

            } else if (list[i] == 2) {
                if (i == 0 && (list[i] != list[i+1])) {
                    ans2.add(right);
                }else if (i > 0 && (list[i] == list[i-1])) {
                    left += 2;
                    if (i > 1 && (list[i] == list[i-2])) {
                        left -= 1;
                        if (i == N-1) {
                            ans2.add(right);
                        }
                    }
                    if (i == N-1) {
                        ans2.add(right);
                    }
                } else if (i != 0 && (list[i] != list[i-1])) {
                    ans1.add(left);
                    left = 0;
                }
            }
        }


        for (int i = 0; i < ans1.size(); i++) {
            System.out.println("left : " + ans1.get(i));
        }
        for (int i = 0; i < ans2.size(); i++) {
            System.out.println("right : " + ans2.get(i));
        }


    }
}
