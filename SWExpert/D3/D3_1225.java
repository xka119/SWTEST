package SWExpert.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
1225. [S/W 문제해결 기본] 7일차 - 암호생성기

 */
public class D3_1225 {
    static Queue<Integer> orgQ;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n,m;

        //시작
        for(int tc=1; tc<=10; tc++ ){
            //입력
            int t = Integer.parseInt(br.readLine());
            String[] ss = br.readLine().split(" ");
            orgQ = new LinkedList<>();
            for(int i=0; i<8; i++){
                orgQ.add(Integer.parseInt(ss[i]));
            }

            doCheck(orgQ);
            sb.append("#"+tc+" ");
            for(int i=0; i<8; i++){
                sb.append(orgQ.poll()+" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());

    }
    public static void doCheck(Queue<Integer> q){
        //5번 큐를 돌면서
        //빼주고 0보다 작은지 체크
        for(int i=1; i<=5; i++){
            int num = q.poll();
            if(num-i<=0){
                num = 0;
                q.add(num);
                return;
            }else{
                num -= i;
                q.add(num);
            }
        }
        doCheck(q);

    }

}

