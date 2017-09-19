
public class TestforPublic {
private int i;
private int m;
public TestforPublic(int name) {
this.i =name;	
}
public static void main(String []args) {
	TestforPublic test1 =new TestforPublic(8);
	int k =test1.i;
	System.out.println(k);
}
}

