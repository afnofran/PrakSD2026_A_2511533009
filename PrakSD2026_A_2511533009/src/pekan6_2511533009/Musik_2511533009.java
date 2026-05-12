package pekan6_2511533009;

import java.util.Scanner;

public class Musik_2511533009 {
    public static Lagu_2511533009 tambahLagu_3009(Lagu_2511533009 head_3009,Scanner input_3009){
        System.out.print("Masukkan Judul: ");
        String judul_3009 = input_3009.next();
        System.out.print("Masukkan Penyanyi: ");
        String penyanyi_3009 = input_3009.next();
        if (head_3009 == null)  return new Lagu_2511533009(judul_3009,penyanyi_3009);

        Lagu_2511533009 temp_3009 = head_3009;
        while (temp_3009.getNext_3009() != null){
            temp_3009 = temp_3009.getNext_3009();
        }
        temp_3009.setNext_3009(new Lagu_2511533009(
                judul_3009,
                penyanyi_3009
        ));
        temp_3009.getNext_3009().setPrev_3009(temp_3009);
        return head_3009;
    }

    public static Lagu_2511533009 hapusLaguAwal_3009(Lagu_2511533009 lagu_3009){
        if (lagu_3009 == null){
            System.out.println("Musik Kosong!!");
            return null;
        }
        if (lagu_3009.getNext_3009() != null)
            lagu_3009.getNext_3009().setPrev_3009(null);
        else if(lagu_3009.getNext_3009() == null) return null;
        return lagu_3009.getNext_3009();
    }

    public static void tampilMaju_3009(Lagu_2511533009 head_3009){
        if (head_3009 == null){
            System.out.println("Musik Kosong!!");
            return;
        }
        Lagu_2511533009 temp_3009 = head_3009;
        int count_3009 = 1;
        while (temp_3009.getNext_3009() != null){
            System.out.println("urutan ke " + count_3009);
            System.out.println("Judul: "+temp_3009.judul_3009);
            System.out.println("Penyanyi: " + temp_3009.penyanyi_3009);
            temp_3009 = temp_3009.getNext_3009();
            count_3009++;
        }
        System.out.println("urutan ke " + count_3009);
        System.out.println("Judul: "+temp_3009.judul_3009);
        System.out.println("Penyanyi: " + temp_3009.penyanyi_3009);
    }

    public static void tampilMundur_3009(Lagu_2511533009 head_3009){
        if (head_3009 == null){
            System.out.println("Musik Kosong!!");
            return;
        }
        Lagu_2511533009 temp_3009 = head_3009;
        int count_3009 = 1;
        while (temp_3009.getNext_3009() != null){
            count_3009++;
            temp_3009 = temp_3009.getNext_3009();
        }
        while(temp_3009.getPrev_3009() != null){
            System.out.println("No. " + count_3009);
            System.out.println("Judul: " + temp_3009.getJudul_3009());
            System.out.println("Penyanyi: " + temp_3009.getPenyanyi_3009());
            temp_3009 = temp_3009.getPrev_3009();
            count_3009--;
        }
        System.out.println("urutan ke " + count_3009);
        System.out.println("Judul: "+temp_3009.judul_3009);
        System.out.println("Penyanyi: " + temp_3009.penyanyi_3009);
    }

    public static void cariLagu_3009(Lagu_2511533009 head_3009,Scanner input_3009){
        System.out.println("Cari lagu berdasarkan judul");
        System.out.print("Judul yang dicari: ");
        String judul_3009 = input_3009.next();
        while (head_3009 != null && !head_3009.getJudul_3009().equalsIgnoreCase(judul_3009)){
            head_3009 = head_3009.getNext_3009();
        }
        if (head_3009 == null){
            System.out.println("Lagu dengan judul "+ judul_3009 + " TIDAK dapat ditemukan!");
            return;
        }
        System.out.println("Lagu dengan judul " + judul_3009 +" ditemukan dimusik!");
    }

    public static void main(String[] args){
        Lagu_2511533009 head_3009 = null;
        int pilihan_3009 = 0;
        Scanner input_3009 = new Scanner(System.in);
        while (pilihan_3009 != 6){
            System.out.println("=== Playlist Musik NIM: 2411531005 ===\n" +
                    "1. Tambah Lagu\n" +
                    "2. Hapus Lagu Pertama\n" +
                    "3. Lihat Playlist (Maju)\n" +
                    "4. Lihat Playlist (Mundur)\n" +
                    "5. Cari Lagu\n" +
                    "6. Keluar\n");
            System.out.print("Pilihan: ");
            pilihan_3009 = input_3009.nextInt();
            switch (pilihan_3009){
                case 1:
                    head_3009 = tambahLagu_3009(head_3009,input_3009);
                    break;
                case 2:
                    head_3009 = hapusLaguAwal_3009(head_3009);
                    break;
                case 3:
                    tampilMaju_3009(head_3009);
                    break;
                case 4:
                    tampilMundur_3009(head_3009);
                    break;
                case 5:
                    cariLagu_3009(head_3009,input_3009);
                    break;
                case 6:
                    System.out.println("Keluar Dari Program.\nTermiakasih telah menggunakan!");
                    break;
            }
        }
    }
}
