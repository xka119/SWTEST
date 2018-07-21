package SWExpert.D2;

/*
1976. 시각 덧셈

 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_RecAdd {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        final int SIZE = 2;
        int[] first = new int[SIZE];
        int[] second = new int[SIZE];
        int[] sum = new int[SIZE];
        int t = Integer.parseInt(br.readLine().trim());

        for(int testcase=1; testcase<=t; testcase++) {
            st = new StringTokenizer(br.readLine());
            first[0] = Integer.parseInt(st.nextToken());
            first[1] = Integer.parseInt(st.nextToken());
            second[0] = Integer.parseInt(st.nextToken());
            second[1] = Integer.parseInt(st.nextToken());

            // 0,0 끼리 1은 1끼리
            // 0 끼리는 그냥 더하고 1끼리는 더한후 60으로 나눈몫을 0에다가 더해줌
            //바로 아래 sum[0] 이 부분 표현 a <= x <= b , a를 0으로 만들고 그만큼 +A 해주면 mod 범위
            sum[0] = ((first[0] + second[0] + ((first[1]+second[1])/60))-1)%12+1;
            sum[1] = (first[1]+second[1])%60;

            System.out.println("#"+testcase+" "+ sum[0]+" "+sum[1]);

        }



    }
}







