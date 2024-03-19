class AnagramPalindrome
{
    int isPossible(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                count = map.get(S.charAt(i)) + 1;
                map.put(S.charAt(i), count);
            } else {
                map.put(S.charAt(i), 1);
            }
        }
        int oddOcc = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddOcc++;
            }
        }
        if (oddOcc > 1) {
            return 0;
        }
        return 1;
    }
}