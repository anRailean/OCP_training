package chapter_1.enums;

public enum Season {
    WINTER("Low") {
        public void printHours() {
            System.out.println("9am-3pm");
        }
    }, SPRING("Medium") {
        public void printHours() {
            System.out.println("9am-5pm");
        }
    }, SUMMER("High") {
        public void printHours() {
            System.out.println("9am-7pm");
        }
    }, FALL("Medium") {
        public void printHours() {
            System.out.println("9am-5pm");
        }
    };
    private String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

    public abstract void printHours();
}
