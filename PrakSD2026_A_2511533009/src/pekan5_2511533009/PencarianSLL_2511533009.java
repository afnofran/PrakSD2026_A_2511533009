package pekan5_2511533009;

public class PencarianSLL_2511533009 {
	
	static boolean searchKey_3009(NodeSLL_2511533009 head_3009, int key_3009) {
		NodeSLL_2511533009 curr_3009 = head_3009;
		while (curr_3009 != null) {
			if (curr_3009.data_3009 == key_3009)
				return true;
			curr_3009 = curr_3009.next_3009;					
		}
		return false;
	}
	
	public static void traversal_3009(NodeSLL_2511533009 head_3009) {
		// start from head
		NodeSLL_2511533009 curr_3009 = head_3009;
		
		// search until pointer == null
		while (curr_3009 != null) {
			System.out.print(" " + curr_3009.data_3009);
			curr_3009 = curr_3009.next_3009;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		NodeSLL_2511533009 head_3009 = new NodeSLL_2511533009(14);
		head_3009.next_3009 = new NodeSLL_2511533009(21);
		head_3009.next_3009.next_3009 = new NodeSLL_2511533009(13);
		head_3009.next_3009.next_3009.next_3009 = new NodeSLL_2511533009(30);
		head_3009.next_3009.next_3009.next_3009.next_3009 = new NodeSLL_2511533009(10);
		System.out.print("Penelusuran SLL : ");
		traversal_3009(head_3009);
		
		// data that will be searched
		int key_3009 = 30;
		System.out.print("cari data " + key_3009 + " = ");
		if (searchKey_3009(head_3009, key_3009))
			System.out.println("data ditemukan");
		else 
			System.out.println("data tidak ditemukan");
	}
}