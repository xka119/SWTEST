package BackJoon;

/*
1094. 막대기

기본 구현 문제인 듯..

23분 73퍼
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class T_1094 {
    static int x;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());
        list.add(64);

        start(64);

        System.out.print(list.size());

    }
    public static void start(int sum){

        while(sum!=x){
            Collections.sort(list);
            int first = list.get(0); //첫번째 index 빼고
            int t1 = first/2;
            int t2 = first/2;
            int tsum = 0;
            for(int i=0; i<list.size(); i++)
                tsum += list.get(i);
            list.remove(0);
            if(tsum-t1>=x) list.add(t2);
            else { list.add(t1); list.add(t2);}

            sum = 0;
            for(int i=0; i<list.size(); i++)
                sum += list.get(i);
        }
    }
}
