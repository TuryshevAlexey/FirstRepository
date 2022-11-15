package shape.triangle;

public class triangle {
    int alpha;
    int betta;
    int gamma;

    public triangle(int alpha, int betta, int gamma){
        this.alpha = alpha;
        this.betta = betta;
        this.gamma = gamma;
    }
    public triangle(int alpha){
        this.alpha = alpha;
    }
    public triangle(){
        this.alpha = 60;
    }
    public void corners(){
        System.out.println("This " + this.getClass().getSimpleName() + " has the next corners: " + this.alpha + ", " + this.betta + ", " + this.gamma);
    }
}
