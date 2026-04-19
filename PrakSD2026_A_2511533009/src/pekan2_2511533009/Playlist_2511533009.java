package pekan2_2511533009;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533009 {
    //ArrayList yang menyimpan data Objek Musik_2511533009
    private static ArrayList<Musik_2511533009> playlistMusik_3009 = new ArrayList<>();
    //Method untuk menambahkan lagu
    public static void tambahLagu_2511533009(Scanner input_3009){
        System.out.println("Masukkan Judul Lagu: ");
        String judulLagu_3009 = input_3009.next();
        System.out.println("Masukkan Penyanyi: ");
        String penyanyi_3009= input_3009.next();
        System.out.println("Masukkan Durasi: ");
        int durasi_3009= input_3009.nextInt();
        Musik_2511533009 musik_3009 = new Musik_2511533009(judulLagu_3009,penyanyi_3009,durasi_3009);
        playlistMusik_3009.add(musik_3009);
    }
    //Method untuk menampilkan semua lagu pada playlist
    public static void lihatPlayList_3009(){
        for(Musik_2511533009 semuaLagu_3009 : playlistMusik_3009){
            System.out.println("===================");
            System.out.println(semuaLagu_3009);
            System.out.println("===================");
        }
    }
    //Method untuk hapus lagu
    public static void hapusLagu_3009(Scanner input_3009){
        System.out.println("== Hapus Lagu ==");
        System.out.print("Index: ");
        int indeks_3009 = input_3009.nextInt();
        if (indeks_3009 >= playlistMusik_3009.size() ||
                indeks_3009 < 0){
            System.out.println("Tidak dapat menghapus lagu pada indeks ke-" + indeks_3009);
            System.out.println("Alasan: Kapasitas playlist dibawah indeks yang dimasukkan");
        }
        playlistMusik_3009.remove(indeks_3009);
        System.out.println("\nBerhasil menghapus lagu index ke-" + indeks_3009);
    }
    //Method untuk cek kapasitas
    public static void cekKapasitas_3009(){
        System.out.println("Total lagu pada playlist: " + playlistMusik_3009.size());
    }

    public static void main(String[] args){
        int pilihan_3009 = 0;
        Scanner scanner = new Scanner(System.in);
        while (pilihan_3009 != 4){
        	System.out.println("=== Playlist Musik NIM: 2311532008 ===");
            System.out.println("1. Tambah Lagu\n" +
                    "2. Lihat Playlist\n" +
                    "3. Hapus Lagu\n" +
                    "4. Keluar\n");
            System.out.print("Pilihan: ");
            pilihan_3009 = scanner.nextInt();
            if (pilihan_3009 == 1){
                tambahLagu_2511533009(scanner);
            } else if (pilihan_3009 == 2) {
                lihatPlayList_3009();
            } else if (pilihan_3009 == 3) {
                hapusLagu_3009(scanner);
            } else if (pilihan_3009 == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!!!!!");
                break;
            }
        }
    }
}
