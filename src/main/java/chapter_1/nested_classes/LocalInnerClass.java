package chapter_1.nested_classes;

public class LocalInnerClass {

    public interface saySomthAboutError{
        void saySomethingAboutError();
    }

    private int length = 5;

    public void calculate() {
        final int width = 20;

        class Inner implements saySomthAboutError{
            public void saySomethingAboutError(){
                System.out.println("Implements");
            }
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        LocalInnerClass outer = new LocalInnerClass();
        outer.calculate();
    }
}
