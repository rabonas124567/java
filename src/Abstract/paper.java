package Abstract;

public abstract class paper {
    double p1;
    double p2;
    double p3;

    public paper(double p1, double p2, double p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

    }
    abstract double percentage();
}
class A extends paper{
    public A(double p1, double p2, double p3) {
        super(p1, p2, p3);
    }

    @Override
    double percentage() {
        return ((p1+ p2+ p3)/3);
    }

}
class B extends paper{
    public B(double p1, double p2, double p3) {
        super(p1, p2, p3);
    }

    @Override
    double percentage() {
        return ((p1+ p2+ p3)/3);
    }

}
