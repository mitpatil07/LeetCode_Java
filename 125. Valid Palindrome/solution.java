class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0;
        int n = str.length() - 1;
        
        while (i < n) {
            if (str.charAt(i) != str.charAt(n)) {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}
