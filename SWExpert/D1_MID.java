package SWExpert;

/*
2063. 중간값 찾기

LinkedList 사용
리스트 정렬을 위한 Collections 사용
Collections.sort(List<T> item)
 */
import java.util.*;

public class D1_MID {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        LinkedList<Integer> t = new LinkedList<>();

        int n = sc.nextInt();
        sc.nextLine();
        st = new StringTokenizer(sc.nextLine());


        while (st.hasMoreTokens()) {
            t.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(t);

        System.out.println(t.get(t.size()/2));


    }
}




