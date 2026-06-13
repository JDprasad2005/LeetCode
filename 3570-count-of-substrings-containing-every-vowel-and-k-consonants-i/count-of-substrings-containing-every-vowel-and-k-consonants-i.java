class Solution {
    public int countOfSubstrings(String word, int k) {
        int n = word.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int consonants = 0;
            HashSet<Character> vowels = new HashSet<>();

            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);

                if (isVowel(ch)) {
                    vowels.add(ch);
                } else {
                    consonants++;
                }

                if (consonants > k) break;

                if (consonants == k && vowels.size() == 5) {
                    ans++;
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