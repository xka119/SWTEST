package SWExpert.D2;

/*
1285. 아름이의 돌 던지기

홈페이지에 JAVA 제출이 없음
HashMap, min, ABS 사용
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D2_ThrowStone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        HashMap<Integer, Integer> map;

        int t = Integer.parseInt(br.readLine().trim());
        int n,temp,min;
        for(int tc=1; tc<=t; tc++){
            min = 100001;
            map = new HashMap<>();
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(n!=0){
                temp = Math.abs(Integer.parseInt(st.nextToken()));
                if(map.get(Math.abs(temp))==null){
                    map.put(Math.abs(temp),1);
                }else{
                    int tm = map.get(Math.abs(temp))+1;
                    map.put(Math.abs(temp), tm);
                }
                if(min>temp)
                    min = temp;
                n--;
            }

            sb.append("#"+tc+" "+ min + " " + map.get(min)+"\n");
        }

        System.out.print(sb.toString());

    }
}





