package chapter_1.test1;

public class Test {
    public int employeeId;

    @Override
    public int hashCode() {
        return employeeId;
    }
    String s1 = "Canada"; String s2 = new String(s1);


    public static void main(String[] args) {
        Test test = new Test();
    }
}

