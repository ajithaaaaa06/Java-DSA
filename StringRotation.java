public class StringRotation {
    public boolean rotateString(String s, String goal) {
        String doubled = s + s ;
        if (s.length() != goal.length()) {
            return false;
        }
        return doubled.contains(goal);   
    }
    public static void main(String[] args) {
        StringRotation sr = new StringRotation();
        System.out.println(sr.rotateString("abcde", "cdeab")); // true
        System.out.println(sr.rotateString("abcde", "abced")); // false
    }
}