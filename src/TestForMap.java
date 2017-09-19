import java.util.*;
public class TestForMap {
public static void main(String[]args) {
	Random rand =new Random(47);
	Map<Integer,Integer>m =new HashMap<Integer,Integer>();
	for(int i =0;i<10000;i++) {
		int randomint =rand.nextInt(20); 
		Integer bigint =m.get(randomint);
		m.put(randomint, bigint ==null ?1:bigint+1);
	}
	System.out.println(m);
}
}
