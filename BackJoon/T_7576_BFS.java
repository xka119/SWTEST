package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
7576. 토마토

40분안걸린듯? bfs, queue의 사이즈 별로 day를 나누어서 탐색. 정답률 27퍼

 */
public class T_7576_BFS {
    static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int m,n; //가로 세로
    static int[][] map;
    static int[][] visited;
    static int day = 0; //최소 날짜
    static int check = 0;

    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<Point> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==0) check++;
                if(map[i][j]==1) { //1이라면 익은 토마토를 넣어준다.
                    q.add(new Point(i,j));
                    visited[i][j] = 1;
                }
            }
        }
        //안익은 토마토가 하나도 없으면
        if(check==0){
            System.out.print(0);
        }else{
            //안익은 토마토가 있으면
            bfs();

            System.out.print(day);
        }
		/*
		 * 1. 토마토가 모두 익엇는지 확인하는 함수
		 * 2. 토마토를 익게만드는 함수.
		 * 하루만큼 토마토를 익게만드는 함수를 돌린다.
		 * -> 그리고 토마토가 모두 익엇는지 확인한다.
		 * -> 토마토가 모두 익었다면 그때의 값을 day에 저장.
		 * 그런데 입력하기전에 처음에 check를 해주어야함 처음부터 0 인게 발견된벼수
		 */
    }
    public static void bfs(){
        while(!q.isEmpty()){
            int size = q.size();
            while(size!=0){
                Point temp = q.poll();
                int x = temp.x;
                int y = temp.y;

                //4방향 탐색
                for(int i=0; i<4; i++){
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    //범위외 좌표, 방문했으면 continue;
                    if(nx<0||nx>=n||ny<0||ny>=m) continue;
                    if(visited[nx][ny]==1) continue;

                    //그게 아니라면 q에 삽입, 방문 추가, 현재 좌표를 익은 좌표로 변경
                    if(map[nx][ny]==0){
                        q.add(new Point(nx, ny));
                        visited[nx][ny] = 1;
                        map[nx][ny] = 1;
                    }
                }
                size--; //한번 탐색후 다른 사이즈 감소
            }
            day++; //하루 탐색을 맞췄으니까 day를 증가
            if(isReap()) break;	//	하루 탐색을 맞추고 토마토가 모두 익엇는지 확인하기.
        }
        //q가 비어서 나온경우 토마토가 모두 익엇는지 확인
        if(isReap()){
            //토마토가 모두 익었다면 // 종료
        }else{
            day = -1;//안익었다면 day = -1 출력
        }
        //q가 비어있으면 자동 종료.
    }

    //토마토 확인
    public static boolean isReap(){
        //하루를 증가시키고 모두 익었는지 확인
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==0) return false;
            }
        }
        return true;
    }




}


