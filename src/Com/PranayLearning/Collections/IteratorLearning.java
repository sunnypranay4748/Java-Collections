package Com.PranayLearning.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class IteratorLearning {
    public static void main(String[] args){

        //Iterator -- Used for all collection classes, mean both legacy classes and new classes
        //Both Iterator and Enumerator are same used for iterating elements
        //In-real world we most advanced iterators like for-each loops, lambdaExpressions ect.

        ArrayList<Integer> al = new ArrayList<>();

        al.add(123);
        al.add(134);
        al.add(234);

        Iterator<Integer> i = al.iterator();

        //i.hasNext will return boolean if there is an next element in the collection
        //I.next will return the current element in collection during iteration
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
