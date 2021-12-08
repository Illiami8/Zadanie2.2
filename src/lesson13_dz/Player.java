package lesson13_dz;

public class Player {
    private Song[] list;
    private int number;
    private String status = "Не Воспроизводиться";

    public Player(Song[] list) {
        this.list = list;
        this.number = -1;
    }

    public void play() {
       status = "Воспроизводиться";
        if (number < 0) {
            number = 0;
        }
    }

    public void next() {
        this.number += 1;//number=number + 1;
    }

    public void prev() {
        this.number -= 1;
    }

    public void stop() {
       status = "Не Воспроизводиться";
    }

    public Song[] getList() {
        return list;
    }

    public void setList(Song[] list) {
        this.list = list;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void print() {
        if (status.equals("Не Воспроизводиться")) {
            System.out.println(" Плеер выключен");
        }
        else if (list.length == 0){
            System.out.println("Список пуст");
        }
        else {
            System.out.println("Воспроизводиться" + list[number] );
        }
    }
}
//Создать класс Player (плейер), который содержит массив песен (Song[]), номер текущей песни и состояние,
//// играет ли сейчас player. Создайте в нём методы конструктор без параметров, который устанавливает сначала номер
//// песни при создании плейера в -1 и методы: play() (воспроизвести текущую песню), next() (перейти на песню вперёд),
//// prev() (перейти на песню назад), stop() (выключить воспроизведение).