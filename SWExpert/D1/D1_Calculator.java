package SWExpert.D1;

/*
1938. 아주 간단한 계산기

StringBuilder 사용
        sb.append((a+b)+"\n"); <이런식으로 int 와 String, char 결합해서 사용가능
 */


import java.util.Scanner;

public class D1_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(sc.nextInt(), sc.nextInt());
    }

    public static void print(int a, int b){
        StringBuilder sb = new StringBuilder();
        sb.append((a+b)+"\n");
        sb.append((a-b)+"\n");
        sb.append((a*b)+"\n");
        sb.append((a/b)+"\n");
        System.out.println(sb.toString());
    }

}




