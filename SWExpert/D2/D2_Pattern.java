package SWExpert.D2;

/*
2007. 패턴 마디의 길이

이중 for문 i,j 연동
subString(a,b) 맨 처음값 ~ 끝값 전값까지

best answer-------------------------------------------------------

            while (true) {
                a = s.substring(0, ans);
                b = s.substring(ans, ans + ans);

                if (a.equals(b))
                    break;
                else
                    ans++;
            }
 */

import java.util.Scanner;

public class D2_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        int length;
        for(int testcase=0; testcase<t; testcase++){
            String s = sc.nextLine();
            length = -1;
            for(int i=1; i<s.length(); i++){
                if (s.charAt(0) == s.charAt(i)) {
                    for(int j=i; j<s.length(); j+=i){
                        try{
                            if(s.substring(0,i).equals(s.substring(j, j+i))){
                                length = s.substring(0,i).length();
                            }else{
                                i = j+i;
                                break;
                            }
                        }catch(Exception e){

                        }
                    }
                }
                if(length!=-1){
                    break;
                }
            }

            System.out.println("#"+(testcase +1)+" "+length);

        }


    }

}




