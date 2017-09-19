import java.util.*;

public class TestForSet {
public static void main(String []args) {
	Random random =new Random(47);
    Set<String>set1 =new TreeSet<String>();
    Set<String>set2 =new TreeSet<String>();
    Collections.addAll(set1, "a b c e f".split(" "));
    Collections.addAll(set2, "a b g h j".split(" "));
    boolean iscontain =set1.containsAll(set2);
    if(iscontain) {
    	System.out.println("isok");
    }
    set1.removeAll(set2);
    System.out.println(set1);
    //如果想对结果排序，可以使用TreeSet
   
}
}
