public class Queue{

  private class queue{
    private int rear;
    private int front;
    private int size;
    private int[] arr;

    public queue(int size){
      this.size = size;
      this.front = -1;
      this.rear = -1;
      this.arr = new int[size];
    }
  }

  queue CreateQueue(int size){
    queue nq = new queue(size);
    return nq;
  }

  boolean isEmpty(queue nq){
    if(nq.front == nq.rear){
      return true;
    }
    return false;
  }

  boolean isFull(queue nq){
    if(nq.rear == nq.size-1){
      return true;
    }
    return false;
  }

  void Enqueue(queue nq , int data){
    if(!isFull(nq)){
      nq.rear++;
      nq.arr[nq.rear] = data;
    }
  }

  void Dequeue(queue nq){
    if(!isEmpty(nq)){
      nq.front++;
    }
  }

  void PrintQueue(queue nq){
    if(!isEmpty(nq)){
      for(int i=nq.front; i<=nq.rear;i++){
        System.out.print(nq.arr[i]+" ");
      }
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue();
    queue nq = q.CreateQueue(5);
    q.Enqueue(nq, 1);
    nq.front = 0;
    q.Enqueue(nq, 2);
    q.Enqueue(nq, 3);
    q.Enqueue(nq, 4);
    q.Enqueue(nq, 5);
    q.PrintQueue(nq);
    q.Dequeue(nq);
    q.Dequeue(nq);
    System.out.print("\n");
    q.PrintQueue(nq);
  }
}