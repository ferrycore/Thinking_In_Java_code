import java.util.*;
public class TestForIteration {
public static void main(String[]args) {
   Integer list1[] = {1,2,3,4,5};
   ArrayList<Integer>list2 =new ArrayList(Arrays.asList(list1));
   Iterator<Integer> it =list2.iterator();
   while(it.hasNext()) {
	   Integer i = it.next();
	   System.out.println(i);
   }
   
   }
}

