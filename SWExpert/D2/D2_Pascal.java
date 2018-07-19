package SWExpert.D2;

/*
2005. 파스칼의 삼각형

이중 for문 i,j 연동

이중 자료구조 초기화하기
if문으로 에러 걸러내기
StringBuilder로 속도 줄이기
 */


import java.io.IOException;
import java.util.Scanner;

public class D2_Pascal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;
        int t = sc.nextInt();
        int n;
        int[][] arr;
        for (int testcase = 0; testcase < t; testcase++) {
            sb = new StringBuilder();
            n = sc.nextInt();
            arr = new int[n][];
            arr[0] = new int[1];
            arr[0][0] = 1;
            sb.append(arr[0][0] + "\n");

            for (int i = 1; i < n; i++) {
                arr[i] = new int[i + 1];
                for (int j = 0; j <= i; j++) {
                    //처음값과 끝값은 그위의 인덱스만 참고
                    if (j == 0) {
                        arr[i][j] = arr[i - 1][j];
                        sb.append(arr[i][j] + " ");
                    } else if (j == i) {
                        arr[i][j] = arr[i - 1][j - 1];
                        sb.append(arr[i][j] + " ");
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                        sb.append(arr[i][j] + " ");
                    }
                }
                sb.append("\n");
            }

            System.out.println("#" + (testcase + 1));
            System.out.print(sb.toString());

        }

    }
}







