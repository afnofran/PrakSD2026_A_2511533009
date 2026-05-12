package pekan6_2511533009;

public class InsertDLL_2511533009 {
     //menambahkan node di awal DLL
    static NodeDLL_2511533009 insertBegin_3009(NodeDLL_2511533009 head_3009, int data_3009){
        // buat node baru
        NodeDLL_2511533009 new_node_3009 = new NodeDLL_2511533009(data_3009);
        //jadikan poniter nextnya head
        new_node_3009.next_3009 = head_3009;
       //jadikan pointer prev head ke new_node
        if (head_3009 != null){
            head_3009.prev_3009 = new_node_3009;
        }
        return new_node_3009;
    }
    //fungsi menambahkan node di akhir
    public static NodeDLL_2511533009 insertEnd_3009(NodeDLL_2511533009 head_3009, int newData_3009){
        // buat node baru
        NodeDLL_2511533009 newNode_3009 = new NodeDLL_2511533009(newData_3009);
        //jika dll null jadikan head
        if(head_3009 == null) {
            head_3009 = newNode_3009;
        }
        else {
            NodeDLL_2511533009 curr_3009 = head_3009;
            while(curr_3009.next_3009 != null){
                curr_3009 = curr_3009.next_3009;
            }
            curr_3009.next_3009 = newNode_3009;
            newNode_3009.prev_3009 = curr_3009;
        }
        return head_3009;
    }

    //fungsi menambhakn node di posisi tertentu
    public static NodeDLL_2511533009 insertAtPosition_3009(NodeDLL_2511533009 head_3009, int pos_3009, int new_data_3009){
        //buat node baru
        NodeDLL_2511533009 new_node_3009 = new NodeDLL_2511533009(new_data_3009);
        if(pos_3009 == 1){
            new_node_3009.next_3009 = head_3009;
            if(head_3009 != null){
                head_3009.prev_3009 = new_node_3009;}
            head_3009 = new_node_3009;
            return head_3009;}
        NodeDLL_2511533009 curr_3009 = head_3009;
        for (int i_3009 = 1; i_3009 < pos_3009 - 1 && curr_3009 != null; i_3009++){
            curr_3009 = curr_3009.next_3009;}
            if (curr_3009 == null){
                System.out.println("Posisi tidak ada");
                return head_3009;}
            new_node_3009.prev_3009 = curr_3009;
            new_node_3009.next_3009 = curr_3009.next_3009;
            curr_3009.next_3009 = new_node_3009;
            if (new_node_3009.next_3009 != null){
                new_node_3009.next_3009.prev_3009 = new_node_3009;}
            return head_3009;
    }
    public static void printList_3009(NodeDLL_2511533009 head_3009){
        NodeDLL_2511533009 curr_3009 = head_3009;
        while (curr_3009 != null){
            System.out.print(curr_3009.data_3009 + " <-> ");
            curr_3009 = curr_3009.next_3009;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        // membuat dll 2 <-> 3 <-> 5;
        NodeDLL_2511533009 head_3009 = new NodeDLL_2511533009(2);
        head_3009.next_3009= new NodeDLL_2511533009(3);
        head_3009.next_3009.prev_3009 = head_3009;
        head_3009.next_3009.next_3009 = new NodeDLL_2511533009(5);
        //cetak DLL awal
        System.out.print("DLL Awal: ");
        printList_3009(head_3009);
        //tambah 1 di awal
        head_3009 = insertBegin_3009(head_3009,1);
        System.out.print(
                "Simpul 1 ditambah di awal: ");
        printList_3009(head_3009);
        //tambah 6 di akhir
        System.out.print(
                "simpul 6 dtambah di akhir: ");
        int data_3009 = 6;
        head_3009 = insertEnd_3009(head_3009,data_3009);
        printList_3009(head_3009);
        //menambah node 4 di posisi 4
        System.out.print("tambah node 4 di posisi 4: ");
        int data2_3009 = 4;
        int pos_3009 = 4;
        head_3009 = insertAtPosition_3009(head_3009,pos_3009,data2_3009);
        printList_3009(head_3009);
    }
}