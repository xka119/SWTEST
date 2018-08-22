package SWExpert.D3;


/*
3131. 100만 이하의 모든 소수
베네트리체?? 를 쓰자

소수 구하기 정석문제

정답률 44%
*/

import java.io.IOException;

public class D3_getPrime {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        int size = 1000000;
        int[] prime = new int[size];
        for(int i=2; i<size; i++){
            prime[i] = i;
        }
        for(int i=2; i<size; i++){
            if(prime[i]!=0){
                sb.append(prime[i]+" ");
                for(int j=i+i; j<size; j+=i){
                    if(prime[j]%i==0)
                        prime[j] = 0;
                }
            }
        }
        System.out.print(sb.toString());

    }
}


