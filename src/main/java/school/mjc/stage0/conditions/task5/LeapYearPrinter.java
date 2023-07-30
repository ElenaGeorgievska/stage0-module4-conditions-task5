package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }

    }

    public static void main(String[] args) {
        LeapYearPrinter lyp = new LeapYearPrinter();
        lyp.isLeapYear(2004);
    }

    //Create a program to check whether a year is a leap year or not("leap" if true otherwise "not leap").
    //Year will be passed as argument in method parameter:
    //So what should happen if we do not set break to any of the statements? (self exploring section).
}
