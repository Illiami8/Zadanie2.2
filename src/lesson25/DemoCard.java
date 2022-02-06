package lesson25;

import java.util.ArrayList;
import java.util.List;

public class DemoCard {
    public static void main(String[] args) {
        List<Card> player1 = new ArrayList<>();
        player1.add(new Card("Бубна", "4"));
        player1.add(new Card("Пика", "8"));
        player1.add(new Card("Крести", "Дама"));
        List<Card> player2 = new ArrayList<>();
        player2.add(new Card("Крести", "Дама"));
        player2.add(new Card("Чирва", "7"));
        player2.add(new Card("Крести", "10"));
        player1.retainAll(player2);
        System.out.println(player1);
        List<Card> cards = new ArrayList<>(player1);
    }
}
