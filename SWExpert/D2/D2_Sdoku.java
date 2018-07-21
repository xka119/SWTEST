package SWExpert.D2;

/*
1974. 스도쿠 검증

모든 경우 비교
가로, 세로, 작은네모
함수구현
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2_Sdoku {
    static final int SIZE = 9;
    static int[][] map;
    static int[] answers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int answer;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        for (int testcase = 1; testcase <= t; testcase++) {
            map = new int[SIZE][SIZE];
            answer = -1;
            for (int i = 0; i < SIZE; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            /*
            1. 가로줄 1~9있는지 확인 없으면 -1 출력
            2. 세로줄 1-~9있는지 확인 없으면 -1 출력
            3. 칸마다 확인 없으면 -1 출력
             */


            //가로
            answer = getAnswer();
            if(answer==0){
                System.out.println("#" + testcase + " " + answer);
            }else{
                //세로
                answer = getAnswer2();
                if(answer==0){
                    System.out.println("#" + testcase + " " + answer);
                }else{
                    answer = getAnswer3();
                    System.out.println("#" + testcase + " " + answer);
                }
            }

        }

    }

    public static int getAnswer() {
        for (int i = 0; i < SIZE; i++) {
            int[] temp = new int[SIZE];
            for (int j = 0; j < SIZE; j++) {
                temp[j] = map[i][j];
            }
            Arrays.sort(temp);
            for (int k = 0; k < SIZE; k++) {
                if (temp[k] != answers[k]) {
                    return 0;
                }
            }
        }
        return 1;
    }
    public static int getAnswer2(){
        for (int i = 0; i < SIZE; i++) {
            int[] temp = new int[SIZE];
            for (int j = 0; j < SIZE; j++) {
                temp[j] = map[j][i];
            }
            Arrays.sort(temp);
            for (int k = 0; k < SIZE; k++) {
                if (temp[k] != answers[k]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int getAnswer3(){
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                int[] temp = new int[SIZE];
                int t =0;
                for(int a=i; a<i+3; a++){
                    for(int b=j; b<j+3; b++){
                        temp[t++] = map[a][b];
                    }
                }
                Arrays.sort(temp);
                for(int k=0; k<SIZE; k++){
                    if(temp[k]!= answers[k]){
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}







