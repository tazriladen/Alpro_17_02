package ch02;
import java.util.Date;
public class ObjectObat {
	public static void main (String [] args ) {
		Obat x1 = new Obat ();
		x1.barcode = "1234567890";
		x1.nama = "Bodrex";
		x1.tanggalKadaluarsa = new Date (2020,10,20);
		x1.harga = 5000;

		Obat x2 = new Obat ();
		x2.barcode = "0987654321";
		x2.nama = "OBH";
		x2.tanggalKadaluarsa = new Date (2020,8,17);
		x2.harga = 10000;

System.out.println(x1.nama+ "(" +x1.barcode + ")");
System.out.println("Harga : Rp." +x1.harga);
System.out.println("Exp Date : " +x1.tanggalKadaluarsa.toString());

System.out.println("===============================");

System.out.println(x2.nama+ "(" +x2.barcode + ")" );
System.out.println("Harga : Rp." +x2.harga);
System.out.println("Exp Date : " +x2.tanggalKadaluarsa.toString());

 }
}