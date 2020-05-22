package ch02;
public class ObjectPegawai{
	public static void main (String [] args) {
	Pegawai pgw1 = new Pegawai();
	Pegawai pgw2 = new Pegawai();

	pgw1.nik = "1234567890";
	pgw1.nama = "Andi";
	pgw1.jabatan = "Manager";
	pgw1.isAktif = true;

	pgw2.nik = "0987654321";
	pgw2.nama = "Mamat";
	pgw2.jabatan = "Staff";
	pgw2.isAktif = true;

	pgw1.cetak();
	System.out.println("======================");
	pgw2.cetak();
 }
}