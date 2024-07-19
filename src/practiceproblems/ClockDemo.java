package practiceproblems;
// Question 2 
import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter midnight seconds: ");
        int secondsSinceMidnight = scanner.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight);

        for (int m = 0; m < 20; m++) {
            firstClock.tick();
            System.out.println("fClock   " + (m + 1) + ": " + firstClock);
        }

        System.out.print("Enter hours for sClock: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes for sClock: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds for sClock: ");
        int seconds = scanner.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds);

        for (int s = 0; s < 10; s++) {
            secondClock.tick();
            System.out.println("sClock   " + (s + 1) + ": " + secondClock);
        }

        firstClock.addClock(secondClock);
        System.out.println("fClock after  sClock: " + firstClock);
        System.out.println("sClock: " + secondClock);

        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("Diff between fclock and sclock : " + thirdClock);


    }
}
