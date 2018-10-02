package BackJoon;


/*
5622. 다이얼
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_5622 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        String s = br.readLine();

        int sum = 0;

        for(int i=0; i<s.length(); i++){
            char t = s.charAt(i);
            if(t=='A'||t=='B'||t=='C'){
                sum += 3;
            }else if(t=='D'||t=='E'||t=='F'){
                sum +=4;
            }else if(t=='G'||t=='H'||t=='I'){
                sum +=5;
            }else if(t=='J'||t=='K'||t=='L'){
                sum +=6;
            }else if(t=='M'||t=='N'||t=='O'){
                sum +=7;
            }else if(t=='P'||t=='Q'||t=='R'||t=='S'){
                sum +=8;
            }else if(t=='T'||t=='U'||t=='V'){
                sum +=9;
            }else if(t=='W'||t=='X'||t=='Y'||t=='Z'){
                sum +=10;
            }else{

            }
        }
        System.out.print(sum);


    }
}