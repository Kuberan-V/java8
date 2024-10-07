package classandmethods;
class Queue{
    int s[]=new int[10];
    int front,end;
    Queue(){
        front=-1;
        end=-1;
    }
    void enqueue(int n){
        if(end==-1)
            front++;
        if(end==9)
            System.out.println("Queue is full");
        else
            s[++end]=n;
    }
    int dequeue(){
        if(front==-1) {
            System.out.println("queue is empty");
            return -1;
        }
        else
            return s[front++];
    }
}
public class Queuedemo {
    public static void main(String[] args) {
        Queue s1=new Queue();
        s1.enqueue(1);
        s1.enqueue(2);
        s1.enqueue(3);
        s1.enqueue(4);
        s1.enqueue(5);
        System.out.println(s1.dequeue());
        System.out.println(s1.dequeue());
    }
}
