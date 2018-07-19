package SWExpert;

/*
2056. 연월일 달력

함수 구현, subString 사용

 */


import java.util.Scanner;

public class D2_CALENDAR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int testcase = 0; testcase < t; testcase++) {

            String s = sc.nextLine();

            String year, month, day;

            year = s.substring(0, 4);
            month = getMonth(s.substring(4, 6));
            if (month.equals("XX")) {
                System.out.println("#" + (testcase +1 )+" -1");
            } else {
                day = getDay(s.substring(6, 8), month);
                if (day.equals("XX")) {
                    System.out.println("#" + (testcase +1 )+" -1");
                } else {
                    System.out.println("#" + (testcase + 1) + " " + year + "/" + month + "/" + day);
                }
            }
        }
    }

    //if문으로 변경 가능
    public static String getMonth(String month) {
        switch (month) {
            case "01":
                break;
            case "02":
                break;
            case "03":
                break;
            case "04":
                break;
            case "05":
                break;
            case "06":
                break;
            case "07":
                break;
            case "08":
                break;
            case "09":
                break;
            case "10":
                break;
            case "11":
                break;
            case "12":
                break;
            default:
                month = "XX";
                break;
        }
        return month;
    }

    public static String getDay(String day, String month) {
        if (day.equals("31")) {
            if (month == "02" || month == "04" || month == "06" || month == "09" || month == "11") {
                day = "XX";
            }
        }else if (day.equals("29") || day.equals("30")) {
            if (month.equals("02")) {
                day = "XX";
            }
        }else{
            int d = Integer.parseInt(day);
            if(d>=32)
                day = "XX";
        }
        return day;
    }
}



