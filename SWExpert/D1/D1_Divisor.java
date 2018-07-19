package SWExpert.D1;

/*
1933. 간단한 N 의 약수

StringBuilder 사용
        sb.append((a+b)+"\n"); <이런식으로 int 와 String, char 결합해서 사용가능
 */


import java.util.Scanner;

public class D1_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        /*
        약수라는거는, 그 값을 나누었을때 나머지가 없는 수
         */
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0)
                sb.append(i+" ");
        }
        System.out.println(sb.toString());

    }
}




