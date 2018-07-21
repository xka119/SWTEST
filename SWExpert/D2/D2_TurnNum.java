package SWExpert.D2;

/*
1961. 숫자 배열 회전


for문 및 배열을 원활하게 이해하는가?
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_TurnNum {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n;
        int[][] map;
        String[][] answer;
        for (int testcase = 1; testcase <= t; testcase++) {
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            answer = new String[n][3];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //세가지 방향 각각 수행해야함.
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    String s = "";
                    //90도
                    if (i == 0) {
                        for (int q = n - 1; q >= 0; q--) {
                            s += String.valueOf(map[q][j]);
                        }
                    } else if (i == 1) {
                        //180도
                        for (int q = n - 1; q >= 0; q--) {
                            s += String.valueOf(map[n - 1 - j][q]);
                        }
                    } else {
                        //270도
                        for (int q = 0; q < n; q++) {
                            s += String.valueOf(map[q][n - 1 - j]);
                        }
                    }
                    answer[j][i] = s;
                }
            }

            System.out.println("#"+testcase);
            for(int i=0; i<n; i++){
                for(int j=0; j<3; j++){
                    System.out.print(answer[i][j]+" ");
                }
                System.out.println("");
            }

        }
    }
}
