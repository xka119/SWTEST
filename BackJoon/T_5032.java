package BackJoon;


/*
5032. 탄산 음료

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class T_5032 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int e, f, c;

        String[] ss = br.readLine().split(" ");
        e = Integer.parseInt(ss[0]);
        f = Integer.parseInt(ss[1]);
        c = Integer.parseInt(ss[2]);

        int bottle = e + f;
        int sum = 0;
        int nbottle;
        while (bottle >= c) {
            nbottle = bottle/c;
            bottle = nbottle + bottle%c;
            sum += nbottle;
        }

        System.out.print(sum);

    }
}
