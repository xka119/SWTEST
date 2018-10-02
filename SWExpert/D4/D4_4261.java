package SWExpert.D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
4261. 빠른 휴대전화 키패드

Map을 사용하면 여러 key 값을 동일한 값에 매칭시킬 때 장점이 있음.!! 정답률 53퍼
 */
public class D4_4261 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a',2); map.put('b',2); map.put('c',2);
        map.put('d',3); map.put('e',3); map.put('f',3);
        map.put('g',4); map.put('h',4); map.put('i',4);
        map.put('j',5); map.put('k',5); map.put('l',5);
        map.put('m',6); map.put('n',6); map.put('o',6);
        map.put('p',7); map.put('q',7); map.put('r',7); map.put('s',7);
        map.put('t',8); map.put('u',8); map.put('v',8);
        map.put('w',9); map.put('x',9); map.put('y',9); map.put('z',9);

        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            String[] ss = br.readLine().split(" ");
            String s = ss[0];
            int n = Integer.parseInt(ss[1]);
            String[] word = br.readLine().split(" ");
            int count = 0;
            String temp = "";
            String check = "";
            for(int i=0; i<n; i++){
                temp = word[i];
                for(int j=0; j<temp.length(); j++){
                    check += map.get(temp.charAt(j));
                }
                if(s.equals(check))
                    count++;
                check = "";
            }

            sb.append("#"+tc+" "+count+"\n");
        }
        System.out.print(sb.toString());


    }
}
