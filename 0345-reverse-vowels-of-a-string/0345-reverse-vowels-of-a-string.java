class Solution {
    public String reverseVowels(String s) {
        // String vowels="aeiou";
        // // StringBuilder res=new StringBuilder();
        //  char[] chars = s.toCharArray();
        // int left=0;
        // int right=chars.length-1;
        // while(left<right)
        // {
        //     if(vowels.indexOf(chars[left])==1 && vowels.indexOf(chars[rigth])==1)
        //     {
        //         char temp = chars[left];
        //          chars[left] = chars[right];
        //          chars[right] = temp;
        //     }
        //     left++;
        //     right--;
            
        //   }
    String vowels = "aeiouAEIOU"; 
    char[] chars = s.toCharArray();
    int left = 0;
    int right = chars.length - 1;

    while (left < right) {
        while (left < right && vowels.indexOf(chars[left]) == -1) {
            left++;
        }

        while (left < right && vowels.indexOf(chars[right]) == -1) {
            right--;
        }

        if (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

    return new String(chars);
    }
}