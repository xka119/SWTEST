package SWExpert.D3;

import java.io.*;

/*
3750. Digit sum

System.out.println vs BufferedWriter 속도는??
*/
public class D3_DigitSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        for(int tc=1; tc<=t; tc++){
            sb.append("#"+tc+" "+get(br.readLine())+"\n");
        }
        System.out.print(sb.toString());
    }
    public static int get(String s){
        String temp = s;
        int sum;
        while(true) {
            int size = temp.length();
            sum = 0;
            for (int i = 0; i < size; i++) {
                sum += Integer.parseInt(temp.charAt(i) + "");
            }
            temp = String.valueOf(sum);
            if(temp.length()==1) break;


        }
        return sum;
    }
}
