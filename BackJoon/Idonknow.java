package BackJoon;

/*
1764. 듣보잡

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Idonknow {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] ss = br.readLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);

        HashMap<String, Integer> map1 = new HashMap<>();

        for(int i=0; i<n; i++){
            String name = br.readLine();
            map1.put(name,1);
        }

        for(int i=0; i<m; i++){
            String name = br.readLine();
            if(map1.containsKey(name))
                map1.put(name,3);
            else
                map1.put(name,1);
        }

        ArrayList<String> list = new ArrayList<>();
        for(String s : map1.keySet()){
            if(map1.get(s)==3) {
                list.add(s);
            }
        }
        Collections.sort(list);

        sb.append(list.size()+"\n");
        for(String s : list)
            sb.append(s+"\n");

        System.out.print(sb.toString());

    }


}
