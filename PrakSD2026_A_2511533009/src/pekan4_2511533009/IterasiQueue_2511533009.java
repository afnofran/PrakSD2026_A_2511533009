package pekan4_2511533009;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class IterasiQueue_2511533009 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Queue<String> q_3009 = new LinkedList<>();

        q_3009.add("Praktikum");
        q_3009.add("Struktur");
        q_3009.add("Data");
        q_3009.add("Dan");
        q_3009.add("Algoritma");
        Iterator<String> iterator_3009 = q_3009.iterator();
        while (iterator_3009.hasNext()){
            System.out.print(iterator_3009.next() + " ");
        }
    }

}
