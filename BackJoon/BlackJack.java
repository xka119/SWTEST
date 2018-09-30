package BackJoon;


/*
2798. 블랙잭

적은 수의 조합 문제는 3중 포문으로 만들기. for문 변수는 1씩 증가, 범위는 1씩 감소
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String[] ss = br.readLine().split(" ");

        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);

        int[] a = new int[n];
        ss = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(ss[i]);
        }

        int max = 0;
        for(int i=0; i<n-2;i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(a[i]+a[j]+a[k] <= m && max <= a[i]+a[j]+a[k])
                        max = a[i]+a[j]+a[k];
                }
            }
        }
        System.out.print(max);

        br.close();
    }
}

