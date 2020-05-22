package ch05;

public class AlgoritmaLCS {

    int lcs( char[] x, char[] y, int m, int n )
    {
        if (m == 0 || n == 0)
            return 0;
        if (x[m-1] == y[n-1])
            return 1 + lcs(x, y, m-1, n-1);
        else
            return max(lcs(x, y, m, n-1), lcs(x, y, m-1, n));
    }
    int max(int x, int y)
    {
        return (x > y)? x : y;
    }


    public static void main(String[] args) {
        AlgoritmaLCS lcs = new AlgoritmaLCS();
        String s1 = "ALPRO";
        String s2 = "DASPRO";
        char[] x=s1.toCharArray();
        char[] y=s2.toCharArray();
        int m = x.length;
        int n = y.length;
        System.out.println("LCS = " + lcs.lcs( x, y, m, n ) );
    }
}