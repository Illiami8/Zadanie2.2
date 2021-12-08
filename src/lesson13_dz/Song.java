package lesson13_dz;

public class Song {
    private String name;
    private String artist;


    Song(String name,String artist){
        this.artist=artist;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
//Создать класс Song (песня) в котором будут поля name, artist.
// Создать в нём только конструкторы со всеми параметрами, геттеры, сеттеры, метод toString.
// Создать класс Player (плейер), который содержит массив песен (Song[]), номер текущей песни и состояние,
// играет ли сейчас player. Создайте в нём методы конструктор без параметров, который устанавливает сначала номер
// песни при создании плейера в -1 и методы: play() (воспроизвести текущую песню), next() (перейти на песню вперёд),
// prev() (перейти на песню назад), stop() (выключить воспроизведение). В конструкторе по умолчанию
//Плейер должен работать так:
//Метод toString должен выводить строку “Плейер не играет”, если в нём нет песен, или его состояние выключено
// или “Плейер играет песню” и далее название песн.
//Если песен в нём нет, то методы next, prev, stop, play ничего не должны делать.
//Метод play должен переключать состояние плейера в воспроизведение.
//Метод stop должен переключать состояние плейреа в выключенное.
//Методы next и prev должны менять текущую песню на одну вперёд или назад.
//