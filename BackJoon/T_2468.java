package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
2468. 안전 영역

실제 풀이 시간 30분 미만. 매우 빨리풀엇다
이런 완탐문제는 1)map을 업데이트한다 2)완전탐색한다.

30분 32퍼
 */

public class T_2468 {
    static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int n;
    static int[][] orgMap;
    static int[][] visited;
    static int safety = -1;
    static int height = 0;
    static int[][] map;
    static Queue<Point> q;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        orgMap = new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                orgMap[i][j] = Integer.parseInt(st.nextToken());
                if(orgMap[i][j]>height) height = orgMap[i][j];
            }
        }
        //높이는 최대 100까지 입력되는데. 가장 높은 높이까지만 실행하면되겟지? 가장높은 높이일 경우 = ans = 0이 되어버림.
        //첫번째 높이가 주어질때, 잠기는 부분을 체크한다.
        for(int i=0; i<=height; i++){
            createMap(i);
        }
        //두번째 잠기는 맵이 주어질 때, 안전영역을 돌면서 체크한다.

        //출력
        System.out.print(safety);
    }

    // 잠기는 맵을 생성한다
    public static void createMap(int height){
        map = new int[n][n];
        //원래 맵으로부터 침수 구역을 나눈다. 0은 안전 1은 침수
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(orgMap[i][j]-height>0) map[i][j] = 0;
                else map[i][j] = 1;
            }
        }
        //침수 맵을 생성하고 구역을 체크한다.
        bfs();
    }

    //구역 체크
    public static void bfs(){
        visited = new int[n][n]; //방문 초기화
        int count = 0;
        //침수 맵을 돌면서 bfs한다 각 좌표부터 모두 순회한다.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if (visited[i][j] == 0 && map[i][j] ==0) { //방문한 적이 없으면 순회를 시작한다.
                    q = new LinkedList<>();
                    visited[i][j] = 1;
                    q.add(new Point(i, j));
                    //q를 생성하고 방문기록

                    //q가 비어있지않으면 계속 탐색
                    while (!q.isEmpty()) {
                        Point temp = q.poll();
                        int x = temp.x;
                        int y = temp.y;
                        //4방향 탐색
                        for (int a = 0; a < 4; a++) {
                            int nx = x + dx[a];
                            int ny = y + dy[a];

                            //범위내에 있고, 방문한적이 없고, 방문을 할 수 있는 곳인지 확인
                            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                            if (visited[nx][ny] == 1 || map[nx][ny] == 1) continue;

                            //방문할 수 있다면
                            q.add(new Point(nx, ny));
                            visited[nx][ny] = 1;
                        }
                    }
                    count++;
                }
            }
        }
        //맵을 다 돌고나서 기존의 안전영역이 최대일때의 ans를 갱신한다
        safety = Math.max(count,safety);
    }
}