package SWExpert.D2;

/*
1986. 지그재그 숫자

BufferedReader > Scanner 속도

BufferedReader를 사용하도록하자
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2_ZigZag {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(br.readLine());

        int sum;
        for(int testcase=1; testcase<=t; testcase++){
            sum = 0;
            int n = Integer.parseInt(br.readLine());
            for(int i=1; i<=n; i++){
                if(i%2==0){
                    sum -= i;
                }else{
                    sum += i;
                }
            }

            System.out.println("#"+testcase+" "+ sum);
        }





    }
}







