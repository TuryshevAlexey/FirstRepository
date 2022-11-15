package shape.quadrilateral;

public class square extends quadrilateral{
    public square(int a){
        super();
    }

    @Override
    public void output() {
        System.out.println("This " + this.getClass().getSimpleName() + " has the next sides' length: " + a + ", " + a + ", " + a + ", " + a);
    }
}
