/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


class VersionControl {
    int firstBad = 4;

    boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;  // mid could be the first bad version
            } else {
                low = mid + 1;  // first bad version is after mid
            }
        }

        return low;  // low == high → first bad version
    }

  
    public static void main(String[] args) {
        FirstBadVersion sol = new FirstBadVersion();

        int n = 10;  // total versions
        sol.firstBad = 4; // example first bad version
        int result = sol.firstBadVersion(n);

        System.out.println("The first bad version is: " + result); // Expected: 4
    }
}
