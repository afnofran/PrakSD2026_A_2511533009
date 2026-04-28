package pekan4_2511533009;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533009 {
	public static void main(String[] args) {
		Queue<Integer> q_3009 = new LinkedList<Integer>();
		q_3009.add(1);
		q_3009.add(2);
		q_3009.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse" + q_3009);
		Stack<Integer> s_3009 = new Stack<Integer>();
		while (!q_3009.isEmpty()) { // Q -> S
			s_3009.push(q_3009.remove());
		}
		while(!s_3009.isEmpty()) { //  S -> Q
			q_3009.add(s_3009.pop());
		}
		System.out.println("sesudah reverse= " + q_3009); // [3, 2, 1]
	}
	
}