package BackJoon;


/*
1157. 단어 공부

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordStudy {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // A - 65 = 0
        // B - 65 = 1
        // index 기준.
        // a = 0 ....   z = 25;
        int SIZE = 26;
        int[] count = new int[SIZE];
        int max = -1;
        boolean check = false;
        int index = -1;

        //compare
        String s = br.readLine().toUpperCase();
        int len = s.length();
        for(int i=0; i<len; i++){
            int n = (int)s.charAt(i) - 65;
            count[n]++;
        }

        //result
        for(int i=0; i<SIZE; i++){
            if(max<count[i] && count[i] !=0){
                max = count[i];
                index = i;
                check = false;
            }else if(max == count[i]){
                check = true;
            }
        }

        if(check){
            System.out.print("?");
        }else{
            System.out.print((char)(index+65));
        }




    }
}