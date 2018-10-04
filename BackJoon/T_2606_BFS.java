package BackJoon;


/*
2606. 바이러스

map[][] 이런 배열 인덱스가 아니라 숫자가 주어졌을때,
범위가 한정 되었을 때 -> ArrayList<Integer>[] , int[] visited
범위가 무한할 때 -> HashMap<Integer, ArrayList<Integer>, HashSet<Integer>
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class T_2606_BFS {
    static int n, m;
    static int[] visited ;
    static ArrayList<Integer>[] map;
    static Queue<Integer> q;
    static int count = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); // 컴퓨터 수
        m = Integer.parseInt(br.readLine()); // 연결된 좌표 수

        visited = new int[n+1];

        map = new ArrayList[n + 1];
        //map list 초기화
        for (int i = 0; i < n + 1; i++) {
            map[i] = new ArrayList<>();
        }

        //연결되있음을 표시
        for (int i = 0; i < m; i++) {
            String[] ss = br.readLine().split(" ");
            int x = Integer.parseInt(ss[0]);
            int y = Integer.parseInt(ss[1]);
            map[x].add(y);
            map[y].add(x);
        }
        //1부터 완탐 시작
        q = new LinkedList<>();
        q.add(1);
        visited[1] = 1;
        bfs(1);

        System.out.print(count);
    }
    public static void bfs(int x){
        while(!q.isEmpty()){
            int temp = q.poll();
            count++;
            //연결되있는지 확인한다
            ArrayList<Integer> a = map[temp];
            for(int i=0; i<a.size(); i++){
                if(visited[a.get(i)]==0){
                    q.add(a.get(i));
                    visited[a.get(i)] = 1;
                }
            }
        }
    }

}


