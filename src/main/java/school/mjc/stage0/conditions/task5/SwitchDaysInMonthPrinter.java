package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println("31");
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println("30");
                break;
            case (2):
                System.out.println("28");
                break;
            default:
                System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        SwitchDaysInMonthPrinter sd = new SwitchDaysInMonthPrinter();
        sd.amountOfDays(-2);
    }

    //Rewrite 7. Days in month printer. from task 3 :
    //Implement the program that will consume a number month from method argument and print amount of days in that month, when number is not a month number -> print: "wrong number!":
}
