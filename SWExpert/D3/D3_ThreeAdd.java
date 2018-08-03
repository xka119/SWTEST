package SWExpert.D3;

/*
3408. 세가지 합 구하기

큰 수 case = Long !!
Special. 1~n까지의합, 짝수의 합, 홀수의 합. 입력받는 수의 Long으로 type casting
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_ThreeAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        long n;
        for(int tc=1; tc<=t; tc++){
            n = (long)Integer.parseInt(br.readLine());
            sb.append("#"+tc+" "+(n*(n+1)/2)+" "+n*n+" "+(n*n+n)+"\n");

        }
        System.out.print(sb.toString());
    }


}

