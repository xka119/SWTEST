package SWExpert.D2;

/*
1970. 쉬운 거스름돈

나머지는 몫의 mod값

 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2_Easy_Exchange {

    static int[] table;
    static final int SIZE = 8;
    static int[] map = {50000,10000,5000,1000,500,100,50,10};


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        int n;
        for (int testcase = 1; testcase <= t; testcase++) {
            n = Integer.parseInt(br.readLine().trim());
            table = new int[SIZE];
            for(int i=0; i<SIZE; i++){
                table[i] = n/map[i];
                n %=map[i];
            }


            System.out.println("#"+testcase);
            for(int i : table){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}







