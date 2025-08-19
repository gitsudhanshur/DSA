package Interview_Preparation;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(Lswrc("abcabcbb"));
    }

    static int Lswrc(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left){
                left = map.get(c) + 1;
            }
            map.put(c, right);
            maxLen = Math.max(right - left + 1, maxLen);
        }
        return maxLen;
    }
}
