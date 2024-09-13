package DataStructures.SinglyLinkedList;

public class SLL {

    private Listnode head;

    private class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data = data;
            this.next = null;
        }

    }

    public void display(){
        Listnode current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
            
        }
        System.out.print("null");

    }

    public void InsertnodeatBeginning(int value){
        Listnode newnode = new Listnode(value);
        newnode.next = head;
        head = newnode;
    }

    public void InsertnodeatEnd(int value){
        Listnode node = new Listnode(value);
        if(head == null){
            head = node;
            return;
        }
        Listnode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public void InsernodeatPosition(int value , int position){
        Listnode node = new Listnode(value);
        if(position == 1){
            node.next = head;
            head = node;
            return;
        }
        else{
            int count = 1;
            Listnode previous = head;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            Listnode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void Deletenode(int position){
        Listnode previous = head;
        if(position == 1){
            previous = head.next;
            head.next = null;
            head = previous;
            return;
        }
        else{
            int count =1;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            Listnode current = previous.next;
            Listnode nextnode = current.next;
            current.next = null;
            previous.next = nextnode;
        }
    }

    public int FindElementatPosition(int position){
        Listnode current = head;
        int count =1;
        int element =' ';
        while(count < position){
            current = current.next;
            count++;
        }
        element = current.data;
        return element;
    }

    public int FindElement(int value){
        Listnode current = head;
        int count=1;
        while(current.next!=null){
            if(current.data == value){
                break;
            }
            count++;
            current = current.next;
        }
        return count;
    }

    public int FindLength(){
        Listnode current = head;
        int count = 1;
        while(current.next != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public void ReplaceElement(int val1 , int val2){
        Listnode current = head;
        while(current != null){
            if(current.data == val1){
                current.data = val2;
            }
            current = current.next;
        }
    }

    public void Reverse(){
        Listnode current = head;
        Listnode nextnode = null;
        Listnode previous = null;
        while(current!=null){
            nextnode = current.next;
            current.next = previous;
            previous = current;
            current = nextnode;
        }
        head = previous;
    }

    public Listnode FindNthnodefromEnd(int n){
        Listnode current = head;
        Listnode refnode = head;
        int count = 1;
        while(count<n){
            refnode = refnode.next;
            count++;
        }
        while(refnode.next!=null){
            refnode = refnode.next;
            current = current.next;
        }
        return current;
    }
    public void RemoveDuplicates(){
        Listnode current = head;
        Listnode nextnode = current.next;
        while(nextnode!=null){
            if(current.data == nextnode.data){
                if(nextnode.next !=null){
                    Listnode ref = nextnode.next; 
                    nextnode.next = null;
                    current.next = ref;
                    nextnode = ref;
                }
                else{
                    current.next = null;
                }
            }
            nextnode = nextnode.next;
            current = current.next;
        }
    }

    public void InsertNodeinSortedList(int value){
        
    }

    public static void main(String[] args) {
        SLL node = new SLL();
        node.InsertnodeatEnd(1);
        node.InsertnodeatEnd(1);
        node.InsertnodeatEnd(2);
        node.InsertnodeatEnd(3);
        node.InsertnodeatEnd(3);
        node.InsertnodeatEnd(4);
        node.InsertnodeatEnd(4);
        node.display();
        System.out.print('\n');
        node.RemoveDuplicates();

    }
}


