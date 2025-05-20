/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCIII
 */
public class Queue {

    int size, front, rear;
    int queue[];

    Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("queue is full .cannot enqueue" + item);
            return;
        }
        queue[++rear] = item;
        System.out.println(item + "enqueued");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty .cannot dequeue");
            return -1;
        }
        int removed = queue[front++];
        System.out.println(removed+"dequeueed");
        return removed;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("queue is empty.nothing to peek");
            return -1;
        }
    return queue [front];
    
}
    public boolean isEmpty(){
        return front>rear;
    }
    public boolean isFull(){
        return rear==size-1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("queue");
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]+"");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Queue q=new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.peek();
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
  
}
}
