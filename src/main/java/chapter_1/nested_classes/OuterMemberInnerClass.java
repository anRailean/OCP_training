package chapter_1.nested_classes;

public class OuterMemberInnerClass {
    private String greeting = "Hi";

    protected class Inner {
        public int repeat = 2;

        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        OuterMemberInnerClass outerMemberInnerClass = new OuterMemberInnerClass();
        outerMemberInnerClass.callInner();
        Inner inner = outerMemberInnerClass.new Inner();
        inner.go();
        OuterMemberInnerClass.Inner in = new OuterMemberInnerClass().new Inner();
    }
}
