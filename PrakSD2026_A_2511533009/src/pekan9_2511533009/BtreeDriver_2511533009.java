package pekan9_2511533009;

public class BtreeDriver_2511533009 {
    public static void main(String[] args){
        //Membuat Pohon
        BTree_2511533009 tree_3009 = new BTree_2511533009();
        System.out.printf("umlah Simpul awal pohon: ");
        System.out.println(tree_3009.countNodes_3009());
        //menambahkan simpul data 1
        Node_2511533009 root_3009 = new Node_2511533009(1);
        tree_3009.setRoot_3009(root_3009);
        //menjadikan simpul 1 sebagai root
        System.out.println("Jumlah simpul jika hanya ada root");

        System.out.println(tree_3009.countNodes_3009());
        Node_2511533009 node2_3009 =  new Node_2511533009(2);
        Node_2511533009 node3_3009 =  new Node_2511533009(3);
        Node_2511533009 node4_3009 =  new Node_2511533009(4);
        Node_2511533009 node5_3009 =  new Node_2511533009(5);
        Node_2511533009 node6_3009 =  new Node_2511533009(6);
        Node_2511533009 node7_3009 =  new Node_2511533009(7);
        Node_2511533009 node8_3009 =  new Node_2511533009(8);
        Node_2511533009 node9_3009 =  new Node_2511533009(9);
        root_3009.setLeft_3009(node2_3009);
        node2_3009.setLeft_3009(node4_3009);
        node2_3009.setRight_3009(node5_3009);
        node4_3009.setRight_3009(node8_3009);
        root_3009.setRight_3009(node3_3009);
        node3_3009.setLeft_3009(node6_3009);
        node3_3009.setRight_3009(node7_3009);
        node6_3009.setLeft_3009(node9_3009);
        //Set root
        tree_3009.setCurrent_3009(tree_3009.getRoot_3009());
        System.out.println("Menampilkan simpul treakihr: ");
        System.out.println(tree_3009.getCurrentNode_3009().getData_3009());
        System.out.println("Jumlah simpul; setelah simmpul 7 ditambahkan");
        System.out.println(tree_3009.countNodes_3009());
        System.out.println("InOrder: ");
        tree_3009.printInorder_3009();
        System.out.println("\nPreorder: ");
        tree_3009.printPreOrder_3009();
        System.out.println("\nPostorder:");
        tree_3009.printPostOrder_3009();
        System.out.println("\nDMenampilkan simpul dalam bentuk pohon");
        tree_3009.print_3009();
    }
}
