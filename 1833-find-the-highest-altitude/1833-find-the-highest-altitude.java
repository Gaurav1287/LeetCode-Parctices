class Solution {
    public int largestAltitude(int[] gain) {
       int highAltitude=0;
       int maxAltitude=0;
       for(int g:gain)
       {
        highAltitude +=g;
        maxAltitude=Math.max(maxAltitude,highAltitude);
       }
       return maxAltitude;
    }
}