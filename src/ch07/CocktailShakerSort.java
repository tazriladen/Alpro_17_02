package ch07;

public class CocktailShakerSort {
    public static void main(String[] args) {
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        boolean urutan = true;

        //Mengurutkan dari yang terkecil tiap 2 angka seperti bubble sort
        while(urutan == true){
            for (int i=0; i <arrayAngka.length-1; i++){
                if(arrayAngka[i] > arrayAngka[i+1]){
                    int baru = arrayAngka[i];
                    arrayAngka[i] = arrayAngka[i+1];
                    arrayAngka[i+1] = baru;

                }
            }

            if (urutan == false)
                break;

            urutan = false;

            //Mengembalikan posisi dan
            //diurutkan dari arah berlawanan
            int j = arrayAngka.length-1;
            for (int i = j-1; i >= 0; i--){
                if (arrayAngka[i] > arrayAngka[i+1]){
                    int baru = arrayAngka[i];
                    arrayAngka[i] = arrayAngka[i+1];
                    arrayAngka[i+1] = baru;
                    urutan = true;
                }
            }

        }

        for (int i = 0; i < arrayAngka.length; i++){
            System.out.print(arrayAngka[i]+", ");
        }
    }
}