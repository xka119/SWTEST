package SWExpert.D3;

/*
4406. 모음이 보이지 않는 사람

String.contains or String.tocharArray;
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3_Cantsee {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        String s;

        int t = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= t; tc++) {
            s = br.readLine();

            for (int i = 0; i < 5; i++) {
                if (s.contains("a")) {
                    s = s.replaceAll("a", "");
                } else if (s.contains("e")) {
                    s = s.replaceAll("e", "");
                } else if (s.contains("o")) {
                    s = s.replaceAll("o", "");
                } else if (s.contains("u")) {
                    s = s.replaceAll("u", "");
                } else if (s.contains("i")) {
                    s = s.replaceAll("i", "");
                }
            }
            sb.append("#" + tc + " " + s + "\n");
        }
        System.out.print(sb.toString());
    }
}

