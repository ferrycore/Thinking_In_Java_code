import java.util.regex.*;
public class TestForRegex {
public static void main(String[]args) {
	if(args.length<2) {
		System.out.println("Thisiswrong!");
		System.exit(0);
	}else {
	System.out.println("this is the matched line"+args[0]);	
	 for(String arg:args) {
	  System.out.println(arg);
	  Pattern pattern =Pattern.compile(arg);
	  Matcher matcher =pattern.matcher(args[0]);
	  while(matcher.find()) {
		  System.out.println("Match "+matcher.group()+"at position"+matcher.start()+"-"+matcher.end());
	  }
	 }
	}
}

}
