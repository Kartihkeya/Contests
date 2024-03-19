import java.util.HashMap;

class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int start = 0, end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            map.put(currentChar, end);
        }
        
        return maxLength;
    }
}
