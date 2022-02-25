package Lesson28_DZ;

public class Calc {
    public static void main(String[] args) {
        String aString = null;
        String operation = null;
        String bString = null;

        try {
            aString = args[0];
            operation = args[1];
            bString = args[2];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Должно быть три параметра");
            System.exit(1);
        }

        int a = Integer.parseInt(aString);
        int b = Integer.parseInt(bString);
        int answer = calc(a, operation, b);
        System.out.println(answer);

    }

    private static int calc(int a, String oper, int b) {
        int result = 0;
        switch (oper) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Действие не поддерживается");
                System.exit(1);
        }
        return result;
    }
}
//Написать калькулятор, поддерживающий действия +, -, *, /
// над целыми числами, который считывает арифметический пример из файла.
// Пусть файл называется calc.txt. В нём находится одна строка такого вида:
//12 + 6
//Т.е., первый операнд (12), операция (+) и второй операнд (6) разделены между собой пробелами.
//	Прочитать информацию из файла в строку. Не забываем про try-catch-finally. Напоминаю, что
//переменную BufferedReader нужно будет создать за выше try,
//внутри блока try прочитать выполнять действие по чтению файла из reader
//в блоке catch отловить IOException и вывести на экран сообщение
// “Не удалось произвести чтение из файла “
// и далее название файла
//в блоке finally закрыть reader.
//	Разбить строку на три элемента: 12, + и 6 (вспоминайте, какой там метод используется).
//Вычислить результат (для выбора использовать оператор switch). Рекомендую switch  не копировать,
// а набрать ручками
//Результат вывести на экран