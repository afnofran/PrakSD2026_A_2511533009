package pekan5_2511533009;

public class HapusSSL_2511533009{

	// funtion to delete head node
	public static NodeSLL_2511533009 deleteHead_3009(NodeSLL_2511533009 head_3009) {
		// if SLL is empty
		if (head_3009 == null)
			return null; 
		 
		// move to the next node
		head_3009 =	head_3009.next_3009;
		
		// return new head
		return head_3009;
	}
	
	// function to delete last node
	public static NodeSLL_2511533009 removeLastNode_3009(NodeSLL_2511533009 head3009) {
		// if the list is empty, return null value
		if (head3009 == null) {
			return null;
		}
		
		
		//if list contains one node, delete node and return null
		if (head3009.next_3009 == null) {
			return null;
		}
		
		// search second last node
		NodeSLL_2511533009 secondLast_3009 = head3009;
		while (secondLast_3009.next_3009.next_3009 != null) {
			secondLast_3009 = secondLast_3009.next_3009;
		}
		
		// delete last node
		secondLast_3009.next_3009 = null;
		return head3009;
	}
	
	// function to delete node in a certain position
	public static NodeSLL_2511533009 deleteNode_3009(NodeSLL_2511533009 head_3009, int pos_3009) {
		NodeSLL_2511533009 temp_3009 = head_3009;
		NodeSLL_2511533009 prev_3009 = null;
		
		// if linked list is null
		if (temp_3009 == null)
			return head_3009;
		
		// case 1 : head is deleted
		if (pos_3009 == 1) {
			head_3009 = temp_3009.next_3009;
			return head_3009;
		}
		
		// kasus 2 : menghapus node di tengah
		// search to the targeted node that will to be deleted
		for (int i_3009 = 1; temp_3009 != null && i_3009 < pos_3009; i_3009++) {
			prev_3009 = temp_3009;
			temp_3009 = temp_3009.next_3009;
		}
		// if founded, delete node
		if (temp_3009 != null) {
			prev_3009.next_3009 = temp_3009.next_3009;
		} else {
			System.out.println("Data tidak ditemukan");
		}
		return head_3009;		
	}
	
	//Fungsi mencetak SLL
	public static void printList_3009(NodeSLL_2511533009 head_3009) {
		NodeSLL_2511533009 curr_3009 = head_3009;
		while (curr_3009.next_3009 != null) {
			System.out.print(curr_3009.data_3009 + "-->");
			curr_3009 = curr_3009.next_3009;
		}
		if (curr_3009.next_3009 == null) {
			System.out.print(curr_3009.data_3009);
		}
		System.out.println();
	}
	
	// Kelas Main
	public static void main(String[] args) {
		// buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2511533009 head_3009 = new NodeSLL_2511533009(1);
		head_3009.next_3009 = new NodeSLL_2511533009(2);
		head_3009.next_3009.next_3009 = new NodeSLL_2511533009(3);
		head_3009.next_3009.next_3009.next_3009 = new NodeSLL_2511533009(4);
		head_3009.next_3009.next_3009.next_3009.next_3009 = new NodeSLL_2511533009(5);
		head_3009.next_3009.next_3009.next_3009.next_3009.next_3009 = new NodeSLL_2511533009(6);
		
		// cetak list awal
		System.out.println("list awal : ");
		printList_3009(head_3009);		
		
		// hapus head
		head_3009 = deleteHead_3009(head_3009);
		System.out.println("List Setelah head dihapus");
		printList_3009(head_3009);
		
		// hapus node terakhir
		head_3009 = removeLastNode_3009(head_3009);
		System.out.println("List setelah simpul terakhir di hapus : ");
		printList_3009(head_3009);
		
		// deleting node at pos[2]
		int pos2_3009 = 2;
		head_3009 = deleteNode_3009(head_3009, pos2_3009);
		// print list after deletion
		System.out.println("List setelah posisi 2 dihapus : ");
		printList_3009(head_3009);;
	}
}