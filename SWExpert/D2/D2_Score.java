package SWExpert.D2;

/*
1983. 조교의 성적 매기기

몫의 범위를 구하는 것이 포인트
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class D2_Score {

    static ArrayList<Double> list;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        int n,k;
        double k_item;


        for(int testcase=1; testcase<=t; testcase++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            list = new ArrayList<>();
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                list.add( ((Double.parseDouble(st.nextToken())*0.35)+(Double.parseDouble(st.nextToken())*0.45)+(Double.parseDouble(st.nextToken())*0.20)));
            }
            k_item = list.get(k-1);

            Collections.sort(list);
            Collections.reverse(list);



            System.out.println("#"+testcase+" "+ getScore(k_item, n));
        }


    }

    public static String getScore(double k_item, int n){
        String s="";
        int size = n/10;

        /*
        1)먼저 k_item과 같은 위치에 있는 값의 인덱스를 구한다
        2)
         */
        int index=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(k_item))
                index = i;
        }
        if((index/size)==0){
            s = "A+";
        }else if((index/size)==1){
            s = "A0";
        }else if((index/size)==2){
            s = "A-";
        }else if((index/size)==3){
            s = "B+";
        }else if((index/size)==4){
            s = "B0";
        }else if((index/size)==5){
            s = "B-";
        }else if((index/size)==6){
            s = "C+";
        }else if((index/size)==7){
            s = "C0";
        }else if((index/size)==8){
            s = "C-";
        }else if((index/size)==9){
            s = "D0";
        }

        return s;



    }
}







