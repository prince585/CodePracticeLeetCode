class Solution {
    public int countOdds(int low, int high) {
        int highsolve = (high + 1) / 2;
        int lowsolve = low / 2;
        return highsolve - lowsolve;
    }
}