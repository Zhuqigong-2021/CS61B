package ListTwo;

import ListOne.IntList;

/**
 * @author Phil
 * @version 1.0
 */

public class SLList {

    /*The first item （if it exists) is at sentinel.next.*/
    public IntNode sentinel;
    private int size;
    public SLList(){
        sentinel = new IntNode(5,null);
        size=0;
    }
    public SLList(int x){
        sentinel = new IntNode(5,null);
        sentinel.next = new IntNode(x,null);
        size=1;
    }


    /** add x to the front of the list*/
    public void addFirst(int x){
        size++;
        sentinel.next = new IntNode(x,sentinel.next);
    }
    /** return the first item of the list*/
    public int getFirst(){
        return sentinel.next.item;
    }
   public  void addLast(int x){
       IntNode p = sentinel;

       while(p.next!=null){
           p=p.next;
       }
       size++;
        p.next = new IntNode(x,null);
   }

   /**Returns the size of the list that stats at IntNode p.*/
//   private static int size(IntNode p){
//       if(p.next==null){
//           return 1;
//       }
//       return 1+size(p.next);
//   }


    public int size(){
       return size;
    }
    public static void main(String[] args) {
        SLList L = new SLList();
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);

//        L.getFirst();
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
}
