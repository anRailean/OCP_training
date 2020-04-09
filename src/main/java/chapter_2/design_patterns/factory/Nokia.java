package chapter_2.design_patterns.factory;

public class Nokia extends MobilePhone {
    public Nokia(int quantity) {
        super(quantity);
    }

    public void consumed() {
        System.out.println("Deliver : " + getQuantity());
    }
}
