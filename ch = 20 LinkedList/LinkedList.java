import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // 01 ADD FIRST;

    public static void addFirst(int data) {

        // step 1> create a new node

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        // step--2 NewNode next = head;
        newNode.next = head;

        // step--3> head = newNode
        head = newNode;

    }
    
    //02    ADD LAST;


    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == tail) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }

        Node temp = head; 
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 03 = program for add element in the middle in the linked list ;
   
    public void addMiddle(int idx, int data){
        if(idx== 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        size++;
        int i =0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp-->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // 04  program for remove element from linked LIst--> Remove First;

    public int removeFirst(){

    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }

    else if(size ==1){
        int val = head.data;
        head = tail = null;
        return val;
    }

    int val = head.data;
    head = head.next;
    return val;

   }

   public int removelast(){

    if(size==0){
        head = tail = null;
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;

    }

    if(size ==1){
        int val = head.data;
        head = tail= null;
        size = 0;
        return val;
    }

    Node prev = head;
    for(int i =0; i<size-2; i++){
        prev = prev.next;
    }

    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;

   }

   
  // 05 program for reverse a linked list from ;

  public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next ;

    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    head = prev;

  }

  // 06 Search for a key in a linked list in java ;

  public int itrsearch(int key){
    Node temp = head;
    int i =0;

    while(temp!= null ){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }
   

    return -1;
    
  }
   
//    program for zigZag code 
/* 
public void zigZag(){
    // find mid 
    Node slow = head;
    Node fast = head.next;
    while(fast!=null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node curr = mid.next;


    // reverse 2nd half

    Node curr = mid.next;
    mid.next = null;
    Node prev = null ;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr= next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;


    // Alt merge --> zig-Zag merge
    while(left!=null && right!=null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
    }
}

*/

    public static void main(String arg[]) {
        LinkedList ll = new LinkedList();
        
      ll.addFirst(2);
      ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2,3);

      System.out.println(ll.itrsearch(5));
        

        ll.print();
        System.out.println("The size of linked list "+ ll.size);
      
        
       
    }
}