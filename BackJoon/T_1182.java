package BackJoon;

/*
1182. 부분집합의 합

기본 dfs 찍기 depth를 파고 찍는다.

인풋되어진 다음 수부터의 '범위' 탐색하는 것이 포인트
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_1182 {
    static int n, s;
    static int[] list;
    static int count;
    static int sum;
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //input
        String[] ss = br.readLine().split(" ");
        n = Integer.parseInt(ss[0]); s = Integer.parseInt(ss[1]);
        list = new int[n];
        ss = br.readLine().split(" ");
        for(int i=0; i<n; i++) list[i] = Integer.parseInt(ss[i]);

        count = 0;
        for(int i=0; i<n; i++) {
            visited = new int[n];
            visited[i] = 1;
            sum  = list[i];
            dfs(i, sum);
        }
        System.out.print(count);
    }
    public static void dfs(int x, int sum){
        //만일 현재까지의 숫자 합이 k와 같다면
        if(sum==s) {
            count++;
        }

        //연결된 노드 모두 탐색 //본인 포함.
        for(int i=x+1; i<list.length; i++){

            //방문한 적이 있다면 돌아감.
            if(visited[i]==1) continue;
            visited[i] = 1;
            dfs(i,sum+list[i]);
            visited[i] = 0;
        }


    }
}
