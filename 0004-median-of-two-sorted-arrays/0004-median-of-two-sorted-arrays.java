class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int len=n+m;
        int arr[]=new int[len];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums1[i];
        }
        for(int j=0;j<m;j++)
        {
            arr[n+j]=nums2[j];
        }
        Arrays.sort(arr);
        if(len%2==0)
        {
            int x = len/2;
            return (float) (arr[x-1]+arr[x])/2;
        }
        else
        {
            int y = len/2;
            return arr[y];
        }
    }
}