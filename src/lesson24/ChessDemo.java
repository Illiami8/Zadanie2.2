package lesson24;

import java.util.HashMap;
import java.util.Map;

public class ChessDemo {
    public static void main(String[] args) {
        Map<Field,Figure> board = new HashMap<>();
        board.put(new Field("a",1),new Figure("Ладья","Белая"));
        board.put(new Field("b",1),new Figure("Cлон","Белая"));
        board.put(new Field("а",2),new Figure("Пешка","Белая"));
        System.out.println(board.get(new Field("b",1)));
        board.put(new Field("b",1),new Figure("Ферзь","Черный"));
        System.out.println(board.get(new Field("b",1)));

        Field a1 = new Field("a", 1);
        board.remove(a1);
        System.out.println(board.containsKey(a1));

    }


}
