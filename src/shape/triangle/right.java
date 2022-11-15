package shape.triangle;

public class right extends triangle{
    public right(int alpha){
        super(alpha);
    }

    @Override
    public void corners() {
        System.out.println("This " + this.getClass().getSimpleName() + " has the next corners: " + this.alpha + ", " + 90 + ", " + (90 - this.alpha));
    }
}
