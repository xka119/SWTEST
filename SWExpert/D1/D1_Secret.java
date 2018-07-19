package SWExpert.D1;

/*
2043. 서랍의 비밀번호

 */


import java.util.Scanner;
import java.util.StringTokenizer;

public class D1_Secret {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        int p = 0;
        int k = 0;
        int count = 1;
        st = new StringTokenizer(sc.nextLine());

        while (st.hasMoreTokens()) {
            p = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
        }

        while (p != k) {
            k++;
            count++;
        }
        System.out.println(count);


    }

}



