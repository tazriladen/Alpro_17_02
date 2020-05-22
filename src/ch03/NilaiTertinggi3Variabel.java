package ch03;

import java.util.Scanner;

public class NilaiTertinggi3Variabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai X = ");
        int x = input.nextInt();
        System.out.println("Nilai Y = ");
        int y = input.nextInt();
        System.out.println("Nilai Z = ");
        int z = input.nextInt();

        if (x > y && x > z){
            System.out.println("X lebih besar dari Y dan Z");
        } else if (y > x && y > z) {
            System.out.println("Y lebih besar dari X dan Z");
        }
        else
        {
            System.out.println("Z lebih besar dari X dan Y");
        }
    }
}