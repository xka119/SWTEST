package SWExpert.D3;

/*
4579. 세상의 모든 팰린드롬 2

1등 답안지 - 회문을 재귀로 불러서 처리
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_Pdrom2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        String s;
        int len;
        boolean check;

        for (int tc = 1; tc <= t; tc++) {
            check = true;
            s = br.readLine();
            len = s.length();

            for (int i = 0; i < len / 2; i++) {
                if(s.charAt(i) == '*' || s.charAt(len - 1 - i) == '*'){
                    check = true;
                    break;
                }else{
                    if(s.charAt(i)==s.charAt(len - 1 -i)){
                        continue;
                    }else{
                        check = false;
                        break;
                    }
                }
            }
            if(check){
                sb.append("#"+tc+" Exist\n");
            }else{
                sb.append("#"+tc+" Not exist\n");
            }
        }
        System.out.print(sb.toString());
    }
}

