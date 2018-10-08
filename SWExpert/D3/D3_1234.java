package SWExpert.D3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1234. [S/W 문제해결 기본] 10일차 - 비밀번호 10분 컷 정답률 82퍼

 */
public class D3_1234 {
    static int t = 10;
    static int len;
    static String pwd;
    static String ans;
    static ArrayList<Character> pwdlist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            ans = "";
            pwdlist = new ArrayList<>();
            String[] ss = br.readLine().split(" ");
            len = Integer.parseInt(ss[0]);
            pwd = ss[1];

            //비밀번호를 추가
            for(int i=0; i<len; i++)
                pwdlist.add(pwd.charAt(i));
            //비밀번호 생성
            for(int i=0; i<pwdlist.size()-1; i++){
                if(pwdlist.get(i)==pwdlist.get(i+1)){
                    pwdlist.remove(i);
                    pwdlist.remove(i);
                    i = -1; //초기화
                    continue;
                }
            }
            for(int i=0; i<pwdlist.size(); i++){
                ans += pwdlist.get(i);
            }

            sb.append("#"+tc+" "+ans+"\n");
        }
        System.out.print(sb.toString());
    }
}


