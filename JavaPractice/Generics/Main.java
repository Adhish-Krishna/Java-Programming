//Problem: Create a generic class Graph that can represent a graph data structure with nodes and edges. Implement methods to add nodes, add edges, and perform a depth-first search (DFS) and breadth-first search (BFS). Write a test program to demonstrate the use of the Graph class with different data types for the nodes.

class ArrayList<Node>{
    private Node data;
    private ArrayList<Node> next;
    public ArrayList(Node data){
      this.data = data;
      this.next = null;
    }

    ArrayList<Node> Insert(ArrayList<Node> head , Node data){
      ArrayList<Node> newnode = new ArrayList<>(data);
      if(head == null){
        head = newnode;
      }
      else{
        newnode.next = head;
        head = newnode;
      }
      return head;

    }

    void Display(ArrayList<Node> head){
      ArrayList<Node> curr = head;
      while(curr!=null){
        System.out.print(curr.data+" ");
        curr = curr.next;
      }
    }
}

public class Main{
  public static void main(String[] args) {
    ArrayList<Integer> head = new ArrayList<>(0);
    head = head.Insert(head, 1);
    head = head.Insert(head, 2);
    head = head.Insert(head, 3);
    head = head.Insert(head, 4);
    head.Display(head);
  }
}