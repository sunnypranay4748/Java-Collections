package Com.PranayLearning.Collections;

/*
Set is a DataStructure, which only stores unique elements of Data,
which doesn't allow duplicate elements of Data.
 */

import java.util.Collections;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class SetLearning {

    public static void main(String[] args){
        //HashSet --> HashMap --> Array of nodes(Key, value)

        //Types of set: HashSet, LinkedHashSet, TreeSet
        //HashSet will not maintain the order we insert
        //LinkedHashSet will not maintain the order we insert
        /*
        TreeSet will store data based on sorted order since TreeSet class
        implements SortedSet Interface
         */

        Set<Integer> hs = new HashSet<>();
//        Set<Integer> hs = new LinkedHashSet<>();
        //Note: Refer TreeSet object to TreeSet Class itself to
        // not to face any issues for using all methods
//        TreeSet<Integer> hs = new TreeSet<>();

        hs.add(10);
        hs.add(2);
        hs.add(85);
        hs.add(65);
        hs.add(5);

        //Adding  duplicate value to if Set allows only unique value
        //This will not throw any error, It will skip that value
        hs.add(10);
        hs.add(5);

        //remove element, removing is based on data not an index.
        hs.remove(85);

        //verify the data in Set
        System.out.println(hs.contains(85));

        //elements are not stored based on indexes, so retrieval should be by iterating
        for(Integer i: hs){
            System.out.println(i);
        }

        //In TreeSet you can have a subSet that ranges between given values,
        // for example  I want elements range between 2 and 15
//        System.out.println(hs.subSet(2,15));
        // In Tree the Data will be stored in Ascending order if we want in decending order
//        hs.descendingSet();


        System.out.println(hs);

    }

}
