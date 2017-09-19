import java.util.*;
public class PrintContainer {
  static Collection fill(Collection<String>collection) {
	  collection.add("rat");
	  collection.add("cat");
	  return collection;
  }
  static Map fill(Map<String,String>map) {
	  map.put("cat", "Fuzzy");
	  map.put("cat", "Rags");
	  map.put("dog", "Bosco");
	  return map;
  }
  
  public static void main(String[]args) {
	  System.out.println(fill(new ArrayList<String>()));
	  System.out.println(fill(new HashMap<String,String>()));
  }
}
