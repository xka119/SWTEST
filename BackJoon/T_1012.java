package BackJoon;


/*
1012. 유기농 배추

옛날에는 DFS로 풀었는데.. 흠.. DFS코드가 더 짧긴함.

40분 걸림
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class T_1012 {
    static class Index{
        int x,y;
        public Index(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int tc=1; tc<=t; tc++){
            String[] ss = br.readLine().split(" ");
            // 가로 m , 세로 n, 배추 개수 k
            int m = Integer.parseInt(ss[0]);
            int n = Integer.parseInt(ss[1]);
            int k = Integer.parseInt(ss[2]);

            int[][] map = new int[m][n];
            //배추 입력
            for(int i=0; i<k; i++){
                ss = br.readLine().split(" ");
                int x = Integer.parseInt(ss[0]);
                int y = Integer.parseInt(ss[1]);
                map[x][y] = 1;
            }

            int[][] visited = new int[m][n];
            int[] dx = {1,0,-1,0};
            int[] dy = {0,1,0,-1};

            Queue<Index> q = new LinkedList<>();
            //시작점 입력
            int count = 0;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    //인접하고 방문한적이 없다면 BFS 시작
                    if(map[i][j] == 1 && visited[i][j] ==0){
                        q.add(new Index(i,j));
                        visited[i][j] = 1;

                        while(!q.isEmpty()){
                            Index temp = q.poll();
                            int curX = temp.x;
                            int curY = temp.y;

                            for(int d=0; d<4; d++){
                                int nextX = curX + dx[d];
                                int nextY = curY + dy[d];

                                if(nextX>=0 && nextX<m && nextY>=0 && nextY<n){
                                    if(map[nextX][nextY] == 1){
                                        if(visited[nextX][nextY] == 0){
                                            q.add(new Index(nextX,nextY));
                                        }
                                    }
                                    visited[nextX][nextY] = 1;
                                }
                            }
                        }
                        count++;
                    }
                }
            }
            sb.append(count+"\n");
        }
        System.out.print(sb.toString());

    }
}
