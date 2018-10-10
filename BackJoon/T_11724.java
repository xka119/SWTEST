package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
11724. 연결 요소의 개수

입력되지 않은 정점의 개수를 추가해주는 방법이 필요

 */

public class T_11724 {
    static int n, m;
    static HashSet<Integer> visited = new HashSet<>();
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            ArrayList<Integer> a;
            ArrayList<Integer> b;
            if (!map.containsKey(x)) {
                a = new ArrayList<>();
            } else {
                a = map.get(x);
            }
            a.add(y);
            map.put(x, a);
            if(!map.containsKey(y)){
                b = new ArrayList<>();
            }else{
                b = map.get(y);
            }
            b.add(x);
            map.put(y,b);
        }

        int count = 0;
        if (n == 1) {
            count = 1;
        } else {
            //dfs
            for (int i = 1; i <= 1000; i++) {
                if(!visited.contains(i) && map.containsKey(i)){
                    dfs(i);
                    count++;
                }
            }
            //입력되지 않은 정점 추가시키기
            int size = visited.size();
            if(n==size){
            }else{
                count += (n-size);
            }
        }

        System.out.print(count);
    }
    public static void dfs(int x){
        visited.add(x); //방문 기록

        ArrayList<Integer> list = map.get(x);
        for(int i=0; i<list.size(); i++){
            if(!visited.contains(list.get(i))){
                dfs(list.get(i));
            }
        }

    }
}