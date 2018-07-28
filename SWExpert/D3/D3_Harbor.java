package SWExpert.D3;

/*
4371. 항구에 들어오는 배

실행시간1등  메모리 사용 1등(제일적음)
나머지 활용
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_Harbor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        int n,count;
        int[] arr;

        for (int tc = 1; tc <= t; tc++) {
            count = 0;
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }

            for(int i=1; i<n; i++){
                if(arr[i]==0)
                    continue;
                int tm = arr[i]-1;
                for(int j=i+1; j<n; j++){
                    if((arr[j]%tm)==1)
                        arr[j] = 0;
                }
                count++;
            }
            sb.append("#"+tc+" "+count+"\n");
        }
        System.out.print(sb.toString());
    }
}

