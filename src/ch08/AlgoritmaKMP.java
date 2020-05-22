package ch08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class AlgoritmaKMP {
    private final int[] gagal;
    public AlgoritmaKMP(String text, String pat)
    {

        gagal = new int[pat.length()];
        fail(pat);

        int cocok = posMatch(text, pat);
        if (cocok == -1)
            System.out.println("\nTidak di Temukan Kesamaan");
        else
            System.out.println("\nKesamaan di Temukan Pada Index ke- "+ cocok);
    }
    private void fail(String pat)
    {
        int n = pat.length();
        gagal[0] = -1;
        for (int j = 1; j < n; j++)
        {
            int i = gagal[j - 1];
            while ((pat.charAt(j) != pat.charAt(i + 1)) && i >= 0)
                i = gagal[i];
            if (pat.charAt(j) == pat.charAt(i + 1))
                gagal[j] = i + 1;
            else
                gagal[j] = -1;
        }
    }
    private int posMatch(String text, String pat){
        int i = 0, j = 0;
        int lens = text.length();
        int lenp = pat.length();
        while (i < lens && j < lenp)
        {
            if (text.charAt(i) == pat.charAt(j))
            {
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = gagal[j - 1] + 1;
        }
        return ((j == lenp) ? (i - lenp) : -1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mencoba Knuth Morris Pratt\n");
        System.out.println("\nMasukkan Teks\n");
        String text = br.readLine();
        System.out.println("\nMasukkan Pola\n");
        String pattern = br.readLine();
        AlgoritmaKMP kmp = new AlgoritmaKMP(text, pattern);
    }
}