package SWExpert.D3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2805. 농작물 수확하기 22분 정답률 76퍼

마름모의 범위만 더해줌.

 */
public class D3_2805 {
    static int t;
    static int n;
    static int[][] map;
    static int sum;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            sum = 0;
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            int k = n/2;
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                //탐색 범위 설정
                if(n/2 - i >= 0){ //인덱스를 벗어나지 않으면
                    for(int j=n/2-i; j<=n/2+i; j++)
                        sum += s.charAt(j) - 48;
                }else{
                    k--;
                    for(int j=n/2-k; j<=n/2+k; j++)
                        sum += s.charAt(j) - 48;
                }
            }

            sb.append("#"+tc+" "+sum+"\n");
        }
        System.out.print(sb.toString());
    }
}

