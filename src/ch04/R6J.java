package ch04;
public class R6J{
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("SELISIH BILANGAN GENAP");
        for (int i = 0; i < arrayAngka.length; i++){
            boolean genap = arrayAngka[i] % 2 == 0;
            if (genap && arrayAngka[i+1]%2 == 0){
                int selisih = arrayAngka[i] - arrayAngka[i+1];
                System.out.println(arrayAngka[i]+" - "+arrayAngka[i+1]+" = "+selisih );
            }
        }
    }
}