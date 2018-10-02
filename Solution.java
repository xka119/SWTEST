
/*
2178. 미로 탐색

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public int solution(int[] A) {
        int count0 = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] == 0)
                count0++;
        }
        int count1 = A.length- count0;

        if(count1>count0)
            return count0;
        else
            return count1;

    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Solution s = new Solution();

        int[] A = {1,0,0,1,0,0};

        System.out.println(s.solution(A));


    }


}
