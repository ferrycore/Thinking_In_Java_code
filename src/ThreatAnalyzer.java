import java.util.Scanner;
import java.util.regex.MatchResult;

public class ThreatAnalyzer {
static String threatData ="53.43.32.434@09/25/2017\n"+
		"53.43.32.434@09/25/2017\n"+
		"53.43.32.434@09/25/2017\n"+
		"53.43.32.434@09/25/2017\n"+
		"53.43.32.434@09/25/2017\n";
public static void main(String []args) {
	Scanner scanner =new Scanner(threatData);
	String pattern ="(\\d+[.]\\d+[.]\\d+[.]\\d+)@"+"(\\d{2}/\\d{2}/\\{4})";
	while(scanner.hasNext(pattern)) {
		scanner.next(pattern);
		MatchResult  match =scanner.match();
		String ip =match.group(1);
		String data =match.group(2);
		System.out.format("Threat on %s from %s\n",data,ip);
	}
}
}
