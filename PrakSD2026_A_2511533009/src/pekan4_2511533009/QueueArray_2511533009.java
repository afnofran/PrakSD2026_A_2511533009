package pekan4_2511533009;

public class QueueArray_2511533009 {
    int front_3009, rear_3009, size_3009;
    int capacity_3009;
    int array_3009[];

    public QueueArray_2511533009(int capacity_3009){
        this.capacity_3009=capacity_3009;
        front_3009=this.size_3009=0;
        rear_3009 = capacity_3009 - 1;;
        array_3009 = new int[this.capacity_3009];
    }
    boolean isFull_3009(QueueArray_2511533009 queue_3009){
        return (queue_3009.size_3009 == queue_3009.capacity_3009);
    }
    boolean isEmpty_3009(QueueArray_2511533009 queue_3009){
        return (queue_3009.size_3009 == 0);
    }
    void enqueue_3009(int item_3009){
        if (isFull_3009(this))
            return;
        this.rear_3009=(this.rear_3009 + 1) % this.capacity_3009;
        this.array_3009[this.rear_3009] = item_3009;
        this.size_3009 = this.size_3009 + 1;
        System.out.println(item_3009 + " enqueue to queue");
    }
    
    int deque_3009(){
        if (isEmpty_3009(this))
            return Integer.MAX_VALUE;
        int item_3009 = this.array_3009[this.front_3009];
        this.front_3009 = this.front_3009  + 1 % this.capacity_3009;;
        this.size_3009 = this.size_3009 - 1;
        return item_3009;
    }
    int front_3009(){
        if (isEmpty_3009(this))
            return Integer.MIN_VALUE;
        return this.array_3009[this.front_3009];
    }
    int rear_3009(){
        if (isEmpty_3009(this))
            return Integer.MIN_VALUE;
        return this.array_3009[this.rear_3009];
    }
        //mencetak elemen antrian
    void display_3009(){
        int i_3009;
        if (front_3009 == rear_3009){
            System.out.printf("\nAntrianKosong\n");
            return;
        }
        //kunjungi dari belakang dan cetak
        for(i_3009 = front_3009; i_3009 < rear_3009; i_3009++){
            System.out.printf(" %d <-- ", array_3009[i_3009]);
        }
        return;
    }
}