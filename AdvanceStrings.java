import java.util.*;

class AdvanceStrings {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> freq[b] - freq[a]
        );

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                pq.offer((char) i);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!pq.isEmpty()) {
            char ch = pq.poll();

            for (int i = 0; i < freq[ch]; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        AdvanceStrings advanceStrings = new AdvanceStrings();
        System.out.println(advanceStrings.frequencySort("tree")); 
        System.out.println(advanceStrings.frequencySort("cccaaa")); 
        System.out.println(advanceStrings.frequencySort("Aabb")); 
    }
}