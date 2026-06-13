class Solution {
    public int countOfSubstrings(String word, int k) {
        return countAtLeast(word, k) - countAtLeast(word, k + 1);
    }

    private int countAtLeast(String word, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int consonants = 0;
        int l = 0;
        int ans = 0;

        for (int r = 0; r < word.length(); r++) {
            char ch = word.charAt(r);

            if (isVowel(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                consonants++;
            }

            while (map.size() == 5 && consonants >= k) {
                ans += word.length() - r;

                char left = word.charAt(l++);
                if (isVowel(left)) {
                    map.put(left, map.get(left) - 1);
                    if (map.get(left) == 0) {
                        map.remove(left);
                    }
                } else {
                    consonants--;
                }
            }
        }

        return ans;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}