package pekan6_2511533009;

public class HapusDLL_2511533009 {
    //fungsi mengahapus node awal
    public static NodeDLL_2511533009 delHead_3009(NodeDLL_2511533009 head_3009){
        if (head_3009 == null) {
            return null;}
        NodeDLL_2511533009 temp_3009 = head_3009;
        head_3009 = head_3009.next_3009;
        if (head_3009 != null){
            head_3009.prev_3009 = null;}
        return head_3009;
    }
    //fungsi mehapus di akhir
    public static NodeDLL_2511533009 delLast_3009(NodeDLL_2511533009 head_3009){
        if (head_3009 == null){
            return null;}
        if (head_3009.next_3009 == null){
            return  null;}
        NodeDLL_2511533009 curr_3009 = head_3009;
        while (curr_3009.next_3009 != null){
            curr_3009 = curr_3009.next_3009;
        }
        //update pointer previouse ndoe
        if (curr_3009.prev_3009 != null){
            curr_3009.prev_3009.next_3009 = null;
        }
        return head_3009;
    }
    //fungsi menghapus node posisi tertentu
    public static NodeDLL_2511533009 delPos_3009(NodeDLL_2511533009 head_3009, int pos_3009){
        // jika DLL kosog
        if (head_3009 == null){
            return head_3009;}
        NodeDLL_2511533009 curr_3009 = head_3009;
        //telusuri sampai ke node yang akan dihaus
        for (int i_3009 = 1; curr_3009 != null && i_3009 < pos_3009;i_3009++){
            curr_3009 = curr_3009.next_3009;}
        //jika posisi tidak ditemukan
        if (curr_3009 == null){
            return null;}
        //update pointer
        if (curr_3009.prev_3009 != null){
            curr_3009.prev_3009.next_3009 = curr_3009.next_3009;}
        if (curr_3009.next_3009 != null){
            curr_3009.next_3009.prev_3009 = curr_3009.prev_3009;}
        //jika yang dihapus head
        if (head_3009 == curr_3009){
            head_3009 = curr_3009.next_3009;}
        return head_3009;
    }

    //fungsi mencetak DLL
    public static void printList_3009(NodeDLL_2511533009 head_3009){
        NodeDLL_2511533009 curr_3009 = head_3009;
        while (curr_3009 != null){
            System.out.print(curr_3009.data_3009 + " <-> ");
            curr_3009 = curr_3009.next_3009;
        }
        System.out.println();
    }

    public static void main(String[] args){
        //buat sebuah DLL
        NodeDLL_2511533009 head_3009 = new NodeDLL_2511533009(1);
        head_3009.next_3009 = new NodeDLL_2511533009(2);
        head_3009.next_3009.prev_3009 = head_3009;
        head_3009.next_3009.next_3009 = new NodeDLL_2511533009(3);
        head_3009.next_3009.next_3009.prev_3009 = head_3009.next_3009;
        head_3009.next_3009.next_3009.next_3009 = new NodeDLL_2511533009(4);
        head_3009.next_3009.next_3009.next_3009.prev_3009 = head_3009.next_3009.next_3009;
        head_3009.next_3009.next_3009.next_3009.next_3009 = new NodeDLL_2511533009(5);
        head_3009.next_3009.next_3009.next_3009.next_3009.prev_3009 = head_3009.next_3009.next_3009.next_3009;

        System.out.println("DLL Awal: ");
        printList_3009(head_3009);

        System.out.println("Setelah Head dihapus: ");
        head_3009 = delHead_3009(head_3009);
        printList_3009(head_3009);

        System.out.println("Setelah node terakhir dihapus: ");
        head_3009 = delLast_3009(head_3009);
        printList_3009(head_3009);

        System.out.println("menghapus node ke 2: ");
        head_3009 = delPos_3009(head_3009,2);
        
        printList_3009(head_3009);
    }
}
