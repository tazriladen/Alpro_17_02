package ch08;

public class AlgoritmaMillerRabin {
    static int power(int i, int j, int p) {
        int res = 1;

        i = i % p;
        while (j > 0) {
            if ((j & 1) == 1)
                res = (res * i) % p;
            j = j >> 1;
            i = (i * i) % p;
        }
        return res;
    }
    static boolean test(int b, int x) {
        int a = 2 + (int)(Math.random() % (x - 4));
        int i = power(a, b, x);
        if (i == 1 || i == x - 1)
            return true;
        while (b != x - 1) {
            i = (i * i) % x;
            b *= 2;
            if (i == 1)
                return false;
            if (i == x - 1)
                return true;
        }
        return false;
    }
    static boolean prima(int x, int k) {
        if (x <= 1 || x == 4)
            return false;
        if (x <= 3)
            return true;
        int b = x - 1;
        while (b % 2 == 0)
            b /= 2;
        for (int i = 0; i < k; i++)
            if (!test(b, x))
                return false;
        return true;
    }
    public static void main(String args[]) {
        int k = 4;
        System.out.println("Bilangan Prima < 100, yaitu : ");
        for (int x = 1; x < 100; x++)
            if (prima(x, k))
                System.out.print(x + " ");
    } }