package chapter_2.composing_objects;

public class Human {
    private final Player player;
    private final Student student;

    public Human() {
        this.player = new Player();
        this.student = new Student();
    }

    public void playGames() {
        player.playGames();
    }

    public void readBooks() {
        student.readBooks();
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.playGames();
        human.readBooks();
    }
}
