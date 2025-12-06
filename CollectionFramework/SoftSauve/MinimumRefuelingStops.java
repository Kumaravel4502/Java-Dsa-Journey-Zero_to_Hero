package CollectionFramework.SoftSauve;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumRefuelingStops {

    // Returns minimum number of refuel stops to reach target
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        // Max heap – stores fuel amounts of all reachable stations
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int fuel = startFuel;   // current fuel
        int stops = 0;          // number of refuel stops
        int i = 0;              // index for stations array
        int n = stations.length;

        while (fuel < target) {
            // Add all stations we can reach with current fuel
            while (i < n && stations[i][0] <= fuel) {
                maxHeap.add(stations[i][1]); // push station fuel into heap
                i++;
            }

            // If no reachable station fuel is available, we can't move further
            if (maxHeap.isEmpty()) {
                return -1;
            }

            // Take the station with maximum fuel among reachable ones
            int bestFuel = maxHeap.poll();
            fuel += bestFuel;
            stops++;

            System.out.println("Refueled with: " + bestFuel + ", current fuel = " + fuel);
        }

        return stops;
    }

    public static void main(String[] args) {
        int target = 15;
        int startFuel = 3;
        int[][] stations = {
                {2, 5},
                {3, 1},
                {6, 4},
                {12, 6}
        };

        int result = minRefuelStops(target, startFuel, stations);
        System.out.println("Minimum refueling stops = " + result);
    }
}