package SWExpert.D3;

/*
4466. 최대 성적표 만들기

실행시간1등

받아드리는 인풋 개수가 적으면 String.split이 StringTokenizer보다 빠르다.
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D3_MaxScoreInfo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;



        int t = Integer.parseInt(br.readLine().trim());
        int n,k,sum;
        int[] arr;
        //n개중 k개 점수
        for (int tc = 1; tc <= t; tc++) {
            sum = 0;
            String[] ss = br.readLine().split(" ");
            n = Integer.parseInt(ss[0]);
            k = Integer.parseInt(ss[1]);
            arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            for(int i=n-1; i>=0; i--){
                sum += arr[i];
                k--;
                if(k==0)
                    break;
            }

            sb.append("#" + tc + " " + sum + "\n");
        }
        System.out.print(sb.toString());
    }
}

