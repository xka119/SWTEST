package SWExpert.SWtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1952. [모의 SW 역량테스트] 수영장

61퍼 dfs로 풀었는데, 그렇게 말고 방법이 있는듯.. 정답률 61퍼

dfs 구조
{
// return 조건을 구한다

// 연결된 부분 확인 -> dfs 전 + something++; -> dfs -> dfs 후 + something--;

// 목표하는 depth가 보통은 탈출 조건인듯 하다.
 */
public class T_1952 {

    static int[] ticket_price = new int[4]; // 4가지
    static int t;
    static int[] plan = new int[13]; // 1월부터 확인
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine().trim());

        for(int tc=1; tc<=t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<4; i++)
                ticket_price[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i=1; i<13; i++)
                plan[i] = Integer.parseInt(st.nextToken());

            //dfs 1월부터
            dfs(1, 0);

            sb.append("#"+tc+" "+ min+"\n");
            min = Integer.MAX_VALUE;

        }
        System.out.print(sb.toString());
    }

    public static void dfs(int month, int nowMoney) {
        if(month>=13) {
            min = Math.min(nowMoney, min);
            return;
        }

        //1일 1달 3달 1년
        for(int i=0; i<4; i++) {
            int ticket = ticket_price[i];
            if(i==0) {
                nowMoney += (ticket * plan[month]);
                dfs(month+1, nowMoney);
                nowMoney -= (ticket * plan[month]);
            }
            if(i==1) {
                nowMoney += ticket;
                dfs(month+1, nowMoney);
                nowMoney -= ticket;
            }
            if(i==2) {
                nowMoney += ticket;
                dfs(month+3, nowMoney);
                nowMoney -= ticket;
            }
            if(i==3) {
                nowMoney += ticket;
                dfs(month+12, nowMoney);
                nowMoney -= ticket;
            }

        }


    }

}
