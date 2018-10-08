package SWExpert.D3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
1221. [S/W 문제해결 기본] 5일차 - GNS 25분

사소한 글자 오류 자세히 보자. 정답률 56퍼

 */
public class D3_1221 {
    static String[] table = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
    static int t, len;
    static String trash;
    static int[] num;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String[] ss = br.readLine().split(" ");
            trash = ss[0];
            len = Integer.parseInt(ss[1]);

            String tt = br.readLine();
//            tt = tt.substring(0,7041);
            ss = tt.split(" ");
            num = new int[ss.length];
            wordToNum(ss);
            Arrays.sort(num);
            sb.append(trash+"\n");
            numToWord();
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
    public static void numToWord(){
        for(int i=0; i<num.length; i++){
            if(num[i] == 0){ sb.append(table[0]+" "); continue;}
            if(num[i] == 1){ sb.append(table[1]+" "); continue;}
            if(num[i] == 2){ sb.append(table[2]+" "); continue;}
            if(num[i] == 3){ sb.append(table[3]+" "); continue;}
            if(num[i] == 4){ sb.append(table[4]+" "); continue;}
            if(num[i] == 5){ sb.append(table[5]+" "); continue;}
            if(num[i] == 6){ sb.append(table[6]+" "); continue;}
            if(num[i] == 7){ sb.append(table[7]+" "); continue;}
            if(num[i] == 8){ sb.append(table[8]+" "); continue;}
            if(num[i] == 9){ sb.append(table[9]+" "); continue;}
        }
    }
    public static void wordToNum(String[] word) {
        for(int i=0; i<word.length; i++){
            if(word[i].equals("ZRO")){ num[i] = 0; continue;}
            if(word[i].equals("ONE")){ num[i] = 1; continue;}
            if(word[i].equals("TWO")){ num[i] = 2; continue;}
            if(word[i].equals("THR")){ num[i] = 3; continue;}
            if(word[i].equals("FOR")){ num[i] = 4; continue;}
            if(word[i].equals("FIV")){ num[i] = 5; continue;}
            if(word[i].equals("SIX")){ num[i] = 6; continue;}
            if(word[i].equals("SVN")){ num[i] = 7; continue;}
            if(word[i].equals("EGT")){ num[i] = 8; continue;}
            if(word[i].equals("NIN")){ num[i] = 9; continue;}

        }


    }
}


