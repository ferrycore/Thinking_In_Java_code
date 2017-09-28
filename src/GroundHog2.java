public class GroundHog2 extends Groudhog {
    public GroundHog2(int n) {
        super(n);
    }
    public int hashCode(){
        return number;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GroundHog2) && (number ==((GroundHog2)obj).number);


    }
}
