package SWExpert.D3;

/*
3314. 보충학습과 평균

실행시간1등
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        int[] arr;
        int sum;
        for (int tc = 1; tc <= t; tc++) {
            sum = 0;
            arr = new int[5];
            String[] ss = br.readLine().split(" ");
            for(int i=0; i<5; i++){
                arr[i] = Integer.parseInt(ss[i]);
                if(arr[i]<40)
                    arr[i] = 40;
            }
            for(int n : arr)
                sum += n;
            sb.append("#"+tc+" "+ (sum/5)+"\n");


        }
        System.out.print(sb.toString());
    }


}

