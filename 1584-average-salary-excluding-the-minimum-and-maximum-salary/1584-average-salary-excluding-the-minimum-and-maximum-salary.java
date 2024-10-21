class Solution {
    public double average(int[] salary) {
        // int min = salary[0];
        // int max = salary[0];
        // int sum = 0;
        // for (int i = 0; i < salary.length; i++) {
        //     sum += salary[i];
        //     if (salary[i] > max) {
        //         max = salary[i];
        //     } else if (salary[i] < min) {
        //         min = salary[i];
        //     }
        // }

        // sum -= min + max;
        // return (double) sum / (salary.length - 2);
        int sum=0;
        int n=salary.length-1;
        Arrays.sort(salary);
        for(int i=1;i<n;i++)
        {
            sum +=salary[i];
        }
        return (double) sum/(n-1);
    }
}