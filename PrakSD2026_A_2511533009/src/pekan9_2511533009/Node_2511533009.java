package pekan9_2511533009;

public class Node_2511533009 {
    int data_3009;
    Node_2511533009 left_3009;
    Node_2511533009 right_3009;
    public Node_2511533009(int data_3009){
        this.data_3009=data_3009;
        left_3009 = null;
        right_3009 = null;
    }

    public void setLeft_3009(Node_2511533009 node_3009){
        if (left_3009 == null)
            left_3009 = node_3009;
    }
    public void setRight_3009(Node_2511533009 node_3009){
        if (right_3009 == null)
            right_3009 = node_3009;
    }
    public Node_2511533009 getLeft_3009(){
        return this.left_3009;
    }
    public Node_2511533009 getRight_3009(){
        return this.right_3009;
    }
    public int getData_3009(){
        return data_3009;
    }
    public void setData_3009(int data_3009){
        this.data_3009 = data_3009;
    }
    void printPreorder_3009(Node_2511533009 node_3009){
        if (node_3009 == null)
            return;
        System.out.printf(node_3009.data_3009 + " ");
        printPreorder_3009(node_3009.left_3009);
        printPreorder_3009(node_3009.right_3009);
    }

    void printPostorder_3009(Node_2511533009 node_3009){
        if (node_3009 == null )
            return;
        printPostorder_3009(node_3009.left_3009);
        printPostorder_3009(node_3009.right_3009);
        System.out.printf(node_3009.data_3009 + " ");
    }

    void printInorder_3009(Node_2511533009 node_3009){
        if (node_3009 == null)
            return;
        printInorder_3009(node_3009.left_3009);
        System.out.printf(node_3009.data_3009 + " ");
        printInorder_3009(node_3009.right_3009);
    }

    public String print_3009(){
        return  this.print_3009("",true,"");
    }
    
    public String print_3009(String prefix_3009, boolean isTail_3009,String sb_3009){
        if (right_3009 != null){
            right_3009.print_3009(prefix_3009 + (isTail_3009 ? "| " : "  "),false,sb_3009);
        }
        System.out.println(prefix_3009 + (isTail_3009 ? "\\--  " : "/-- ") + data_3009);
        if (left_3009 != null){
            left_3009.print_3009(prefix_3009 + (isTail_3009 ? " " : "| "),true,sb_3009);
        }
        return sb_3009;
    }
}
