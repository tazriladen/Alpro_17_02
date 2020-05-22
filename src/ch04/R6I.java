package ch04;

public class R6I {
    public static void main(String[] args) {
    int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    for (int i = 0; i<arrayAngka.length;i++){
        if (i < arrayAngka[i]){
            int selisih = arrayAngka[i] - arrayAngka[i+1];

            System.out.println(selisih);

            }
        }
    }
}