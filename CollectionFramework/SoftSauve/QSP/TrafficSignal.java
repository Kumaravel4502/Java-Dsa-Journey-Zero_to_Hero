import java.util.*;

public class TrafficSignal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of paths at signal #2 (2-4): ");
        int s2 = sc.nextInt();

        System.out.print("Enter number of paths at signal #3 (2-4): ");
        int s3 = sc.nextInt();

        System.out.print("Enter the signal time: ");
        int signalTime = sc.nextInt();

        int time = 0;

        // ---------------- SIGNAL #1 ----------------
        // Person reaches at 7 sec
        int reach1 = 7;
        time = reach1;

        // Signal 1 closes at 5 sec, opens at 15 sec
        int open1 = 15;

        if (time < open1) {
            time = open1; // wait until it opens
        }

        // ---------------- SIGNAL #2 ----------------
        // Reach signal 2 at time + 6 sec (distance in example)
        time += 6; // 15 -> 21 sec

        if (s2 == 4) {
            int open2 = 20;
            if (time < open2) {
                time = open2;
            }
        }
        // (Else if 2-way or 3-way, values can be defined if needed)

        // ---------------- SIGNAL #3 ----------------
        // Reach signal 3 after 7 more seconds
        time += 7; // 21 -> 28 sec

        if (s3 == 2) {
            // Opens every 'signalTime' seconds
            int lastOpen = (time / signalTime) * signalTime;

            if (lastOpen < time) {
                time = lastOpen + signalTime; // wait for next open
            }
        }

        // Finally travel 8 sec to destination
        time += 8;

        System.out.println("It takes " + time + " seconds to reach destination.");
    }
}
