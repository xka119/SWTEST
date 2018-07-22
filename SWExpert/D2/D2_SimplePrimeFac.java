package SWExpert.D2;

/*
1945. 간단한 소인수분해

StringBuilder, BufferedReader, StringTokenizer 속도 줄이기
소인수분해 = 나누고 나누면 결국에는 1이 된다
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class D2_SimplePrimeFac {
    static int[] answer;
    static final int SIZE = 5;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        int n;
        for (int tc = 1; tc <= t; tc++) {
            n = Integer.parseInt(br.readLine());
            answer = new int[SIZE];
            while(n!=1){
                if(n%2==0){
                    n = n/2;
                    answer[0]++;
                }
                if(n%3==0){
                    n = n/3;
                    answer[1]++;
                }
                if(n%5==0){
                    n = n/5;
                    answer[2]++;
                }
                if(n%7==0){
                    n = n/7;
                    answer[3]++;
                }
                if(n%11==0){
                    n = n/11;
                    answer[4]++;
                }
            }

            sb.append("#"+tc+" ");
            for(int i : answer)
                sb.append(i+" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

}





