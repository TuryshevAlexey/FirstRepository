package shape.triangle;

public class isosceles extends triangle{
    public isosceles(int alpha){
        super(alpha);
    }

    @Override
    public void corners() {
        System.out.println("This " + this.getClass().getSimpleName() + " has the next corners: " + this.alpha + ", " + (180 - this.alpha) / 2 + ", " + (180 - this.alpha) / 2);
    }
}
