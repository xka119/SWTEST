package SWExpert.D2;

/*
1989. 초심자의 회문 검사

대칭되는 index기준으로 검사하기
 */


import java.util.Scanner;

public class D2_Symmetric {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer;
        int t = sc.nextInt();
        sc.nextLine();

        int len;
        int check;
        for(int testcase=1; testcase<=t; testcase++){
            check = 1;
            answer = sc.nextLine();
            len = answer.length();
            for(int i=0; i<len/2; i++){
                if(answer.charAt(i)!=answer.charAt(len-i-1)){
                    check = 0;
                    break;
                }
            }
            System.out.println("#"+testcase+" "+ check);
        }



    }
}






