package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
11053. 가장 긴 증가하는 부분 수열

맘에 안듬...
 */

public class T_11053 {
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int n;
    static int[] arr;
    static int[] visited;
    static int ans = -1;
    static ArrayList<Integer> res;
    static int max = Integer.MIN_VALUE;
    static int[] d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        res = new ArrayList<>();
        d = new int[n];
        arr = new int[n];
        visited = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            int min = 0;
            //현재의 arr의 값과 과거의 값들을비교
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j]){
                    if(min<d[j])
                        min = d[j];
                }
            }
            d[i] = min + 1;
            max = Math.max(d[i],max);
        }


        System.out.print(max);
    }


}

