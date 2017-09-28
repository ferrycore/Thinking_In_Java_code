import org.omg.PortableInterceptor.INACTIVE;

import java.util.Iterator;
import java.util.TreeMap;
public class SortedMapDemo {
  public static void main(String []args){
      TreeMap<Integer,String>treeMap =new TreeMap<>();

      treeMap.put(3,"Ferry");
      treeMap.put(4,"Core");
      treeMap.put(5,"Gushiyu");
      System.out.println(treeMap.keySet());
      Iterator<Integer>it =treeMap.keySet().iterator();
      for(int i=0;i<treeMap.size();i++){
          System.out.println(it.next());
      }
      System.out.println(treeMap.values());
      System.out.print(treeMap.get(3));
  }

}
