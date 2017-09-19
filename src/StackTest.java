import java.util.*;
public class StackTest {
public static void main(String[]args) {
Stack<String>stack =new Stack<String>();
for(String s:"My dog's name is ferry".split(" ")) {
	stack.push(s);
}
while(!stack.isEmpty()) {
	//peak和pop对应分别为栈底和栈顶
	System.out.println(stack.pop()+" ");
}
}
}
