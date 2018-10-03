package BackJoon;


/*
2667. 단지번호붙이기

출력 정확히. 0인경우도 확인, BFS로 탐색

모든 map[][] 을 돌면서 bfs를 실행한다 이때 visited[][]는 방문하지 않았을 때만 bfs 시작
flag를 두어서 단지 구분
Queue를 돌면서 단지 카운팅
res로 단지 카운팅 리스트 만듬 30분쯤 걸린 듯 할 수 있다!!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class T_2667_BFS {
    static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int[][] map;
    static Queue<Point> q;
    static int[][] visited;
    static ArrayList<Integer> res = new ArrayList<>();
    static int flag = 2;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for(int i=0; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = s.charAt(j)-48;
            }
        }

        visited = new int[n][n];

        //시작점



        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j] == 0){
                    q = new LinkedList<>();
                    q.add(new Point(i,j));
                    visited[i][j] = 1;
                    bfs(i,j);
                }
            }
        }
        Collections.sort(res);
        if(res.size()==0){
            System.out.println(0);
        }else{
            System.out.println(res.size());
            for(int i : res)
                System.out.println(i);
        }


    }
    public static void bfs(int x, int y){
        if(map[x][y] == 1){
            int count = 0;
            while(!q.isEmpty()){
                Point p = q.poll();
                int curX = p.x;
                int curY = p.y;
                map[curX][curY] = flag;
                count++;

                for(int i=0; i<4; i++){
                    int nextX = curX + dx[i];
                    int nextY = curY + dy[i];

                    if(nextX>=0 && nextX<n && nextY>=0 && nextY<n ){
                        if(map[nextX][nextY] == 1 && visited[nextX][nextY] == 0){
                            q.add(new Point(nextX, nextY));
                            visited[nextX][nextY] = 1;
                        }
                    }

                }
            }
            res.add(count);
            flag++;
        }else{
            return;
        }

    }
}

