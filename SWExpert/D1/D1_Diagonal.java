package SWExpert.D1;

/*
2027. 대각선 출력하기

StringBuilder 사용 sb.append
줄바꿈은 \n
 */

public class D1_Diagonal {
    public static void main(String[] args) {

// 기존의 방식
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                if(i==j){
//                    System.out.print("#");
//                }else{
//                    System.out.print("+");
//                }
//            }
//            System.out.println("");
//        }

        //StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==j){
                    sb.append("#");
                }else{
                    sb.append("+");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

}



