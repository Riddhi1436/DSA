/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2; // avoid overflow
            if (isBadVersion(mid)) {
                right = mid;   // go left
            } else {
                left = mid + 1; // go right
            }
        }
        return left;
    }
}