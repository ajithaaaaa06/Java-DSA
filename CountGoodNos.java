public class CountGoodNos{
    static final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long a = power(5, even);
        long b = power(4, odd);

        return (int) ((a * b) % MOD);
    }

    public long power(long x, long n) {
        if (n == 0) {
            return 1;
        }

        long half = power(x, n / 2);
        long result = (half * half) % MOD;

        if (n % 2 == 1) {
            result = (result * x) % MOD;
        }

        return result;
    }
    public static void main(String[] args) {
        CountGoodNos solution = new CountGoodNos();
        long n = 50; // Example input
        int result = solution.countGoodNumbers(n);
        System.out.println("Count of good numbers of length " + n + ": " + result);
    }
}