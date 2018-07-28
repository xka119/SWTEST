package SWExpert.D3;

/*
4698. 테네스의 특별한 소수

시간복잡도 크게 발생하는 부분을 찾기
반복적인부분 -> 처음부터 인덱싱테이블로 구성
String.contains,valueOf <- Good
실행시간 1등
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D3_TenesPrime {
    static int[] table;
    static final int SIZE = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //
        for (int i = 0; i < 11; i++) {
            list.add(new ArrayList<>());
        }
        //소수 테이블 구하기
        table = new int[SIZE + 1];
        for (int i = 2; i < SIZE + 1; i++) {
            table[i] = i;
        }
        for (int i = 2; i < SIZE; i++) {
            if (table[i] != 0) {
                for (int k = 1; k < 10; k++) {
                    // 1~9 까지의 수로 Indexing 생성
                    if (String.valueOf(table[i]).contains(String.valueOf(k))) {
                        list.get(k).add(table[i]);
                    }
                }
                for (int j = i + i; j < SIZE; j += i) {
                    table[j] = 0;
                }
            }
        }

        int d, a, b;
        int count;
        int t = Integer.parseInt(br.readLine().trim());
        for (int tc = 1; tc <= t; tc++) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            d = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            //해당하는 d에 맞는 list 생성
            ArrayList<Integer> arr = list.get(d);
            int len = arr.size();
            for (int i = 0; i < len; i++) {
                if (a <= arr.get(i) && b >= arr.get(i))
                    count++;
            }

            sb.append("#" + tc + " " + count + "\n");


        }
        System.out.print(sb.toString());

    }
}
