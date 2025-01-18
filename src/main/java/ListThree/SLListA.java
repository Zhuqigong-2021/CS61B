package ListThree;


import ListOne.IntList;
import ListTwo.IntNode;

/**
 * @author Phil
 * @version 1.0
 */

public class SLListA <LochNess>{
    private class StuffNode{
        public LochNess item;
        public StuffNode next;

        public StuffNode(LochNess i,StuffNode n){
            item=i;
            next =n;
        }
    }
    /*The first item （if it exists) is at sentinel.next.*/
    private StuffNode first;
    private int size;

    public SLListA(LochNess x){
        first = new StuffNode(x,null);
       size=1;
    }


    /** add x to the front of the list*/
    public void addFirst(LochNess x){
        size++;
        first = new StuffNode(x,first);
    }
    /** return the first item of the list*/
    public LochNess getFirst(){
        return first.item;
    }
    public  void addLast(LochNess x){
        StuffNode p = first;

        while(p.next!=null){
            p=p.next;
        }
        size++;
        p.next = new StuffNode(x,null);
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
        SLListA<String> s1 = new SLListA<String>("bone");
        s1.addFirst("thugs");


    }
}
