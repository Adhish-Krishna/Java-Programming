public class DLL{

  public Node head;

  public static Node InsertNode(Node head , int data){
    Node newnode = new Node(data);
    if(head==null){
      head = newnode;
      return head;
    }else{
      Node curr = head;
      while(curr.next!=null){
        curr = curr.next;
      }
      curr.next = newnode;
      newnode.prev = curr;
    }
    return head;
  }

  public static void PrintList(Node head){
    Node curr = head;
    while(curr!=null){
      System.out.print(curr.data+" ");
      curr = curr.next;
    }
  }

  public static void main(String[] args) {
    Node head = null;
    head = InsertNode(head, 1);
    head = InsertNode(head, 2);
    head = InsertNode(head, 3);
    head = InsertNode(head, 4);
    head = InsertNode(head, 5);
    head = InsertNode(head, 6);
    PrintList(head);
  }
}

class Node{
  public int data;
  public Node prev;
  public Node next;

  public Node(int data){
    this.data = data;
    this.prev = null;
    this.next = null;
  }
}