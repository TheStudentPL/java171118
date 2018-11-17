public class DayWriter {
    public static void main(String[] args) {
        int month = 1;
        int year = 2018;
        int[] monthtab = new int[13];

        while (month < 13) {
            monthtab[month] = countDays(month,year);
            System.out.println("For month: " + nameMonth(month) + " we have " + monthtab[month] + " days");
            month++;
        }

        for(int i = 1; i<13; i++){
            int days =  monthtab[i];
            int begin = 1;
            System.out.println("For month: " + nameMonth(i));
            while (begin <= days ){
                System.out.println("Day number: " + begin);
                begin++;
            }
        }

    }
    static int countDays(int month, int year) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0)
                    count = 29;
                else
                    count = 28;
                if ((year % 100 == 0) & (year % 400 != 0))
                    count = 28;
        }
        return count;


    }
    static String nameMonth(int month){
        String name="";
        switch (month) {
            case 1: name = "January"; break;
            case 2: name = "February";break;
            case 3: name = "March";break;
            case 4: name = "April";break;
            case 5: name = "May";break;
            case 6: name = "June";break;
            case 7: name = "July";break;
            case 8: name = "August";break;
            case 9: name = "September";break;
            case 10: name = "October";break;
            case 11: name = "November";break;
            case 12: name = "December";break;
        }
        return name;
    }


}