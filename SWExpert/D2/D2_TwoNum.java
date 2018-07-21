package SWExpert.D2;

/*
1959. 두 개의 숫자열

초기화는 필수
함수 구현
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_TwoNum {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n,m;
        int a[], b[];
        int max;
        for (int testcase = 1; testcase <= t; testcase++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            a = new int[n];
            b = new int[m];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                b[i] = Integer.parseInt(st.nextToken());
            }

            //더 큰값을 기준으로 시작
            if(n>m){
                max = getMax(b,a);
            }else{
                max = getMax(a,b);
            }


            System.out.println("#"+testcase+" "+ max);


        }

    }
    public static int getMax(int[] min, int[] max){
        int len = max.length-min.length+1;
        int min_len = min.length;
        int sum = 0;
        int top = 0;
        for(int i=0; i<len; i++){
            int k = i;
            for(int j=0; j<min_len; j++){
                sum += min[j]*max[k++];
            }
            if(top<sum)
                top = sum;

            sum = 0;
        }
        return top;

    }
}
