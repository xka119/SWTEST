package SWExpert;

/*
2050. 알파벳을 숫자로 변환

foreach 사용법, 모두 대문자로만들기 toUpperCase();
 */


import java.util.Scanner;

public class D1_ABC_TO_NUM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        print(getTable(sc.nextLine()));

    }

    //switch 문으로 변경가능
    public static int[] getTable(String s){
        int[] answer = new int[s.length()];

        String us = s.toUpperCase();

        for(int n = 0; n<s.length(); n++){
            if(us.charAt(n)=='A'){
                answer[n] = 1;
            }
            if(us.charAt(n)=='B'){
                answer[n] = 2;
            }
            if(us.charAt(n)=='C'){
                answer[n] = 3;
            }
            if(us.charAt(n)=='D'){
                answer[n] = 4;
            }
            if(us.charAt(n)=='E'){
                answer[n] = 5;
            }
            if(us.charAt(n)=='F'){
                answer[n] = 6;
            }
            if(us.charAt(n)=='G'){
                answer[n] = 7;
            }
            if(us.charAt(n)=='H'){
                answer[n] = 8;
            }
            if(us.charAt(n)=='I'){
                answer[n] = 9;
            }
            if(us.charAt(n)=='J'){
                answer[n] = 10;
            }
            if(us.charAt(n)=='K'){
                answer[n] = 11;
            }
            if(us.charAt(n)=='L'){
                answer[n] = 12;
            }
            if(us.charAt(n)=='M'){
                answer[n] = 13;
            }
            if(us.charAt(n)=='N'){
                answer[n] = 14;
            }
            if(us.charAt(n)=='O'){
                answer[n] = 15;
            }
            if(us.charAt(n)=='P'){
                answer[n] = 16;
            }
            if(us.charAt(n)=='Q'){
                answer[n] = 17;
            }
            if(us.charAt(n)=='R'){
                answer[n] = 18;
            }
            if(us.charAt(n)=='S'){
                answer[n] = 19;
            }
            if(us.charAt(n)=='T'){
                answer[n] = 20;
            }
            if(us.charAt(n)=='U'){
                answer[n] = 21;
            }
            if(us.charAt(n)=='V'){
                answer[n] = 22;
            }
            if(us.charAt(n)=='W'){
                answer[n] = 23;
            }
            if(us.charAt(n)=='X'){
                answer[n] = 24;
            }
            if(us.charAt(n)=='Y'){
                answer[n] = 25;
            }
            if(us.charAt(n)=='Z'){
                answer[n] = 26;
            }

        }

        return answer;
    }

    public static void print(int[] answer){
        for(int n : answer){
            System.out.print(n+" ");
        }
    }


}



