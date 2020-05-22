package ch08;

public class AlgoritmaLCS {
    static String a, b;

    static int lcs(int i, int j, int total) {

        if (i == 0 || j == 0) {
            return total;
        }
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
            total = lcs(i - 1, j - 1, total + 1);
        }
        total = Math.max(total, Math.max(lcs(i, j - 1, 0), lcs(i - 1, j, 0)));
        return total;
    }

    public static void main(String[] args){
        int m, n;
        a = "ALPRO";
        b = "DASPRO";

        m = a.length();
        n = b.length();
        System.out.println(lcs(m, n, 0));
    }
}