
import java.util.*;
public class Adding_Groups {
public static void main(String[]args) {
	Collection<Integer>collection =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	Integer moreInt[] = {6,7,8,9,10};
	/**
	 * 以下为两种添加的实现方式 其中第二种的效率更高
	 */
     collection.addAll(Arrays.asList(moreInt));
     Collections.addAll(collection,moreInt ) ;
     Collections.addAll(collection, 11,12,13,14,15);
     List<Integer>list1 =Arrays.asList(moreInt);
     list1.set(1, 99);
     //moreInt默认是数组，而数组是默认不可扩展的，所以不可以采取此类操作
     //!list1.add(21);
     for(Integer i:list1) {
    	 System.out.println(i);
     }
     
}

}
