import java.util.HashSet;
import java.util.Iterator;

public class harshset {
    public static void main(String args[]) {

        // creating

        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);

        if (set.contains(1)) {
            System.out.println("set contains");
        }

        if (!set.contains(6)) {
            System.out.println("Does not contains");
        }
        // delatee operation.java;

        set.remove(1);
        if(! set.contains(1)){
            System.out.println("does not contain 1- We deleted 1");
        }

        // size
        System.out.println("size of set is "+set.size());

        // printing all the elements in harshset;
        System.out.println(set);

        //  Now iterator;

        Iterator it = set.iterator(); // --> iterator ke pass 2 function hote h harshset me ;

        // 1.> hasNext; 
        // 2.> next;

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
