package ch02;
public class ObjectFakultas {
	public static void main (String [] args) {
	
	Fakultas fk1 = new Fakultas();
	Fakultas fk2 = new Fakultas();

	fk1.nama = "Sains dan Teknologi";
	fk1.jumlahMahasiswa = 2354;

	fk2.nama = "Psikologi";
	fk2.jumlahMahasiswa = 1202;

	System.out.println ("Fakultas : "+fk1.getNama());
	System.out.println ("Jumlah Mahasiswa : "+fk1.getJumlahMahasiswa());

 	System.out.println ("Fakultas : "+fk2.getNama());
	System.out.println ("Jumlah Mahasiswa : "+fk2.getJumlahMahasiswa());

 }
}