import java.util.*;
class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data =data;
        prev=next = null;
    }
    
    
}
class doublyLinkedList{
    Node head = null;
    Node tail = null;
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            
        }
    }
    void display(){
        Node temp = tail;
       while(temp != null){
       System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }
}
public class doublylinklist{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        doublyLinkedList list = new doublyLinkedList();
        while(true){
            int val = sc.nextInt();
            if(val==-1)
            break ;
            list.insert(val); 
            
        }
        list.display();
    }
}
