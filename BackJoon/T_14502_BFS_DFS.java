package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
14502. 연구소

dfs랑 bfs 혼합 문제.. 하 dfs를 잘못 했음. 1시간10분정도 정답률 53퍼

dfs는 전체를 돈다. 맵을 업데이트 할때는 dfs를 쓰는 듯하다.
bfs는 연결된 부분을 q에 담고 돈다. 바이러스가 퍼진 것을 확인 할때 tempMap을 생성하여서 bfs를 한다. 기존의 것으로하면 bfs후 map이 변경되서 쓸 수 없다.

생각을 그리니까 더 좋은데?? hit count는 재귀에서는 무용지물인거같다?
 */
public class T_14502_BFS_DFS {
    static class Point{
        int x,y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    static int n,m;
    static int[][] map;
    static int safety = -1;
    static int wall_size = 3; //벽은 3개 세워야함.

    static int[] dx = {1,0,-1,0}; //
    static int[] dy = {0,1,0,-1};
    static ArrayList<Point> virus;
    static int[][] dfs_visited;
    static int[][] bfs_visited;
    static Queue<Point> q;
    static int[][] tempMap;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //Input map 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        virus = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2) virus.add(new Point(i, j));
            }
        }

        // 2 = 바이러스, 1 = 벽, 0 = 빈칸, 2는 0 을건널수 있다.
        // 벽은 반드시 3개를 어딘가에 세워두워야한다. -> dfs로 벽의 위치를 만들어야되나?

        // 첫번째 생각. dfs로 벽을 세워서 map을 업데이트 한다.
        dfs_visited = new int[n][m];
        dfs(0,0,0); //첫번째 좌표를 시작으로 map을 업데이트한다.
        // 두번째 생각. 업데이트된 맵을 bfs로 탐색한다
        // 세번째 생각. 그때의 안전영역 최대 값을 갱신한다.

        System.out.print(safety);
    }

    //dfs map
    public static void dfs(int x, int y, int depth){
        if(depth==wall_size){
            bfs();
            return;
        }

        //모든 좌표를 돈다.
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(dfs_visited[i][j]==1||map[i][j]==1||map[i][j]==2) continue;
                dfs_visited[i][j] = 1;
                map[i][j] = 1;
                dfs(i,j,depth+1);
                map[i][j] = 0;
                dfs_visited[i][j] = 0;
            }
        }
    }

    public static void bfs(){
        //바이러스가 탐색하는 tempMap을 만든다
        tempMap = new int[n][m];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                tempMap[i][j] = map[i][j];

        bfs_visited = new int[n][m];
        q = new LinkedList<>();
        //바이러스를 순회한다
        for(int i=0; i<virus.size(); i++){
            //바이러스 좌표 하나를 꺼내서 q에 삽입한다
            q.add(virus.get(i));
            bfs_visited[virus.get(i).x][virus.get(i).y] = 1;

            //q가 비지 않았다면 bfs한다
            while(!q.isEmpty()){
                Point temp = q.poll();
                int cx = temp.x;
                int cy = temp.y;

                //4방향 탐색
                for(int j=0; j<4; j++){
                    int nx = cx + dx[j];
                    int ny = cy + dy[j];

                    //범위, 방문했는지, 그리고 방문 가능한지 확인
                    if(nx<0||nx>=n||ny<0||ny>=m) continue;
                    if(bfs_visited[nx][ny]==1||tempMap[nx][ny]==1||tempMap[nx][ny]==2) continue; //벽이거나 바이러스면 탐색 x

                    q.add(new Point(nx, ny));
                    tempMap[nx][ny] = 2; //map을 업데이트 해줘야함.
                    bfs_visited[nx][ny] = 1;

                }
            }
        }
        //최대값 최소값 구하기.
        getSafety();
    }

    //안전 범위 구하기
    public static void getSafety(){
        int count = 0;
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                if(tempMap[i][j]==0) count++;
        safety = Math.max(safety, count);
    }



}

