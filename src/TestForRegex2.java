import java.util.regex.*;
public class TestForRegex2 {
public static void main(String []args) {
Matcher matcher =Pattern.compile("\\w+").matcher("I have a low iq classmate ");
while(matcher.find()) {
	//group的重载方法中的int是用来选定从哪一个开始匹配
	System.out.println(matcher.group(1));
}
}
}
