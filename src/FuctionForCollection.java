import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FuctionForCollection {
public static void main(String []args) {
	Collection<String>c1 =new ArrayList<String>();
	c1.add("google");
	c1.add("baidu");
	c1.add(null);
	c1.add(null);
    c1.remove(null);
    c1.clear();
	
	String []c2=new String[c1.size()];
	c1.toArray(c2);
	System.out.println(Arrays.toString(c2));
    
}

}
