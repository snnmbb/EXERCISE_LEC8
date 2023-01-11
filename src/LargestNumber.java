public class LargestNumber {
    public static void main(String[] args) {
        int a = 2, b = 8, c = 6;
        if (a > b && a > c)
            System.out.println(a + " is the largest Number");
        else if (b > a && b > c)
            System.out.println(b + " is the smallest Number");
        else
            System.out.println(c + " is the largest Number");
    }
}