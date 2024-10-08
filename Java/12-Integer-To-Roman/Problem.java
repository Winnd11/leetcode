class Solution {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int nums[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                stringBuilder.append(roman[i]);
                num -= nums[i];
            }
        }
        return stringBuilder.toString();
    }
}