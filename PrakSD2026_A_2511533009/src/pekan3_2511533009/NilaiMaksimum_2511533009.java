package pekan3_2511533009;

import java.util.Stack;

public class NilaiMaksimum_2511533009 {
    public static int max_3009(Stack<Integer> s_3009){
        Stack<Integer> backup_3009 = new Stack<Integer>();
        int maxValue_3009 = s_3009.pop();
        backup_3009.push(maxValue_3009);
        while (!s_3009.isEmpty()){
            int next_3009 = s_3009.pop();
            backup_3009.push(next_3009);
            maxValue_3009 = Math.max(maxValue_3009,next_3009);
        }
        while (!backup_3009.isEmpty()) {
            s_3009.push(backup_3009.pop());
        }
        return maxValue_3009;
    }
    public static void main(String[] args){
        Stack<Integer> s_3009 = new Stack<Integer>();
        s_3009.push(70);
        s_3009.push(12);
        s_3009.push(20);
        System.out.println("isi stack " + s_3009);
        System.out.println("Stack Teratas " + s_3009.peek());
        System.out.println("Nilai maksimum " + max_3009(s_3009));
    }
}
