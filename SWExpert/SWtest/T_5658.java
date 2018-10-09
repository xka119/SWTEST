package SWExpert.SWtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
5658. [모의 SW 역량테스트] 보물상자 비밀번호

 */
public class T_5658 {
    static int t;
    static int n,k;
    static ArrayList<Integer> ans;
    static int r;
    static String s;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            String[] ss = br.readLine().split(" ");
            n = Integer.parseInt(ss[0]);
            k = Integer.parseInt(ss[1]);
            s = br.readLine();

            // 인풋 n을 4방향이니까 4로 나누니까  몫은 3 = 즉 0회전 1회전 2회전 .. 몫회전까지
            r = n/4;
            // arrayList에 추가시키고, list에 contains
            ans = new ArrayList<>();
            for(int i=1; i<=r; i++){
                String temp1 = s.substring(s.length()-i);
                String temp2 = s.substring(0, s.length()-i);
                String temp = temp1 + temp2;
                for(int j=0; j<temp.length(); j+=r){ //r회전하는 만큼 검사
                    String tt = temp.substring(j, j+r);
                    int pwd = Integer.parseInt(tt, 16);
                    if(!ans.contains(pwd)) ans.add(pwd);
                }
            }
            //n회전 할때마다 list에 추가시킨다
            //0회전때 r만큼의 인덱스의 값을 list에 추가시킨다. ㅇㅋ?

            Collections.sort(ans);
            //k는 등수니까 뒤에서부터 세자
            for(int i=ans.size()-1; i>=0; i--){
                k--;
                if(k==0){
                    sb.append("#"+tc+" "+ ans.get(i)+"\n");
                    break;
                }
            }
        }
        System.out.print(sb.toString());


    }


}
