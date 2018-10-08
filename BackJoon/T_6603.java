package BackJoon;

/*
6603. 로또

기본 dfs 찍기 depth를 파고 찍는다.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class T_6603 {
    static StringBuilder sb = new StringBuilder();
    static int[] roto;
    static int[] visited;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] ss = br.readLine().split(" ");
            if (ss.length == 1) {
                break;
            }else{
                //dfs해야되는데 먼저 map을 만듬.
                //ss[1]부터~
                roto = new int[ss.length-1];
                for(int i=0; i<roto.length; i++){
                    roto[i] = Integer.parseInt(ss[i+1]);
                }
                //dfs를 돌리면되는데 언제까지? s의 개수는 6개니까
                for(int i=0; i<=roto.length-6; i++){
                    list = new ArrayList<>();
                    visited = new int[roto.length];
                    visited[i] = 1;
                    list.add(roto[i]);
                    dfs(i, 1); //인덱스 번호 삽입
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
    public static void dfs(int x, int depth){ //dfs를 하는데 어떻게하냐? 어차피 모두 연결 되있으니까. 들어와서 탐색
        // depth 가 6이면 탈출
        if(depth==6) {
            for(int i=0; i<list.size(); i++){
                sb.append(list.get(i)+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=x+1; i<roto.length; i++){
            //모든 노드를 탐색
            //범위 내
            //다음 노드는 항상 방문 가능함. 그러니까
            visited[i] = 1;
            list.add(roto[i]);
            dfs(i,depth+1);
            visited[i] = 0;
            list.remove(list.size()-1);
        }

    }
}
