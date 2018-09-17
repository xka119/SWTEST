package BackJoon;


/*
1932. 정수 삼각형

 DP 기초문제
 1) 입력 배열, 정답 배열
 2) 고정적인 값은 직접 입력, 나머지는 for문

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IntTriangle {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n+1][n+1];
        for(int i=1; i<n+1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<i+1; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //answer make
        int[][] ans = new int[n+1][n+1];
        // 6, 7인데? 인덱스는 5랑 6
        // 첫번째는 그 숫자가 최대값임
        ans[1][1] = map[1][1];
        ans[2][1] = map[1][1] + map[2][1];
        ans[2][2] = map[1][1] + map[2][2];

        //비교를 수행해야됨 어디까지? map의 마지막까지..
        int x,y;
        for(int i=3; i<n+1; i++){
            for(int j=1; j<i+1; j++){
                //첫번째 값과
                //두번째 값을 구해서
                x = ans[i-1][j-1] + map[i][j];
                y = ans[i-1][j] + map[i][j];

                //더큰값을 비교
                if(x>y) {
                    ans[i][j] = x;
                }
                else {
                    ans[i][j] = y;
                }
            }
        }

        int[] max = ans[n];
        Arrays.sort(max);

        System.out.print(max[n]);

    }
}

