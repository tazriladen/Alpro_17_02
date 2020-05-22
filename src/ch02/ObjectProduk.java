package ch02;
import java.util.Date;
public class ObjectProduk {
	public static void main (String [] args ) {
		Produk x1 = new Produk ();
		x1.barcode = "1234567";
		x1.nama = "Coca Cola";
		x1.tanggalKadaluarsa = new Date (2020,3,18);
		x1.harga = 5000;
		
		Produk x2 = new Produk ();
		x2.barcode = "7654321";
		x2.nama = "Sprite";
		x2.tanggalKadaluarsa = new Date (2020,4,10);
		x1.harga = 5500;

	System.out.println (x1.nama+ " ("+x1.barcode+")");
	System.out.println ("Harga : Rp."+x1.harga );
	System.out.println ("Exp Date : "+x1.tanggalKadaluarsa.toString());

	System.out.println ("===========================================");

	System.out.println (x2.nama+ " ("+x2.barcode+")");
	System.out.println ("Harga : Rp."+x2.harga );
	System.out.println ("Exp Date : "+x2.tanggalKadaluarsa.toString());
 }
}