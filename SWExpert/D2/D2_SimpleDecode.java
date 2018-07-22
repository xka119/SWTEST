package SWExpert.D2;

/*
1946. 간단한 압축 풀기

static class 사용
String, Integer 바구니 만들어서 활용
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_SimpleDecode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n;
        int count;
        Set[] list;
        for(int tc=1; tc<=t; tc++){
            count= 0;
            n = Integer.parseInt(br.readLine());
            list = new Set[n];

            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                list[i] = new Set(st.nextToken().trim(), Integer.parseInt(st.nextToken().trim()));
            }


            sb.append("#"+tc+"\n");
            for(int i=0; i<n; i++){
                for(int j=list[i].getNum(); j>0; j--){
                    count++;
                    sb.append(list[i].getString());
                    if(count==10) {
                        sb.append("\n");
                        count = 0;
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static class Set{
        String s;
        int n;
        public Set(String s, int n){
            this.s = s;
            this.n = n;
        }
        public void setString(String s){
            this.s = s;
        }
        public void setNum(int n){
            this.n = n;
        }
        public String getString(){
            return s;
        }
        public int getNum(){
            return n;
        }

    }

}





