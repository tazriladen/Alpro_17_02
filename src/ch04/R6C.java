package ch04;

public class R6C {
    public static void main(String[] args) {
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        System.out.println("Bilangan Ganjil");
        for (int i=0; i<arrayAngka.length; i++){
            if (arrayAngka [i] %2 !=0){
                System.out.print(arrayAngka[i] + " ");
            }
        }
    }
}