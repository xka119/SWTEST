package SWExpert.D1;

/*
2025. N줄덧셈

 */


import java.util.Scanner;

public class D1_Add{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);


    }

}



