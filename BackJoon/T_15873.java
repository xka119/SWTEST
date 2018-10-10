package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
15873. 공백 없는 A+B

뒤에서부터 체크
 */
public class T_15873 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String s = br.readLine();
        int sum = 0;

        for(int i=s.length()-1; i>=0; i--){
            //현재 숫자가 0이라면
            if(s.charAt(i)=='0'){
                //다음 숫자는 반드시 숫자
                sum += Integer.parseInt(s.substring(i-1, i+1));
                i--;
            }else{
                //숫자가 0이아니라면
                sum += Integer.parseInt(s.charAt(i)+"");
            }
        }



        System.out.print(sum);


    }

}
