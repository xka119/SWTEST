package BackJoon;


/*
10828. 스택
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10828 {
    //정적 스택
    static int index;
    static int[] stack = new int[100000];

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int count;
        int n = Integer.parseInt(br.readLine().trim());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String s;

            if(st.countTokens()==2){
                s = st.nextToken();
                count = Integer.parseInt(st.nextToken());
                push(count);
            }else{
                s = st.nextToken();
                if(s.equals("pop")){
                    pop();
                }else if(s.equals("size")){
                    size();
                }else if(s.equals("empty")){
                    empty();
                }else if(s.equals("top")){
                    top();
                }else{
                    //nothing
                }
            }
        }

    }

    //stack이란 뭔가
    // 마지막 인덱스를 기준으로 FI LO 터벅터벅 쌓이는거임. 그니까 마지막 index를 가리키는 것이 필요함.

    //push
    public static void push(int x){
        stack[index++] = x;
    }

    //pop
    public static void pop(){
        if(index==0){
            System.out.println("-1");
        }else{
            System.out.println(stack[--index]);
        }
    }

    //size
    public static void size(){
        System.out.println(index);
    }

    //empty 비었으면 1, 안비었으면 0
    public static void empty(){
        if(index==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    //top
    public static void top(){
        if(index==0){
            System.out.println("-1");
        }else{
            System.out.println(stack[index-1]);
        }
    }
}
