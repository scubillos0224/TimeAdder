import java.util.*;

public class TimeAdder {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the current hour:");
        int currentHour = scnr.nextInt();
        System.out.println("Enter the current minute:");
        int currentMinute = scnr.nextInt();
        System.out.println("Enter the current second:");
        int currentSecond = scnr.nextInt();
        System.out.println("Enter the hour to go forward by:");
        int forwardHour = scnr.nextInt();
        System.out.println("Enter the minute to go forward by:");
        int forwardMinute = scnr.nextInt();
        System.out.println("Enter the second to go forward by:");
        int forwardSecond = scnr.nextInt();

        int answerHour = 0, answerMinute = 0, answerSecond = 0;
        int carrySecond = 0, carryMinute = 0;
        boolean isNextDay = false;
        answerSecond = currentSecond + forwardSecond;
        if (answerSecond >= 60) {
            answerSecond -= 60;
            carrySecond = 1;
        }

        answerMinute = currentMinute + forwardMinute + carrySecond;
        if (answerMinute >= 60) {
            answerMinute -= 60;
            carryMinute = 1;
        }
        answerHour = currentHour + forwardHour + carryMinute;
        if (answerHour >= 24) {
            answerHour -= 24;
            isNextDay = true;
        }
        if (isNextDay) {
            System.out.println("The answer is " + answerHour + ":" +
                    answerMinute + ":" + answerSecond + "on the next day.");
        } else {
            System.out.println("The answer is " + answerHour + ":" +
                    answerMinute + ":" + answerSecond);
        }
    }
}
