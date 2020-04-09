package chapter_2.design_patterns.factory;

public class MobilePhoneFactory {
    public static MobilePhone getQuantity(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Monday":
                return new Samsung(100);
            case "Tuesday":
                return new Nokia(50);
            case "Wednesday":
                return new Nokia(15);
            case "Thursday":
                return new Samsung(20);
            case "Friday":
                return new Samsung(500);
        }
        throw new UnsupportedOperationException("Did not find the day of week");
    }

}
