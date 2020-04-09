package chapter_2.design_patterns.factory;

public class Samsung extends MobilePhone {
    public Samsung(int quantity) {
        super(quantity);
    }

    public void consumed() {
        System.out.println("Deliver : " + getQuantity());
    }
}
