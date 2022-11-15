package shape.quadrilateral;

public class quadrilateral{
    int a;
    int b;
    int c;
    int d;
    public quadrilateral(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public quadrilateral(int a){
        this.a = a;
    }
    public quadrilateral(){
    }
    public void output(){
        System.out.println("This " + this.getClass().getSimpleName() + " has the next sides' length: " + a + ", " + b + ", " + c + ", " + d);
    }
}
