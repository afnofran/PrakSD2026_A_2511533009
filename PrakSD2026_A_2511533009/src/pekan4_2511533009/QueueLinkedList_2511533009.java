package pekan4_2511533009;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533009 {
    
    public static void main(String[] args){
        Queue<Integer> q_3009 = new LinkedList<>();
        // tambah elemen {0,1,2,3,4,} ke antrian
        for (int i_3009 = 0; i_3009 < 6; i_3009++)
            q_3009.add(i_3009);
        // Menampilkan isi antrian.
        System.out.println("Elemen Antrian " + q_3009);
        //Untuk menghapus kepala antrian.
        int hapus_3009 = q_3009.remove();
        System.out.println("Hapus elemen = " + hapus_3009);
        System.out.println(q_3009);
        // Untuk melihat antrian terdepan
        int depan_3009 = q_3009.peek();
        System.out.println("Kepala Antrian = " + depan_3009);
       
        int banyak_3009 = q_3009.size();
        System.out.println("Size Antrian = " + banyak_3009);
    }
}

