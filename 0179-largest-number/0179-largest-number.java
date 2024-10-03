class Solution {
    public String largestNumber(int[] nums) {
        String largestNum = Arrays.stream(nums)
            .mapToObj(String::valueOf) // Convert int to String
            .sorted((x, y) -> (y + x).compareTo(x + y)) // Sort using custom comparator
            .collect(Collectors.joining()); // Join sorted strings

        // Handle leading zeros
        if (largestNum.charAt(0) == '0') {
            return "0"; // If the largest number is "0", return "0"
        }

        return largestNum;
    }
}