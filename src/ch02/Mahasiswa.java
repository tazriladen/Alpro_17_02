package ch02;
public class Mahasiswa{
	String nama;
	String nim;
	String alamat;
	String hp;
	
	public String getNama(){
	return nama;
		}
	public String getNim(){
	return nim;
		}
	public String getAlamat(){
	return alamat;
		}
	public String getHp(){
	return hp;
		}

public void cetak(){
	System.out.println ("Nama : " +nama);
	System.out.println ("NIM : " +nim);
	System.out.println ("Alamat : " +alamat);
	System.out.println ("Hp : "+hp);
	}

}
