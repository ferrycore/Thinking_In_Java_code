import java.util.Formatter;

public class TestForFormat {
	
public static void main(String []args) {
	Formatter ff =new Formatter(System.out);
	//左对齐
	ff.format("%10s\n", "hello");
	
	ff.format("%10s\n", "ilovechin");
	
		ff.format("%-10s\n", "hello");
		
		ff.format("%-10s\n", "ilovechin");
		//右对齐
    System.out.print(String.format("%10s\n", "hello"));	
    System.out.print(String.format("%10s\n", "ilovechin"));
	
}
}
