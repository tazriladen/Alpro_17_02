package ch07;

public class MergeSort {

    public static void main(String a[])
    {

        int arrayAngka[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        System.out.println("Sebelum di Urutkan merge sort ");
        for(int i = 0; i < arrayAngka.length; i++)
        {
            System.out.print(arrayAngka[i]+" ");
        }
        System.out.println();

        diurutkan(arrayAngka,0,arrayAngka.length-1);
        System.out.println();
        System.out.println("Setelah di Urutkan merge sort ");
        for(int i = 0; i < arrayAngka.length; i++)
        {
            System.out.print(arrayAngka[i]+" ");
        }

    }
    public static void diurutkan(int arrayAngka[], int l, int h)
    {
        int kecil = l;
        int besar = h;
        if (kecil>=besar)
        {
            return;
        }
        //cari nilai tengah atau median

        int mid=(kecil+besar)/2;
        diurutkan(arrayAngka,kecil,mid);
        diurutkan(arrayAngka,mid+1,besar);
        int end_kecil=mid;
        int awal=mid+1;
        while ((l<=end_kecil) && (awal<=besar))
        {
            if (arrayAngka[kecil]<arrayAngka[awal])
            {
                kecil++;
            }
            else
            {
                int baru=arrayAngka[awal];
                for (int k=awal-1;k>=kecil;k--)
                {
                    arrayAngka[k+1]=arrayAngka[k];
                }
                arrayAngka[kecil]=baru;
                kecil++;
                end_kecil++;
                awal++;
            }
        }
    }
}