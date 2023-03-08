import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap_iterate_elements {
    public static void main(String[] args) {

        TreeMap<Integer,String> ab=new TreeMap();

        ab.put(1,"all");
        ab.put(2,"is");
        ab.put(3,"well");

        Set set=ab.entrySet();
        Iterator iterator= ((Set<?>) set).iterator();

        //Print the TreeMap elements using iterator.
        System.out.println("TreeMap elements using iterator:");
        while(iterator.hasNext()){
            Map.Entry mapEntry=(Map.Entry)iterator.next();
            System.out.println("Key: " + mapEntry.getKey() + ", " +
                    "Value: " + mapEntry.getValue());
        }
    }
}
