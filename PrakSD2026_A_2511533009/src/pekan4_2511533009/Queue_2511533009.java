package pekan4_2511533009;

public class Queue_2511533009 {
	int rear_3009,front_3009,max_3009,size_3009;
	String[] queue_3009;
	public Queue_2511533009(int max_3009) {
		this.max_3009=max_3009;
		this.front_3009=0;
		this.size_3009=0;
		this.rear_3009=max_3009 - 1;
		this.queue_3009 = new String[max_3009];
	}
	
	public void enqueue_3009(String data_3009) {
		if (isFull_3009()) {
			System.out.println("Antrian penuh!!");
			return;
		}
		this.size_3009 += 1;
		this.rear_3009 = (this.rear_3009 + 1) % max_3009;
		this.queue_3009[rear_3009] = data_3009;
		System.out.println("data berhasil ditambahkan ke antrian");
	}
	
	public String dequeue_3009() {
		if (isEmpty_3009()) {
			System.out.println("Antrian kosong!!");
			return "";
		}
		String item_3009 = queue_3009[front_3009];
		this.size_3009-=1;
		this.front_3009 = (this.front_3009 + 1) % max_3009;
		System.out.println(item_3009 + " telah dilayani");
		return item_3009;
		
	}
	
	public boolean isEmpty_3009() {
		return this.size_3009 <= 0;
	}
	
	public boolean isFull_3009() {
		return this.size_3009 == this.max_3009;
	}
	
	public void reverse_3009() {
		if (isEmpty_3009()) {
			System.out.println("Antrian kosong");
			return;
		}
		
		int i_3009 = front_3009;
        int j_3009 = rear_3009;
        while (i_3009 < j_3009) {
            String temp_3009 = queue_3009[i_3009];
            queue_3009[i_3009] = queue_3009[j_3009];
            queue_3009[j_3009] = temp_3009;
            i_3009++;
            j_3009--;
        }
        display_3009();
	}
	
	public void display_3009() {
		System.out.println("Isi Antrian: ");
		for (int i_3009 = front_3009;i_3009 <= rear_3009;i_3009++) {
			System.out.println((i_3009+1) + ". " + queue_3009[i_3009]);
		}
	}

}
