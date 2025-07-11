class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i] += 1;

            if (digits[i] < 10) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
