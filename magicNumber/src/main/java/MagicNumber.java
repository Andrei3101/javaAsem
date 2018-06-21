public class MagicNumber {

    public static void main(String[] args) {

        new MagicNumber().run();
        // System.out.println( 1389019170L * 1389019170L);
    }

    public void run() {
        final int maxN = (int) Math.sqrt(19293949596979899L);
        final int minN = (int) Math.sqrt(10203040506070809L);

        for (int n = maxN; n > minN; n -= 1) {
            if (isMagicSquare(n)) {
                System.out.println("The magic number is: "+ (n *10) );
                return;
            }
        }
    }

    private boolean isMagicSquare(long n) {
        int[] digits = getDigits(n * n);
        if (digits.length < 17) {
            return false;
        }
        return     digits[0] == 9
                && digits[2] == 8
                && digits[4] == 7
                && digits[6] == 6
                && digits[8] == 5
                && digits[10] == 4
                && digits[12] == 3
                && digits[14] == 2
                && digits[16] == 1;
    }

    public static int[] getDigits(long n) {
        int digits = numDigits(n);
        int[] d = new int[digits];
        int i = 0;
        while (n > 0) {
            d[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        return d;
    }

    public static int numDigits(final long n) {
        // numarul de cifre dintr-un numar

        return (int) Math.log10(n) + 1;
    }
}