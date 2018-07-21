package SWExpert.D2;

/*
1984. 중간 평균값 구하기

Array -> Sort 1~9
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_Mid_Avg {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        double sum;
        int max;
        int min;
        int temp;
        for(int testcase=1; testcase<=t; testcase++){
            sum = 0;
            min = 10001;
            max = -1;

            st = new StringTokenizer(br.readLine());

            for(int i=0; i<10; i++) {
                temp = Integer.parseInt(st.nextToken());
                sum += temp;
                if(temp>max){
                    max = temp;
                }
                if(temp<min){
                    min = temp;
                }
            }

            System.out.println("#"+testcase+" "+ Math.round((sum-(max+min))/8));
        }





    }
}






