class Solution {
    public int countDays(int days, int[][] meetings) {
    //    Set<Integer>hasmeeting=new HashSet<>();
    //    for(int [] meet:meetings)
    //    {
    //     for(int i=meet[0];i<=meet[1];i++)
    //     {
    //         hasmeeting.add(i);
    //     }
    //    }
    //    return days-hasmeeting.size();

      Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0])); // Sort meetings by start day

        int freeDays = 0;
        int prevEnd = 0;

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            // Count available days before the current meeting starts
            if (prevEnd + 1 < start) {
                freeDays += start - (prevEnd + 1);
            }

            // Update prevEnd to keep track of the last occupied day
            prevEnd = Math.max(prevEnd, end);
        }

        // Count free days after the last meeting
        if (prevEnd < days) {
            freeDays += days - prevEnd;
        }

        return freeDays;
    }
}