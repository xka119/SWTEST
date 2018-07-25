package SWExpert.D2;

/*
1928. Base64 Decoder

정답 참고했음
Java에서 Base64 Decoder 라이브러리 사용..

Base64 Decoder - Encoder 활용하기

3바이트 세글자 -> 6비트씩 네글자로 암호화
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.Base64.Decoder;

public class D2_Base64_Decoder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        for(int tc=1; tc<=t; tc++){
            String s = br.readLine();
            Decoder d = Base64.getDecoder();
            sb.append("#"+tc+" "+ new String(d.decode(s))+"\n");
        }
        System.out.println(sb.toString());
    }
}





