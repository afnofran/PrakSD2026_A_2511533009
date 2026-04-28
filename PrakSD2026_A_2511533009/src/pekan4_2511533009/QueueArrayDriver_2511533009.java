package pekan4_2511533009;

public class QueueArrayDriver_2511533009 {
    public static void main(String[] args){
        QueueArray_2511533009 queue_3009 = new QueueArray_2511533009(1000);
        queue_3009.enqueue_3009(10);
        queue_3009.enqueue_3009(20);
        queue_3009.enqueue_3009(30);
        queue_3009.enqueue_3009(40);
        System.out.println("Item di depan " + queue_3009.front_3009());
        System.out.println("item paling belakang " + queue_3009.rear_3009());
        System.out.println("tampilkan queue");
        queue_3009.display_3009();
        System.out.println();
        System.out.println(queue_3009.deque_3009() + " dihapus dari queue");
        System.out.println("item di depan; " + queue_3009.front_3009());
        System.out.println("item dibelakang:  " + queue_3009.rear_3009());
        System.out.println("tampilan queue setelah satu data dihapus");
        queue_3009.display_3009();
    }
}
