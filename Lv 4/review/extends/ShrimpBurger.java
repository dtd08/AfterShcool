package review.extend;

public class ShrimpBurger extends HamBurger {

    public ShrimpBurger() {
        super("새우버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
