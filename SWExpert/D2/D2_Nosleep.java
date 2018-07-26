package SWExpert.D2;

/*
1288. 새로운 불면증 치료법

모든 경우의 수를 파악하고 아웃풋을 고려해야함.
1등 답지 = HashSet!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_Nosleep {
    static int i,nt,size,count,ts;
    static int[] yang;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        int n;

        for(int tc=1; tc<=t; tc++){
            yang = new int[10];
            for(int a=0; a<10; a++){
                yang[a] = -1;
            }
            n = Integer.parseInt(br.readLine().trim());
            sb.append("#"+tc+" "+ getYang(n,yang) +"\n");
        }
        System.out.print(sb.toString());
    }

    public static int getYang(int n, int[] yang){
        i = 1;
        boolean indexCheck;
        boolean check = false;
        while(!check){
            indexCheck = false;
            nt = n*(i++);
            size = 1000000;
            int index;
            count = -1;
            while(count!=0){
                if(size==0)
                    break;
                index = nt/size;
                if(index>0){
                    if(!indexCheck){
                        ts = size;
                        count = 0;
                        indexCheck = true;
                        while(ts!=0){
                            count++;
                            ts /= 10;
                        }
                    }
                    yang[index] = index;
                    nt %= size;
                    count--;
                }

                size /= 10;

                //key point count가 존재하면서 size 가 0이면 반드시 0이 포함된 숫자인경우이므로 reset .. 그러나 중복인데..
                if(count != 0  && size == 0){
                    yang[0] = 0;
                    break;
                }
            }

            for(int j=0; j<yang.length; j++){
                if(yang[j]==j){
                    if(j==yang.length-1) {
                        check = true;
                    }
                }else{
                    break;
                }
            }
        }
        return n*(--i);
    }
}





