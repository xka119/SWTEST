package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
7562. 나이트의 이동

dfs로 풀다가 아닌거 알아내고 10분만에 bfs로 만들고 풀음. 최단거리는 bfs가 훨씬 좋네. 그리고 dx,dy 잘 만들어야함.

30분, 43퍼

 */

public class T_7562 {
    static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int n,t;
    static int[][] map;
    // 8방향
    static int[] dx = {-2,-1,1,2,2,1,-1,-2}; //상 하 좌 우 순서
    static int[] dy = {1,2,2,1,-1,-2,-2,-1};
    static int endX, endY, startX, startY;
    static int[][] visited;
    static int ans;
    static boolean find;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int tc=0; tc<t; tc++){
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());

            if(startX==endX&&startY==endY){
                sb.append(0+"\n");
            }else{
                //이동하는 나이트라.. 최단거리로 이동한다고 치자
                ans = 0;
                visited = new int[n][n];
                visited[startX][startY] = 1;
                find = false;
                bfs(startX, startY);
                sb.append(ans+"\n");
            }
        }
        System.out.print(sb.toString());
    }
    //bfs탐색
    public static void bfs(int x, int y){
        //q를 생성하고 시작점을 넣고 방문을 체크한다.
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x,y));
        visited[x][y] = 1;

        //q가 비어있지 않다면 탐색을하는데
        while(!q.isEmpty()){
            //q의 사이즈를 받는다 -> 이는 동일 탐색 횟수 구간 나누는 역할.
            int size = q.size();
            while(size!=0){
                Point temp = q.poll();
                int cx = temp.x;
                int cy = temp.y;
                if(cx==endX&&cy==endY) {find = true; break;} //만약에 q를 뺏는데 그값이랑 똑같으면 탈출

                //8방향을 탐색한다
                for(int i=0; i<8; i++){
                    int nx = cx + dx[i];
                    int ny = cy + dy[i];

                    //범위 체크, 방문 체크
                    if(nx<0||nx>=n||ny<0||ny>=n) continue;
                    if(visited[nx][ny]==1) continue;

                    //방문가능하면 큐에 삽입후, 방문 체크
                    q.add(new Point(nx,ny));
                    visited[nx][ny] = 1;
                }
                size--;
            }
            //동일 탐색 구간을 빠져 나온 후 find여부 확인
            if(find) break;
            else ans++;
        }
    }

}


