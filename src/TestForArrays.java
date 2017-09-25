import java.util.Arrays;
import java.util.*;
public class TestForArrays {
public static void main(String []args) {
	//数组中的length是强调能够容纳的个数 
    int []a =new int[10];
    int []b = {1,2,3,};
    System.out.println(a.length);
    System.out.println(a[0]);
    Integer m[][];
    m =new Integer[3][];
    for(int i =0;i<m.length;i++) {
    	m[i]=new Integer[3];
    	for(int j =0;j<m[0].length;j++) {	
    	}
    	
    }
    int list1[] = {1,2,3,4,5};
    int list2[]=new int[5];
    System.arraycopy(list1,0,list2,0,list1.length);
    System.out.println(Arrays.toString(list2));
   
}
}
