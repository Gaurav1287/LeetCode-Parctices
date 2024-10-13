class Solution {
    public boolean isAnagram(String s, String t) {
     char arr[]=s.toCharArray();
     char arr1[]=t.toCharArray();
     Arrays.sort(arr);
     Arrays.sort(arr1);
     return Arrays.equals(arr,arr1);   
    }
}