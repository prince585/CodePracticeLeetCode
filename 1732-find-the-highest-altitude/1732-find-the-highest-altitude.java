class Solution {
    public int largestAltitude(int[] gain) {
        int calti = 0;
        int high = 0;
        for(int i = 0; i < gain.length; i++){
            calti += gain[i];
            if(calti > high){
                high = calti;
            
            }
        }
        return high;
    }
}