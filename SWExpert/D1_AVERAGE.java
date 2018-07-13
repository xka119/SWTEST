package SWExpert;

/*
2071. 평균값 구하기

 StringTokenzier 사용법 및 nextInt() -> nextLine()공백 제거하기

 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class D1_AVERAGE {
    static final int SIZE = 10;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        StringTokenizer st;
        int t = sc.nextInt();
        double sum;
        double avg;
        sc.nextLine();

        for(int testcase = 0; testcase<t; testcase++){
            sum = 0;
            avg = 0;
            st = new StringTokenizer(sc.nextLine(), " ");
            while(st.hasMoreTokens()){
                sum += Integer.parseInt(st.nextToken());
            }
            avg = Math.round(sum/SIZE);


            System.out.println("#"+(testcase+1)+" "+ (int)avg);
        }

    }
}


