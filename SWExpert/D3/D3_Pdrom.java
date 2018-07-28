package SWExpert.D3;

/*
4522. 세상의 모든 팰린드롬

회문검사방법 - String.charAt(처음 인덱스 ~ 끝 인덱스)
출력을 정확하게 해야함!
실행시간1등

*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_Pdrom {

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
                if (s.charAt(i) != s.charAt(len - 1 - i)) {
                    if (s.charAt(i) == '?' || s.charAt(len - 1 - i) == '?') {
                        if (i == len / 2 - 1) {
                            check = true;
                            break;
                        }else {
                            continue;
                        }
                    }
                    check = false;
                    break;
                }
                if (i == len / 2 - 1)
                    check = true;
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

