package pekan9_2511533009;

public class BTree_2511533009 {
    private Node_2511533009 root_3009;
    private Node_2511533009 currentNode_3009;
    public  BTree_2511533009(){
        root_3009 = null;
    }
    public boolean search_3009(int data_3009){
        return search_3009(root_3009,data_3009);
    }
    private boolean search_3009(Node_2511533009 node_3009,int data_3009){
        if (node_3009.getData_3009() == data_3009)
            return true;
        if (node_3009.getLeft_3009() != null)
            if (search_3009(node_3009.getLeft_3009(),data_3009))
                return true;
        if (node_3009.getRight_3009() != null)
            if (search_3009(node_3009.getRight_3009(),data_3009))
                return true;
        return false;
    }
    public void printInorder_3009(){
        root_3009.printInorder_3009(root_3009);
    }
    public void printPreOrder_3009(){
        root_3009.printPreorder_3009(root_3009);
    }
    public void printPostOrder_3009(){
        root_3009.printPostorder_3009(root_3009);
    }

    public Node_2511533009 getRoot_3009(){
        return root_3009;
    }

    public boolean isEmpty_3009(){
        return root_3009 == null;
    }

    public int countNodes_3009(){
        return countNodes_3009(root_3009);
    }

    public int countNodes_3009(Node_2511533009 node_3009){
        int count_3009 = 1;
        if (node_3009 == null){
            return 0;
        } else {
            count_3009 += countNodes_3009(node_3009.getLeft_3009());
            count_3009 += countNodes_3009(node_3009.getRight_3009());
            return count_3009;
        }
    }

    public void print_3009(){
        root_3009.print_3009();
    }

    public Node_2511533009 getCurrentNode_3009(){
        return currentNode_3009;
    }

    public void setCurrent_3009(Node_2511533009 currentNode_3009) {
        this.currentNode_3009 = currentNode_3009;
    }

    public void setRoot_3009(Node_2511533009 root_3009) {
        this.root_3009 = root_3009;
    }
}
