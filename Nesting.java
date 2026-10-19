class Nesting {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (s.charAt(i) == ')') {
                depth--;
            }
        }

        return maxDepth;
    }
    public static void main(String[] args) {
        Nesting nesting = new Nesting();
        System.out.println(nesting.maxDepth("(1+(2*3)+((8)/4))+1")); 
        System.out.println(nesting.maxDepth("(1)+((2))+(((3)))")); 
        System.out.println(nesting.maxDepth("1+(2*3)/(2-1)")); 
        System.out.println(nesting.maxDepth("1")); 
    }
}