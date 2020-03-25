package chapter_1.nested_classes;

public class AnonymousInnerClass {

    Calculate plus = new Calculate() {
        public int calculate(int a, int b) {
            return a + b;
        }
    };

    Calculate minus = new Calculate() {
        public int calculate(int a, int b) {
            return a - b;
        }
    };

    public static void main(String[] args) {
        AnonymousInnerClass outer = new AnonymousInnerClass();
        outer.plus.calculate(5, 5);
        outer.minus.calculate(4, 4);    
    }
}
