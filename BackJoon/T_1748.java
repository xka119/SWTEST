package BackJoon;


/*
1748. 수 이어 쓰기 1

공식을 만들자
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T_1748 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        int n = Integer.parseInt(br.readLine());

        int len = String.valueOf(n).length();

        int[] arr = new int[9];
        arr[1] = 9;
        for(int i=2; i<9; i++){
            arr[i] = 9 * (int)Math.pow(10,i-1) * i + arr[i-1];
        }

        if(len == 1){
            ans = n;
        }else{
            ans = arr[len-1] + (n - (int)Math.pow(10, len-1) + 1) * len;
        }

        System.out.print(ans);

    }
}

