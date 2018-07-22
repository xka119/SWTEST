package SWExpert.D2;

/*

1948. 날짜 계산기

함수 구현
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_CalendarDays {

    static int[] calendar = {28,30,31};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        final int SIZE = 2;
        int[] first;
        int[] second;
        int answer;
        for(int tc=1; tc<=t; tc++){
            answer = 0;
            st = new StringTokenizer(br.readLine());
            first = new int[SIZE];
            second = new int[SIZE];
            first[0] = Integer.parseInt(st.nextToken());
            first[1] = Integer.parseInt(st.nextToken());
            second[0] = Integer.parseInt(st.nextToken());
            second[1] = Integer.parseInt(st.nextToken());

            answer = getDays(second) - getDays(first) + 1;

            /*
            31 - 1,3,5,7,8,10,12
            30 - 4,6,9,11
            28 - 2
            방법1)
            월과 일을 모두 일로 계산한다 그리고 맥스 - 민 + 1 = answer
             */
            sb.append("#"+tc+" "+ answer+"\n");
        }
        System.out.println(sb.toString());
    }

    public static int getDays(int[] days){
        int month = days[0];
        int day = days[1];

        for(int i=1; i<month; i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                day += calendar[2];
            }else if(i==4 || i==6 || i==9 || i==11){
                day += calendar[1];
            }else{
                day += calendar[0];
            }
        }
        return day;
    }



}
