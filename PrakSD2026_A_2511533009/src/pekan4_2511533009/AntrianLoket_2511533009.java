package pekan4_2511533009;

import java.util.Scanner;

public class AntrianLoket_2511533009 {
	public static void main(String[] args) {
		Queue_2511533009 antrian_3009 = new Queue_2511533009(10);
		Scanner input_3009 = new Scanner(System.in);
		System.out.println("=== PROGRAM ANTRIAN LOKET ===\r\n"
				+ "1. Tambah Antrian\r\n"
				+ "2. Hapus Antrian\r\n"
				+ "3. Tampilkan Antrian\r\n"
				+ "4. Reverse\r\n"
				+ "5. Keluar");
		int pilihan_3009 = 0;
		while (pilihan_3009 != 5) {
			System.out.print("Pilih menu: ");
			pilihan_3009 = input_3009.nextInt();
			if (pilihan_3009 == 1) {
				System.out.print("\nMasukkan nama pelanggan: ");
				String nama_3009 = input_3009.next();
				antrian_3009.enqueue_3009(nama_3009);
			}else if(pilihan_3009 == 2) {
				antrian_3009.dequeue_3009();
			}else if(pilihan_3009 == 3) {
				antrian_3009.display_3009();
			}else if(pilihan_3009 == 4) {
				antrian_3009.reverse_3009();
			}else if(pilihan_3009 == 5) {
				System.out.println("program selesai");
				break;
			}else {
				System.out.println("Perintah tidak valid!");
				continue;
			}
		}
	}
}
