package Com.PranayLearning.Collections;
/*
Map in Java is an interface available in java. util package, and it stores the data in key and value pairs.
It does not allow duplicate keys.
 */

import java.util.*;
import java.util.Map.Entry;

public class MapLearning {
    public static void main(String[] args){

        //Creation of a map you can.
        // You can create a Map reference object of type HashTable, HashMap, LinkedHasMap and TreeMap
        //All the methods are same like creation, addition retrieval etc.
        Map<Integer, String> m = new HashMap<Integer, String>();

        //Addition of elements into the map
        m.put(505185, "Hyderabad");
        m.put(604123, "Chennai");
        m.put(78634, "Austin");

        //Retrieval of keys from map. When retrieving all keys they must be stores in a set<DataType>
        Set<Integer> keys = m.keySet();
        for(Integer k:keys){
            System.out.println(k);
        }

        System.out.println();

        //Retrieval of values.  When retrieving all values they must be stores in a Collection<DataType>
        Collection<String> value = m.values();
        for( String v:value){
            System.out.println(v);
        }

        System.out.println();

        //Retrieval of value based on key
        System.out.println(m.get(78634));

        //Retrieval of all keys and values in for loop
        for( Integer k:keys){
            System.out.println(k + " : " + m.get(k));
        }

        //You can print the whole map object
        System.out.println(m);

        //Deletion of element from a map
        m.remove(78634);

        //TO verify element in map like a key or value
        System.out.println(m.containsKey(505185));
        System.out.println(m.containsValue("Austin"));

        //Updating of elements. Re-inserting a value will update the value
        m.put(505185, "Sulthanabad");

        //You want to add an element if it is not present
        m.putIfAbsent(101101, "Dallas");

        //You can also update the element using replace() methods
        m.replace(101101, "Deleware");

        //An Object in map is called entry, we can get all the entries in the map instead of
        // getting the all keys and the getting there values with m.getValue(Key)
        //all the entries must be referred to set
        Set<Map.Entry<Integer, String>> entire = m.entrySet();
        for(Map.Entry<Integer,String> e:entire){
            System.out.println(e.getKey() + ">>>>" + e.getValue());
        }


        System.out.println(m);

        //To remove all elements or empty the map
        m.clear();

    }

}