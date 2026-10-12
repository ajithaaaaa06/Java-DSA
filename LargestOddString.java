public class LargestOddString {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0';

            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";  
    }
    public static void main(String[] args) {
        LargestOddString obj = new LargestOddString();
        String num = "123456";
        String result = obj.largestOddNumber(num);
        System.out.println("Largest odd number: " + result);
    }
}