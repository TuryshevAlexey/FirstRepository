package shape.quadrilateral;

public class quadrilateral{
    int a;
    int b;
    int c;
    int d;
    public quadrilateral(int a, int b, int c, int d){
        setA(a);
        setB(b);
        setC(c);
        setD(d);
    }
    public quadrilateral(int a){
        this.a = a;
    }
    /*public quadrilateral(){
    }*/
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    public int getD(){
        return this.d;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c;
    }
    public void setD(int d){
        this.d = d;
    }
    public void output(){
        System.out.println("This " + this.getClass().getSimpleName() + " has the next sides' length: " + this.getA() + ", " + this.getB() + ", " + this.getC() + ", " + this.getD());
    }
}
