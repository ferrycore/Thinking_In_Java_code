import java.util.*;
public class TestForShuffle {
public static void main(String []args) {
Random random = new Random(23);
Integer[] ia = {1,2,3,4,5,6,7,8,9};
Integer[] ib = {1,2,3,4,5,6,7,8,9};
//List<Integer>list2 =new ArrayList<Integer>();
//Collections.addAll(list2, ia);
List<Integer>list2 =new ArrayList<Integer>(Arrays.asList(ia));
List<Integer>list3 =Arrays.asList(ib);
Collections.shuffle(list2,random);
Collections.shuffle(list3,random);

System.out.println(Arrays.toString(ia));
System.out.println(Arrays.toString(ib));

}
}
