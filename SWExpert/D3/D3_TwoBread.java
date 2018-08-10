package SWExpert.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
5162. 두가지 빵의 딜레마

둘 중에 작은 값이 곧 최대개수
*/
public class D3_TwoBread {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        for(int tc=1; tc<=t; tc++){
            String[] ss = br.readLine().split(" ");
            sb.append("#"+tc+" "+get(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]),Integer.parseInt(ss[2]))+"\n");
        }
        System.out.print(sb.toString());
    }
    public static int get(int a, int b, int c){
        int count = 0;
        //m>n
        int m,n;

        if(a>b){
            m = a;
            n = b;
        }else{
            m = b;
            n = a;
        }
        int d = c/n;
        count = d;
        int temp = c;
        int temp_a=0;
        for(int i=d; i>=0; i--){
            temp = c;
            temp -= i*n;
            temp_a = temp/m;
            if(count<i+temp_a)
                count = i+temp_a;
        }
        return count;
    }

}