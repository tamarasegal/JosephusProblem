public class Equation {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            double answer = 2 * (i - Math.pow(2, (int) (Math.log(i) / Math.log(2)))) + 1;
            System.out.println(i + " --> " + (int) answer);
        }
        // 1 + (2 * somethinggg)
        //floor of log base 2 of (n)
        // 2 to the floor of log base 2 of n -- the number in the sequence, 1, 2, 4, 8, 16
    }
}