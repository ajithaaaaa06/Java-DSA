import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        return false;
    }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr1);
        String sorted1 = new String(arr1);
        return sorted.equals(sorted1);
    }
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("anagram", "nagaram")); // true
        System.out.println(anagram.isAnagram("rat", "car")); // false
    }
}