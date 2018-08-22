package SWExpert.D3_Hard;


/*
5215. 햄버거 다이어트

고정된 배열 탐색방법 사용. 어렵다...ㅠㅠ 실행속도 빠른편.
index를 기준으로 배열 전과 후에 초기화 시켜주기!!
정답률 38%
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_HambugerDiet {
    static int[] trr;
    static int[] krr;
    static int n,l;
    static int max;
    static int calory,taste;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine().trim());

        for(int tc=1; tc<=a; tc++){
            //init
            max = 0;
            calory = 0;
            taste = 0;
            String ss[] = br.readLine().split(" ");
            n = Integer.parseInt(ss[0]);
            l = Integer.parseInt(ss[1]);
            trr = new int[n];
            krr = new int[n];
            for(int i=0; i<n; i++){
                ss = br.readLine().split(" ");
                trr[i] = Integer.parseInt(ss[0]);
                krr[i] = Integer.parseInt(ss[1]);
            }

            //모든 경우의 수를 탐색하기 위해 시작 인덱스를 다르게함.
            for(int i=0; i<n; i++){
                get(i);
                calory = 0;
                taste = 0;
            }

            sb.append("#"+tc+" "+max+"\n");
        }
        System.out.print(sb.toString());

    }
    public static void get(int index){
        calory += krr[index];
        if(calory>l){
            calory -= krr[index];
            return;
        }else{
            taste += trr[index];
        }
        if(max<taste)
            max = taste;

        index++;
        for(int i=index; i<n; i++){
            get(i);
        }
        //return된 현재 배열 상태 init
        index--;
        calory -= krr[index];
        taste -= trr[index];
    }

}
