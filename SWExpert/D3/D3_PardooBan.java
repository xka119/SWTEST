package SWExpert.D3;

/*
3376. 파도반 수열

실행시간1등은 아닌데, 1등이랑 똑같음.
testcase for문 내에서 지속적으로 생성하지 않고 밖에서 생성했으므로 내가 더빠를텐데.. 왜 느리지? 다른이유는뭘까?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_PardooBan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] arr = new long[101];
        arr[1] = arr[2] = arr[3] = 1;
        arr[4] = arr[5] = 2;
        for(int i=6; i<101; i++){
            arr[i] = arr[i-1] + arr[i-5];
        }
        int t = Integer.parseInt(br.readLine().trim());
        int n;
        for(int tc=1; tc<=t; tc++){
            n = Integer.parseInt(br.readLine());
            sb.append("#"+tc+" "+arr[n]+"\n");
        }
        System.out.print(sb.toString());
    }


}

