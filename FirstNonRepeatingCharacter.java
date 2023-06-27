import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstNonRepeatingCharacter(s);
        System.out.println("Index of the first non-repeating character: " + index);
    }

    public static int firstNonRepeatingCharacter(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (countMap.get(c) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }
}
