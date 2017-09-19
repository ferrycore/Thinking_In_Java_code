
public class TestForInnerClass2 {
public Destination destination(final String dest) {
	return new Destination() {
	private String label =dest;
	public String readLabel() {
		return label;
	}
	};
}


}
