//java异常体系的缺陷
public class TestForException {
public static void main(String[]args) {
	try {throw new RuntimeException();}
	finally{
		return;
	}
}
}
