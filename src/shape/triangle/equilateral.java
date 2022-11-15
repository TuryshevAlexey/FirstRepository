package shape.triangle;

public class equilateral extends triangle{
    public equilateral(){
        super();
    }

    @Override
    public void corners() {
        System.out.println("This " + this.getClass().getSimpleName() + " has the next corners: " + this.alpha + ", " + this.alpha + ", " + this.alpha);
    }
}
