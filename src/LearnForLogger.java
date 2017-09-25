import java.util.*;
import java.util.logging.Logger;
import java.io.*;
class LoggingException extends Exception{
//Exception的名字	
private static Logger logger =Logger.getLogger("LoggingException");
private int x =0;
//还没学到，先记住再说
public LoggingException(String msg) {
	super(msg);
	StringWriter trace =new StringWriter();
	printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
}
public int val() {
	return x;
}
public String getMessage() {
	return "Detail Message "+x+super.getMessage();
}
}
public class LearnForLogger {
public static void main(String[]args) {
	try {
	throw new LoggingException("Please debug quickly!" );
	}catch(LoggingException e){
     System.err.println("caught"+e);	
	}
}
}
