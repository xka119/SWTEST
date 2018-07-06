package SWExpert;


/*
1926. 간단한 369게임
 */

import java.util.Scanner;

public class D2_GAME_369 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //입력 n
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //포문을 돌면서 출력
            get_Clap(i);
        }

    }

    public static void get_Clap(int n){

        //1) 들어온 숫자 자릿수 파악
        int size = Integer.toString(n).length();


        //2) 각 자릿수의 3,6,9 숫자 일치 파악
        switch (size){
            case 1:
                if(n==3||n==6||n==9){
                    System.out.print("- ");
                }else{
                    System.out.print(n+" ");
                }
                break;
            case 2:
                //10의자리인경우
                int a = n/10;
                int b = n%10;
                if(a==3||a==6||a==9){
                    if(b==3||b==6||b==9){
                        System.out.print("-- ");
                    }else{
                        System.out.print("- ");
                    }
                }else{
                    if(b==3||b==6||b==9){
                        System.out.print("- ");
                    }else{
                        System.out.print(n+" ");
                    }
                }
                break;
            case 3:
                int c = n/100;
                int d = (n%100)/10;
                int e = (n%100)%10;
                if(c==3||c==6||c==9){
                    if(d==3||d==6||d==9){
                        if(e==3||e==6||e==9){
                            System.out.print("--- ");
                        }else{
                            System.out.print("-- ");
                        }
                    }else{
                        if(e==3||e==6||e==9){
                            System.out.print("-- ");
                        }else{
                            System.out.print("- ");
                        }
                    }
                }else{
                    if(d==3||d==6||d==9){
                        if(e==3||e==6||e==9){
                            System.out.print("-- ");
                        }else{
                            System.out.print("- ");
                        }
                    }else{
                        if(e==3||e==6||e==9){
                            System.out.print("- ");
                        }else{
                            System.out.print(n+" ");
                        }
                    }
                }
                break;
            case 4:
                //이때는 1000밖에 없음
                System.out.print(n+" ");
                break;

            default:
                break;
        }


    }
}
