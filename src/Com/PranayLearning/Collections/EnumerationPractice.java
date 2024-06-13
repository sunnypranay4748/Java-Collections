package Com.PranayLearning.Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {
    public static void main(String[] args){

        //Enumeration - is a legacy Interface used for iteration of legacy classes
        //Introduced for iterating the legacy collection objects
        //Legacy classes are those introduced before - v1.0
        //Legacy Classes: HashTable, stack, Vector, Dictionary and Properties
        //New Classes v1.2

        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");
        v.add("Mango");

        Enumeration<String> e = v.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
