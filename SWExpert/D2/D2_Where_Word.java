package SWExpert.D2;

/*
1979. 어디에 단어가 들어갈 수 있을까

1시간 걸린듯..
앞 뒤의 exception 잡아주기. 뒤만 생각했음..

            1. 모든 인덱스를 순회한다
            2. 먼저 블랙인지 화이트인지 파악한다
            2. 배열범위내에서 파악하도록 범위 지정
            3. 화이트라면 오른쪽또 화이트인지 파악
             3-1. 화이트의 길이만큼 오른쪽 파악후 길이와 일치한다면 answer++
             3-2. 아니라면 세로로 파악한다 위와 같은 방법사용
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_Where_Word {


    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n,k;
        int[][] map;
        int answer;

        for(int testcase=1; testcase<=t; testcase++) {
            answer = 0;
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            map = new int[n][n];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }


            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(map[i][j]==1){
                        for(int q=1; q<k; q++){
                            if(j+q<n && map[i][j+q]==1){
                                q++;
                                if(q==k && j+q<n && map[i][j+q]==0){
                                    if(j-1>=0 && map[i][j-1]==0) {
                                        answer++;
                                        break;
                                    }else if(j-1<0){
                                        answer++;
                                        break;
                                    }
                                }else if(q==k && j+q>=n){
                                    if(j-1>=0 && map[i][j-1]==0) {
                                        answer++;
                                        break;
                                    }else if(j-1<0){
                                        answer++;
                                        break;
                                    }
                                }
                                q--;
                            }else{
                                break;
                            }
                        }
                        for(int q=1; q<k; q++){
                            if(i+q<n && map[i+q][j]==1){
                                q++;
                                if(q==k && i+q<n && map[i+q][j]==0){
                                    if(i-1>=0 && map[i-1][j]==0) {
                                        answer++;
                                        break;
                                    }else if(i-1<0){
                                        answer++;
                                        break;
                                    }
                                }else if(q==k && i+q>=n){
                                    if(i-1>=0 && map[i-1][j]==0) {
                                        answer++;
                                        break;
                                    }else if(i-1<0){
                                        answer++;
                                        break;
                                    }
                                }
                                q--;
                            }else{
                                break;
                            }
                        }


                    }
                }
            }

            System.out.println("#"+testcase+" "+ answer);

        }



    }
}







