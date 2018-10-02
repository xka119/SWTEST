package SWExpert.D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3143. 가장 빠른 문자열 타이핑

배열의 범위를 벗어나지 않는 탐색 범위를 잘 조절해야함. 정답률 44퍼

CharToArray - Char[] 탐색하는게 더빠르넴...
 */
public class D4_3143 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            String[] ss = br.readLine().split(" ");
            String a = ss[0]; String b = ss[1]; int count = 0;
            for(int i=0; i<a.length(); i++){
                String temp = "";
                if(a.charAt(i) == b.charAt(0)){
                    for(int j=i; j<b.length()+i; j++)
                        if(j<a.length()) temp += a.charAt(j);
                    if(b.equals(temp)){
                        count++; i += b.length() - 1; continue;
                    }
                }
                count++;
            }
            sb.append("#"+tc+" "+count+"\n");
        }
        System.out.print(sb.toString());
    }
}

