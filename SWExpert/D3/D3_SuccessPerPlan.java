package SWExpert.D3;

/*
4789. 성공적인 공연 기획

해당 인덱스까지 추가되는 사람 증가시키기
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_SuccessPerPlan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        String s;
        int person;
        int sum;
        for (int tc = 1; tc <= t; tc++) {
            s = br.readLine();
            person = 0;
            sum = 0;
            for(int i=0; i<s.length(); i++){
                sum += Integer.parseInt(s.charAt(i)+"");
                if(sum<(i+1)){
                    while(sum<(i+1)){
                        sum++;
                        person++;
                    }
                }
            }
            sb.append("#"+tc+" "+person+"\n");
        }
        System.out.print(sb.toString());
    }


}

