package BackJoon;



/*
2178. 미로 탐색

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;



public class T_2178 {
    static class Index{
        int x,y;
        public Index(int x, int y){
            this.x = x;
            this.y = y;
        }

    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ss = br.readLine().split(" ");

        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);

        int[][] map = new int[n][m];
        for(int i=0; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(s.charAt(j)+"");
            }
        }
        int[][] visited = new int[n][m];
        //target dot;
        int targetX = n - 1;
        int targetY = m - 1;
        Index a = new Index();
        //x,y 회전
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        Queue<Index> q = new LinkedList<>();
        q.add(new Index(0,0));
        visited[0][0] = 1;
        //처음 넣을 때 이미 한번 카운터
        int cnt = 1;
        int check = 0;
        while(!q.isEmpty()){

            int size = q.size();
            //그 다음 단계를 탐색
            while(size!=0){
                //현재 index 꺼냄
                Index temp = q.poll();
                int curX = temp.x;
                int curY = temp.y;
                size--;
                //회전
                for(int i=0; i<4; i++){
                    int nextX = curX + dx[i];
                    int nextY = curY + dy[i];
                    if(nextX == targetX && nextY == targetY){
                        check = 1;
                        break;
                    }
                    if(nextX >= 0 && nextX < n && nextY >= 0 && nextY <m){
                        //연결되있고, 방문한적이 없을 때 그 값을 Queue에 add하고 방문 체크
                        if(map[nextX][nextY] == 1 && visited[nextX][nextY] == 0){
                            q.add(new Index(nextX, nextY));
                            visited[nextX][nextY] = 1;
                        }
                    }
                }
                if(check==1)
                    break;
            }
            cnt++;

            if(check==1)
                break;
        }

        System.out.println(cnt);





        br.close();
    }
}

