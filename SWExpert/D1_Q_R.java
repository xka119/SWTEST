package SWExpert;

/*
2029. 몫과 나머지 출력하기

 */


import java.util.Scanner;

public class D1_Q_R {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        //몫, 나머지
        int c, d;

        int t = sc.nextInt();
        for (int testcase = 0; testcase < t; testcase++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            d = a%b;


            System.out.println("#" + (testcase + 1) + " " + c + " " + d);
        }

    }

}



