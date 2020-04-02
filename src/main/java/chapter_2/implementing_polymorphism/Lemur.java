package chapter_2.implementing_polymorphism;

public class Lemur extends Primate implements HasTail {
    public int age = 10;

    public boolean isTailStripped(){
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStripped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Lemur lemur1 = (Lemur) primate;
        System.out.println(lemur1.age);

    }
}
