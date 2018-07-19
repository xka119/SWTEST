package SWExpert.D2;

/*
2001. 파리 퇴치

4중포문

        1)nArr.length-1-m+1*2만큼 순회한다.
        2)처음부터 돌면서 m만큼의 인덱스 대각선의 합을 더한다
        3)max와 비교후 더 크면 max와 바꾸고 계속 순회한다

 */


import java.util.Scanner;
import java.util.StringTokenizer;

public class D2_Paris {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        int t = sc.nextInt();
        sc.nextLine();
        int n,m;
        int[][] nArr;
        int sum;

        for (int testcase = 0; testcase < t; testcase++) {

            st = new StringTokenizer(sc.nextLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            nArr = new int[n][n];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(sc.nextLine());
                for(int j=0; j<n; j++){
                    nArr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sum = getParis(nArr, m);

            System.out.println("#" + (testcase + 1)+" "+ sum);

        }

    }
    public static int getParis(int[][] nArr, int m){
        int max = 0;
        int temp = 0;
        int len = nArr.length-m+1;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                for(int k=i; k<i+m; k++){
                    for(int q=j; q<j+m; q++){
                        temp += nArr[k][q];
                    }
                }
                if(max<temp)
                    max = temp;

                temp = 0;

            }
        }


        return max;


    }
}







