import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        this.next = null;
    }
}
class LinkedList{
    Node head = null;
    Node tail = null;
    void insert(int data){
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    void display(){
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp != head);
        }

}
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while(true){
            int val = sc.nextInt();
            if(val==-1)
            break ;
            list.insert(val); 
            
        }
        list.display();
    }
}
