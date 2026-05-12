package pekan6_2511533009;

public class PenelusuranDLL_2511533009 {
    //fungsi penelusuran maju
    static void forwardTraversal_3009(NodeDLL_2511533009 head_3009){
        // memulai penelusuran dari head_3009
        NodeDLL_2511533009 curr_3009 = head_3009;
        //lanjutkan sampai akhir
        while (curr_3009 != null){
            //print data
            System.out.print(curr_3009.data_3009 + " <-> ");
            //pindah ke node berikutnya
            curr_3009 = curr_3009.next_3009;
        }
        //print spasi
        System.out.println();
    }
    //fungsi penelusuran
    static void backwardTraversal_3009(NodeDLL_2511533009 tail_3009){
        // mulai dari akhir
        NodeDLL_2511533009 curr_3009 = tail_3009;
        //lanjut sampai head
        while (curr_3009 != null) {
            // cetak data
            System.out.print(curr_3009.data_3009 + " <-> ");
            //pindah ke node sebelumnya
            curr_3009 = curr_3009.prev_3009;
        }
        //cetak spasi
        System.out.println();
    }

    public static void main(String[] args) {
        // cetak DLL
        NodeDLL_2511533009 head_3009 = new NodeDLL_2511533009(1);
        NodeDLL_2511533009 second_3009 = new NodeDLL_2511533009(2);
        NodeDLL_2511533009 third_3009 = new NodeDLL_2511533009(3);
        
        head_3009.next_3009 = second_3009;
        second_3009.prev_3009 = head_3009;
        second_3009.next_3009 = third_3009;
        third_3009.prev_3009=  second_3009;

        System.out.println("Penelusuran maju:");
        forwardTraversal_3009(head_3009);

        System.out.println("Penelusuran mundur: ");
        backwardTraversal_3009(third_3009);
    }
}
