package pekan3_2511533009;

public class stackArray_2511533009 {
    static final int MAX_3009 = 1000;
    int top_3009;
    int a_3009[] = new int[MAX_3009];
    boolean isEmpty_3009()
    {
        return (top_3009<0);
    }
    stackArray_2511533009()
    {
        top_3009= -1;
    }
    boolean push_3009(int x)
    {
        if (top_3009 >= (MAX_3009 - 1)){
            System.out.println("Stack overflow");
            return false;
        }
        else {
            a_3009[++top_3009] = x;
            System.out.println(x + " dimasukka dalam stack");
            return true;
        }
    }
    int pop_3009()
    {
        if (top_3009 <0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int x_3009 = a_3009[top_3009--];
            return x_3009;
        }
    }
    int peek_3009() {
        if (top_3009 < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x_3009 = a_3009[top_3009];
            return x_3009;
        }
    }
    void print_3009(){
        for (int i = top_3009;i >-1;i--){
            System.out.print(" " + a_3009[i]);
        }
    }

}
