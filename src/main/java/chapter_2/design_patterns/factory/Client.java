package chapter_2.design_patterns.factory;

public class Client {
    public static void main(String[] args) {
        final MobilePhone mobilePhone = MobilePhoneFactory.getQuantity("Monday");
        mobilePhone.consumed();
    }
}
