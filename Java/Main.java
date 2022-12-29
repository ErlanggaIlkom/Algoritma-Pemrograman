package Java; 
// Modul pertemuan 9 
// import Scanner ke program
import java.util.Scanner;
	
public class Main {
	
	public static void main(String[] args) {
	    // deklarasikan variabelnya
	    String nama, alamat;
	    int usia, berat_badan;
	
	    try (// buat scanner baru
		Scanner keyboard = new Scanner(System.in)) {
			System.out.print("Nama: ");
			// Scanner u/ menyimpan apa yang diketik di variabel nama
			nama = keyboard.nextLine();
			// Tampilkan output lagi
			System.out.print("Alamat: ");
			// menggunakan scanner lagi
			alamat = keyboard.nextLine();
			System.out.print("Usia: ");
			usia = keyboard.nextInt();
			System.out.print("Berat Badan: ");
			berat_badan = keyboard.nextInt();
		}
	
	    // Menampilkan apa yang sudah simpan di variable/output
	    System.out.println("============================");
	    System.out.println("Nama: " + nama);
	    System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " Tahun");
	    System.out.println("Berat Badan: " + berat_badan + "kg");
	}
}

