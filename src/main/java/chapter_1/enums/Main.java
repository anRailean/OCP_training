package chapter_1.enums;

public class Main {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);

        for (Season season : Season.values()){
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season.SUMMER.printExpectedVisitors();

        Season.WINTER.printHours();
    }
}
