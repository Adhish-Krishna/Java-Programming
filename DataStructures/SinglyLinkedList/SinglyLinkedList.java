package DataStructures.SinglyLinkedList;

public class SinglyLinkedList {

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

        while(current != null){

            System.out.print(current.data + " --> ");

            current = current.next;
        }

        System.out.print("null");
    }

    public void insertnodeatbeginning(int value){

        Listnode newnode = new Listnode(value);

        newnode.next = head;

        head = newnode;

    }

    public void insertnodeatend(int value){

        Listnode newnode = new Listnode(value);

        if(head == null){

            head = newnode;

            return;
        }

        Listnode current = head;

        while(current.next != null){

            current = current.next;
        }

        current.next = newnode;
    }

    public void insertnode(int value , int position){

        Listnode node = new Listnode(value);

        if(position == 1){

            node.next = head;

            head = node;

        }
        else{

            Listnode previous = head;

            int count = 1;

            while(count < position -1){

                previous = previous.next;

                count++;

            }

            Listnode current =previous.next;

            previous.next = node;

            node.next = current;

        }

    }

    public int findvalue(int position){

        Listnode current = head;

        int count = 1;

        while(count < position){

            current = current.next;

            count++;

        }

        return current.data;

    }

    public void deletefirstnode(){

        if(head == null){

            return;

        }

        Listnode temp = head;

        head = head.next;

        temp.next = null;

    }

    public void deletelastnode(){

        if(head == null || head.next == null){

            System.out.println("null");

            return;

        }

        Listnode current = head;

        Listnode previous  = null;

        while(current.next != null){

            previous = current;

            current = current.next;
        }

        previous.next = null;

    }

    public void deletenode(int position){

        if(head == null || head.next == null){

            System.out.println("null");

            return;

        }

        if(position == 1){

            head = head.next;

            return;

        }

        Listnode current = head;;

        Listnode nextnode = current.next;

        int count = 1;

        while(count < position - 1){

            current = current.next;

            nextnode = current.next;

            count++;

        }

        current.next = null;

        nextnode = nextnode.next;

        current.next = nextnode;

    }

    public static void main(String[] args) {
        
        SinglyLinkedList sll = new SinglyLinkedList();

        for(int i=1; i<=10; i++){

            sll.insertnode((2*i+1), i);

        }

        sll.display();

        System.out.print('\n');

        System.out.println(sll.findvalue(4));
        
    }
    
}
