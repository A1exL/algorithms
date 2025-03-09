package first.bad.version;

// https://leetcode.com/problems/first-bad-version
public class FirstBadVersion extends VersionControl {

    int badVersion = 42;

    public int firstBadVersion(int n) {
        int minVersion = 1;
        return binarySearch(minVersion, n, -1);
    }

    @SuppressWarnings({"ReassignedVariable", "SameParameterValue"})
    private int binarySearch(int low, int high, int lastKnownBadVersion) {
        while (high >= low) {
            int med = low + (high - low) / 2;
            if (isBadVersion(med)) { // look back
                high = med - 1;
                lastKnownBadVersion = med;
            } else { // version is good, look forward
                low = med + 1;
            }
        }
        return lastKnownBadVersion;
    }

    @Override
    boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
