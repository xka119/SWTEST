package SWExpert.SWtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
1249. [S/W 문제해결 응용] 4일차 - 보급로

bfs로 풀어야되네 dfs로 풀면 시간초과남
최단거리, 최단 ~~~~~ bfs로 풀면 빨리 풀리네!!! ㅇㅋㅇㅋ
 */
public class T_1249 {
    static int[][] map;
    static int[][] sum;
    static int min;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int n;
    static Queue<Point> q = new LinkedList<>();

    static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            //초기화
            min = Integer.MAX_VALUE;
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            for(int i=0; i<n; i++){
                String s = br.readLine();
                for(int j=0; j<n; j++)
                    map[i][j] = Integer.valueOf(s.charAt(j)+"");
            }
            sum = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++)
                    sum[i][j] = Integer.MAX_VALUE;
            }

            q.add(new Point(0,0));
            sum[0][0] = map[0][0];
            bfs(0,0);
            min = sum[n-1][n-1];

            sb.append("#"+tc+" "+min+"\n");

        }
        System.out.print(sb.toString());
    }
    public static void bfs(int x, int y){

        //q가 비어 있지 않으면 탐색 . 이 때 큐는 최소값을 갖게되는 인덱스를 집어넣는다
        while(!q.isEmpty()){
            Point temp = q.poll();
            int cx = temp.x;
            int cy = temp.y;

            //4방향 순회
            for(int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                //범위안의 nx , ny
                if(nx>=0&&nx<n&&ny>=0&&ny<n){
                    //현재의 sum + ny의 합이 다음 sum의 합보다 작다면 체인지
                    if(sum[cx][cy] + map[nx][ny] < sum[nx][ny]){
                        sum[nx][ny] = sum[cx][cy] + map[nx][ny];
                        q.add(new Point(nx,ny));
                    }
                }
            }
        }

    }


}


/*
1249. [S/W 문제해결 응용] 4일차 - 보급로

//시간 초과나는 코드.. dfs로 할 시 시간초과
 */

//public class T_1249 {
//    static int[][] map;
//    static int[][] visited;
//    static int min;
//    static int[] dx = {1,0,-1,0};
//    static int[] dy = {0,1,0,-1};
//    static int n;
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int t = Integer.parseInt(br.readLine());
//        for(int tc=1; tc<=t; tc++){
//            //초기화
//            min = Integer.MAX_VALUE;
//            n = Integer.parseInt(br.readLine());
//            map = new int[n][n];
//            for(int i=0; i<n; i++){
//                String s = br.readLine();
//                for(int j=0; j<n; j++)
//                    map[i][j] = Integer.valueOf(s.charAt(j)+"");
//            }
//            visited = new int[n][n];
//
//            visited[0][0] = 1;
//            long start = System.currentTimeMillis();
//            dfs(0,0,0);
//
//            long end = System.currentTimeMillis();
//            System.out.println("time"+ (end-start)/1000);
//            sb.append("#"+tc+" "+min+"\n");
//
//        }
//        System.out.print(sb.toString());
//    }
//
//    public static void dfs(int x, int y, int depth){
//        depth += map[x][y];
//        //min보다 큰 depth가 크면 return;
//        if(min<depth) return;
//        //마지막 값이면 min 값 얻고 return
//        if(x==n-1&&y==n-1){
//            min = Math.min(min,depth);
//            return;
//        }
//
//        //4방향 탐색
//        for(int i=0; i<4; i++){
//            int nx = x + dx[i];
//            int ny = y + dy[i];
//
//            //범위내
//            //연결 o && 방문 x
//            if(nx>=0&&nx<n&&ny>=0&&ny<n){
//                if(visited[nx][ny]==0){
//                    visited[nx][ny] = 1;
//                    dfs(nx,ny,depth);
//                    visited[nx][ny] = 0;
//                }
//            }
//        }
//
//    }
//
//}