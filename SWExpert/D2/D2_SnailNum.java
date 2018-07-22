package SWExpert.D2;

/*

1954. 달팽이 숫자

과도한 중복....... 속도 1등 제출자 참고

StringBuilder로 String을 모두 더한 다음에 마지막에 출력하면 속도 향상할 수 있음
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_SnailNum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        int[][] nArr;
        int cnt;
        int i,j;
        int num;
        boolean check;
        for(int testcase=1; testcase<=t; testcase++){
            int n = Integer.parseInt(br.readLine());
            nArr = new int[n][n];
            cnt = n*n;
            i=0;
            j=-1;
            num = 1;
            check = false;
            /*
            1) j의 값이 n-1과 같을때까지 or nArr[i][j]의 값이 0이아닌 값이 있을때까지 j값 증가
            2) i의 값이 n-1과 같을때까지 or nArr[i][j]의 값이 0이아닌 값이 있을때까지 i값 증가
            3) j의 값이 0과 같을때까지 or nArr[i][j]의 값이 0이아닌 값이 있을때까지 j값 감소
            4) i의 값이 0과 같을때까지 or nArr[i][j]의 값이 0이아닌 값이 있을때까지 i값 감소
            5) 위의 수행은 n*n만큼 수행
             */
            if(n!=1) {
                while (cnt != 0) {
                    //1)
                    j++;
                    while (j < n || nArr[i][j] == 0) {
                        nArr[i][j] = num;
                        num++;
                        j++;
                        cnt--;
                        if (j == n) {
                            j--;
                            break;
                        }
                        if (nArr[i][j] != 0) {
                            if (cnt == 0) {
                                check = true;
                            }
                            j--;
                            break;
                        }
                    }
                    if (check)
                        break;
                    //2)
                    i++;
                    while (i < n || nArr[i][j] == 0) {
                        nArr[i][j] = num;
                        num++;
                        i++;
                        cnt--;
                        if (i == n) {
                            i--;
                            break;
                        }
                        if (nArr[i][j] != 0) {
                            if (cnt == 0) {
                                check = true;
                            }
                            i--;
                            break;
                        }
                    }
                    if (check)
                        break;
                    //3)
                    j--;
                    while (j != 0 || nArr[i][j] == 0) {
                        nArr[i][j] = num;
                        num++;
                        j--;
                        cnt--;
                        if (j == -1) {
                            j++;
                            break;
                        }
                        if (nArr[i][j] != 0) {
                            if (cnt == 0) {
                                check = true;
                            }
                            j++;
                            break;
                        }
                    }
                    if (check)
                        break;
                    //4)
                    i--;
                    while (i != 0 || nArr[i][j] == 0) {
                        nArr[i][j] = num;
                        num++;
                        i--;
                        cnt--;
                        if (i == -1) {
                            i++;
                            break;
                        }
                        if (nArr[i][j] != 0) {
                            if (cnt == 0) {
                                check = true;
                            }
                            i++;
                            break;
                        }
                    }
                    if (check)
                        break;

                }
                System.out.println("#"+testcase);
                for(int a=0; a<n; a++){
                    for(int b=0; b<n; b++){
                        System.out.print(nArr[a][b]+ " ");
                    }
                    System.out.println("");
                }
            }else{
                System.out.println("#"+testcase);
                System.out.println("1");

            }


        }




    }
}
