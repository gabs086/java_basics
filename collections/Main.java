import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    //Collections

    //ArrayList

    //ArrayList must have non-primitive Data
    //String, Integer, etc.
    ArrayList<String> names = new ArrayList<>();
    // List<String> students = new ArrayList<>();

    //Adding an element inside tha ArrayList object
    names.add("Ezreal");
    names.add("Yasuo");
    // To get the the element inside the arraylist 
    // System.out.println(names.get(0));

    // Get the size of the arraylist
    // System.out.println(names.size());

    //Clear all the elements inside the arraylist
    // names.clear();
    // System.out.println(names.size());

    //Remove one element in tha array list
    // names.remove("Ezreal");
    // System.out.println(names.get(0));

    //Check if the element exist in the ArrayList
    // System.out.println(names.contains("Yasuo"));

    //Check if Arraylist is empty or not
    // System.out.println(names.isEmpty());

    //Check the index of the element in the ArrayList
    // System.out.println(names.indexOf("Yasuo"));

    //Sort the elements inside the ArrayList
    // names.sort(c);

    // for(int i = 0; i < names.size(); i++){
    //       System.out.println(names.get(i));     
    // }

    //Maps
    Map<String, String> champions = new HashMap<>();
    champions.put("Ezreal", "Marksman Mage");
    champions.put("Yasuo", "Fighter Assasin");
    //put(key, value)
 
    // Access the elements inside the Map 
                                    //key
    System.out.println(champions.get("Ezreal"));

    //Get the size of the map
    System.out.println(champions.size());

    //Remove element inside map
                     //Pass the key in tha parameter to remove in the map
    // champions.remove("Yasuo");
    // System.out.println(champions.size());

    //Check if a key exist in the Map
    System.out.println(champions.containsKey("Karma"));
    //Check if a value exist in the Map
    System.out.println(champions.containsValue("Fighter Assasin"));
    
    //Clear all elements in the map
    
    
    }
}