package SWExpert.D1;

/*
2068. 최대수 구하기

StringTokenizer default = " "
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class D1_MAX {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        int t = sc.nextInt();
        sc.nextLine();
        int max;
        int temp;
        for(int testcase=0; testcase<t; testcase++){
            max = -1;

            st = new StringTokenizer(sc.nextLine());
            while(st.hasMoreTokens()){
                if(max == -1){
                    max = Integer.parseInt(st.nextToken());
                }else{
                    max = Math.max(max, Integer.parseInt(st.nextToken()));
                }
            }
            System.out.println("#"+(testcase+1)+" "+ max);

        }


    }
}

