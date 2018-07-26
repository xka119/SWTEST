package SWExpert.D3;

/*
4751. 다솔이의 다이아몬드 장식

실행시간 1등
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3_Deco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] line;
        String s;
        int t = Integer.parseInt(br.readLine().trim());
        for(int tc=1; tc<=t; tc++) {
            line = new String[3];
            s = br.readLine().trim();

            if(s.length()==1){
                line[0] = "..#..";
                line[1] = ".#.#.";
                line[2] = "#."+s+".#";
                sb.append(line[0]+"\n"+line[1]+"\n"+line[2]+"\n"+line[1]+"\n"+line[0]+"\n");
            }else{
                line[0] = ".#..";
                line[1] = "#.#.";

                for(int i=0; i<2; i++){
                    sb.append(".");
                    for(int j=0; j<s.length(); j++){
                        sb.append(line[i]);
                    }
                    sb.append("\n");
                }
                sb.append("#");
                for(int i=0; i<s.length(); i++){
                    sb.append("."+s.charAt(i)+".#");
                }
                sb.append("\n");
                for(int i=1; i>=0; i--){
                    sb.append(".");
                    for(int j=0; j<s.length(); j++){
                        sb.append(line[i]);
                    }
                    sb.append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}
