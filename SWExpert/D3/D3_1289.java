package SWExpert.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;

/*
1289. 원재의 메모리 복구하기

 */
public class D3_1289 {
    static Queue<Integer> orgQ;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n,m;
        int t = Integer.parseInt(br.readLine());

        //시작
        for(int tc=1; tc<=t; tc++ ){
            String bit = br.readLine();
            int count = 0;
            for(int i=0; i<bit.length(); i++){
                if(bit.charAt(i)=='1'){
                    count++;
                    for(int j=i; j<bit.length()-1; j++){
                        if(bit.charAt(j)!=bit.charAt(j+1)){
                            count++;
                        }
                    }
                    break;
                }
            }

            sb.append("#"+tc+" " + count + "\n");
        }

        System.out.print(sb.toString());

    }


}

