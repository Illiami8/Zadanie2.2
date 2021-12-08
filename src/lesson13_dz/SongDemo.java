package lesson13_dz;

public class SongDemo {
    public static void main(String[] args) {
        Song song1 = new Song("Серебро", "Би-2");
        Song song2 = new Song("Твои глаза", "Лобода");
        Player player1 = new Player(new Song[] {song1, song2});
        player1.print();
        player1.play();
        player1.print();
        player1.next();
        player1.print();
        player1.prev();
        player1.print();
        player1.stop();
        player1.print();
    }
}
