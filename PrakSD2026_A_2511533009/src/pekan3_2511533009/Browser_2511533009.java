package pekan3_2511533009;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533009 {
    //Stack browser
    private static Stack<Website_2511533009> browser_3009 = new Stack<>();
    //Method kunjingi website
    public static void kunjungiWebsite_3009(Scanner input_3009){
        System.out.print("\nMasukkan Judul: ");
        String judul_3009 = input_3009.next();
        System.out.print("\nMasukkan URL: ");
        String url_3009 = input_3009.next();
        Website_2511533009 web_3009 = new Website_2511533009(judul_3009,url_3009);
        browser_3009.push(web_3009);
    }
    //Method TOMBOL BACK
    public static void back_3009(){
        System.out.println(browser_3009.pop().toString());
    }
    //Method tombol Lihat halaman saat ini
    public static void lihatHalamanAktif_3009(){
        if (browser_3009.isEmpty()){
            System.out.println("Browser aktif kosong!");
        }else {
            System.out.println(browser_3009.peek().toString());
        }
    }

    public static void main(String[] args){
        int pilihan_3009 = 0;
        Scanner scanner = new Scanner(System.in);
        while (pilihan_3009 != 4){
            System.out.println("=== Browser History NIM: 2411532007 ===\n" +
                    "1. Kunjungi Website (Push)\n" +
                    "2. Tombol Back (Pop)\n" +
                    "3. Lihat Halaman Aktif (Peek)\n" +
                    "4. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3009 = scanner.nextInt();
            if (pilihan_3009 == 1){
                kunjungiWebsite_3009(scanner);
            } else if (pilihan_3009 == 2) {
                back_3009();
            } else if (pilihan_3009 == 3) {
                lihatHalamanAktif_3009();
            } else if (pilihan_3009 == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!!!!!");
                break;
            }
        }
    }
}

