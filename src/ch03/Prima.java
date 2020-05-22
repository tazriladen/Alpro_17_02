package ch03;

import java.util.Scanner;

public class Prima{
    public static void main( String[] args ){
        Scanner input = new Scanner( System.in );
        int a, b, nilai;
        boolean prima;
        System.out.println("Masukkan nilai : ");
        nilai = input.nextInt();

        while (nilai<= 1)
        {
            System.out.println("\n\nNilai harus lebih besar dari 1\n \nMasukkan nilai : ");
            nilai = input.nextInt();
        }
        for (a=nilai;a<=nilai;a++)
        {
            prima=false;
            if (a==2)
                prima=true;
            else
            {
                for (b=2;b<a;b++)
                {
                    if (a % b==0)
                    {
                        prima=false;
                        System.out.println ("Bukan Bilangan Responsi5.Prima, Silahkan Coba Lagi");
                        break;
                    }
                    else
                        prima=true;
                }
            }
            if (prima)
            {
                System.out.println("Termasuk Bilangan Responsi5.Prima");

            }
        }

    }
}