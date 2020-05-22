package ch09;

public class AlgoritmaSieveofAtkin {
    static int AlgoritmaSieveofAtkin(int limit) {


        if (limit > 2)
            System.out.print(2 + " ");
        if (limit > 3)
            System.out.print(3 + " ");
        boolean sieve[] = new boolean[limit];
        for (int i = 0; i < limit; i++)
            sieve[i] = false;

        //Rumus atkin
        for (int i = 1; i * i < limit; i++) {
            for (int j = 1; j * j < limit; j++) {
                int n = (4 * i * i) + (j * j);
                if (n <= limit && (n % 12 == 1 || n % 12 == 5))
                    sieve[n] ^= true;

                n = (3 * i * i) + (j * j);

                if (n <= limit && n % 12 == 7)

                    sieve[n] ^= true;

                n = (3 * i * i) - (j * j);

                if (i > j && n <= limit && n % 12 == 11)

                    sieve[n] ^= true;
            }

        }
        for (int r = 5; r * r < limit; r++) {
            if (sieve[r]) {
                for (int i = r * r; i < limit;
                     i += r * r)
                    sieve[i] = false;
            }
        }
        for (int a = 5; a < limit; a++)
            if (sieve[a])
                System.out.print(a + " ");
        return 0;
    }


    public static void main(String[] args)
    {
        int limit = 20;
        AlgoritmaSieveofAtkin(limit);
    }
}