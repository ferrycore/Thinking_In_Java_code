import java.util.*;
public class TestForForEach {
public static void main(String[]args) {
Collection<String>cs =new ArrayList<String>();
Collections.addAll(cs, "take the long way home".split(" "));
for(String s:cs)
	System.out.println(s);

	
}
}
