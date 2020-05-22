package ch08;
import java.util.HashMap;
import java.util.Map;


public class AlgoritmaBMSS {

    public static void main(String[] args) {
        String pola = "bola";

        String teks = " sepakbola";
        search(pola, teks);
    }

    public static void search(String pola, String teks) {
        Map<Character, Integer> mt = new HashMap();
        for (int a = 0; a < pola.length(); a++) {
            mt.put(pola.charAt(a), a);
        }
        int lewat = 0;
        int y = teks.length();
        int x = pola.length();
        for (int a = 0; a <= y-x; a= a+ lewat) {
            lewat = 0;
            for (int b = x - 1; b >= 0; b--) {
                if (pola.charAt(b) != teks.charAt(a+b)) {
                    if(mt.get(teks.charAt(a + b))!=null)
                        lewat = Math.max(1, b - mt.get(teks.charAt(a + b)));
                    else
                        lewat = b+1;
                    break;
                }
            }
            if (lewat == 0) {
                System.out.println("Kecocokan ada di index " + a);
                lewat = 1;
            }
        }
    }


    public int search(String teks) {
        String pola = "";
        int r = 256;
        int[] benar = new int[r];
        for (int a = 0; a < r; a++)
            benar[a] = -1;
        for (int b = 0; b < pola.length(); b++)
            benar[pola.charAt(b)] = b;

        int x = pola.length();
        int y = teks.length();
        int lewat;
        for (int a = 0; a <= y - x; a += lewat) {
            lewat = 0;
            for (int b = x - 1; b >= 0; b--) {
                if (pola.charAt(b) != teks.charAt(a + b)) {
                    lewat = Math.max(1, b - benar[teks.charAt(a + b)]);
                    break;
                }
            }
            if (lewat == 0)
                return a;
        }
        return y;
    }
}