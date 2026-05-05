package pekan5_2511533009;

public class TambahSLL_2511533009 {
	public static NodeSLL_2511533009 insertAtFront_3009(NodeSLL_2511533009 head_3009, int value_3009) {
		NodeSLL_2511533009 new_node_3009 = new NodeSLL_2511533009(value_3009);
		new_node_3009.next_3009 = head_3009;
		
		return new_node_3009;
	}
	
	// adds node in the end funct
	public static NodeSLL_2511533009 insertAtEnd_3009(NodeSLL_2511533009 head_3009, int value_3009) {
		// create node with a value
		NodeSLL_2511533009 newNode_3009 = new NodeSLL_2511533009(value_3009);
		
		// if list isEmpty, then node ecomes head
		if (head_3009 == null) {
			return newNode_3009;
		}
		
		// store head to temp. var.
		NodeSLL_2511533009 last_3009 = head_3009;
		// find to the last node
		while (last_3009.next_3009 != null) {
			last_3009 = last_3009.next_3009;
		}
		
		// change the pointer
		last_3009.next_3009 =  newNode_3009;
		return head_3009;
	}
	static NodeSLL_2511533009 GetNode_3009(int data_3009) {
		return new NodeSLL_2511533009(data_3009);
	}
	
	static NodeSLL_2511533009 insertPos_3009(NodeSLL_2511533009 headNode_3009, int pos_3009, int val_3009) {
		NodeSLL_2511533009 head_3009 = headNode_3009;
		if (pos_3009 < 1) {
			System.out.println("Invalid position.");
		}
		if (pos_3009 == 1) {
			NodeSLL_2511533009 new_node_3009 = new NodeSLL_2511533009(val_3009);
			new_node_3009.next_3009 = head_3009;
			return new_node_3009;
		} else {
			while (pos_3009-- != 0) {
				if (pos_3009 == 1) {
					NodeSLL_2511533009 newNode_3009 = GetNode_3009(val_3009);
					newNode_3009.next_3009 = headNode_3009.next_3009;
					headNode_3009.next_3009 = newNode_3009;
					break;
				}
				headNode_3009 = headNode_3009.next_3009;
			}
			if (pos_3009 != 1)
				System.out.println("Posisi di luar jangkauan");
		}
		return head_3009;
	}
	public static void printList_3009(NodeSLL_2511533009 head_3009) {
		NodeSLL_2511533009 curr_3009 = head_3009;
		while (curr_3009.next_3009 != null) {
			System.out.print(curr_3009.data_3009 + "-->");
			curr_3009 = curr_3009.next_3009;
		}
		if (curr_3009.next_3009 == null) {
			System.out.print(curr_3009.data_3009);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// example linked list 2 -> 3 -> 5 -> 6
		NodeSLL_2511533009 head_3009 = new NodeSLL_2511533009(2);
		head_3009.next_3009 = new NodeSLL_2511533009(3);
		head_3009.next_3009.next_3009 = new NodeSLL_2511533009(5);
		head_3009.next_3009.next_3009.next_3009 = new NodeSLL_2511533009(6);
		
		// print original list
		System.out.print("Senarai berantai awal : ");
		printList_3009(head_3009);
		
		// adds new node to the head
		System.out.print("tambah 1 simpul di depan: ");
		int data_3009 = 1;
		head_3009 = insertAtFront_3009(head_3009, data_3009);
		
		// print updated list
		printList_3009(head_3009);
		
		// adds new node to the end
		System.out.print("tambah 1 simpul di belakang: ");
		int data2_3009 = 7;
		head_3009 = insertAtEnd_3009(head_3009, data2_3009);
		
		// print updated list
		printList_3009(head_3009);
		
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_3009 = 4 ; 
		int pos_3009 = 4 ; 
		head_3009 = insertPos_3009(head_3009, pos_3009, data3_3009);
		
		// print updated list
		printList_3009(head_3009);
	}
}