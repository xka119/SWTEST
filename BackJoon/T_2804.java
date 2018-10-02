package BackJoon;


/*
2804. 크로스워드 만들기

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2804 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] ss = br.readLine().split(" ");
        String a = ss[0];
        String b = ss[1];
        int n = a.length();
        int m = b.length();
        int x=0; int y=0;
        //원소 비교
        boolean check = false;
        for(int i=0; i<n; i++){
            if(b.contains(a.charAt(i)+"")){
                for(int j=0; j<m; j++){
                    if(a.charAt(i) == b.charAt(j)){
                        x = j;
                        y = i;
                        check = true;
                        break;
                    }
                }
            }
            if(check)
                break;
        }

        //출력
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==x){
                    sb.append(a);
                    break;
                }
                if(j==y)
                    sb.append(b.charAt(i));
                else
                    sb.append(".");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());

    }
}

