package chapter_2.design_patterns.factory;

public abstract class MobilePhone {
    private int quantity;

    MobilePhone(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void consumed();
}
