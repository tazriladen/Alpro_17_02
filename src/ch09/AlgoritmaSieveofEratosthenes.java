package ch09;

import java.util.Scanner;

public class AlgoritmaSieveofEratosthenes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas angka yang ingin dicari");
        int batas = input.nextInt();
        System.out.println("Terdapat bilangan prima yaitu :");
        boolean prima[] = new boolean[batas+1];

        for (int a = 0; a <= batas; a++){
            prima [a]= true ;
        }

        for (int b = 2; b*b <= batas; b++){
            if (prima[b] == true) {
                for (int a = b*b; a <= batas; a+= b){
                    prima [a] = false;}
            }
        }


        for (int a = 2; a <= batas; a++){
            if (prima[a] == true)
                System.out.print(a+ ", ");
        }
    }
}