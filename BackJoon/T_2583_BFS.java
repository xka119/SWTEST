package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
2583. 영역구하기
Input받는 것 정확히 하기. //bfs항상 생각해야될것, 1)가능한 범위 2)방문 여부 3)변경된 위치 방문가능 여부

30분걸림 정답률 54퍼

 */
public class T_2583_BFS {
    static class Point{
        int x,y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    static int m,n,k;
    static int[][] map;
    static int[][] visited;
    static ArrayList<Integer> ans; //나중에 정렬
    static Queue<Point> q;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int home = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 map을 입력 받기
        // 두번째 모든 좌표를 돌면서 map = 0이고 방문을 하지 않았다면 bfs 시작하기.
        // 세번째 정렬하고 집 수와, 영역별 수 출력하기.

        //첫번째 map 만들기
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        //map 채우기
        map = new int[n][m];
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int a=x1; a<x2; a++){
                for(int b=y1; b<y2; b++){
                    map[a][b] = 1; //범위만큼 채우기
                }
            }
        }

        //두번째 모든좌표를 돌면서 map = 0이고 방문 x라면 bfs시작하기
        ans = new ArrayList<>();
        visited = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==0 && visited[i][j]==0){
                    bfs(i,j);

                }
            }
        }

        //세번째 정렬하고 집 수와, 영역별 수 출력하기
        Collections.sort(ans);
        StringBuilder sb = new StringBuilder();
        sb.append(home+"\n");
        for(int i=0; i<ans.size(); i++){
            sb.append(ans.get(i)+" ");
        }
        sb.append("\n");
        System.out.print(sb.toString());
    }
    public static void bfs(int x, int y){
        q = new LinkedList<>();
        q.add(new Point(x, y));
        visited[x][y] = 1;
        int count = 1; //첫번째 집은 카운트해줘야됨.

        //q가 비어있지않다면 탐색
        while(!q.isEmpty()){
            Point temp = q.poll();
            int cx = temp.x;
            int cy = temp.y;

            //4방향 탐색
            for(int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                //범위 확인, 방문 x 확인
                if(nx<0||nx>=n||ny<0||ny>=m) continue;
                if(visited[nx][ny]==1||map[nx][ny]==1) continue;

                q.add(new Point(nx, ny));
                visited[nx][ny] = 1;
                count++;
            }
        }
        home++;
        ans.add(count);
    }

}
