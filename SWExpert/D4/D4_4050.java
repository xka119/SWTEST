package SWExpert.D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
4050. 재관이의 대량 할인

정렬, 큰 숫자들만 더해주고 n디바이드 될 때마다 무시하고, count 초기화
.. n디바이드 할 때만 빼주면 되네...

정답률 45퍼

 */
public class D4_4050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            String[] ss = br.readLine().split(" ");
            int[] clothes = new int[n];
            for (int i = 0; i < n; i++) clothes[i] = Integer.parseInt(ss[i]);
            int sum = 0;
            Arrays.sort(clothes);
            int count = 0;
            for (int i = n - 1; i >= 0; i--) {
                count++;
                if (count % 3 != 0) sum += clothes[i];
                else count = 0;
            }
            sb.append("#" + tc + " " + sum + "\n");
        }
        System.out.print(sb.toString());
    }
}
