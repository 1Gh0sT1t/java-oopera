import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Жанна", "Агузарова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Петр", "Петров", Gender.MALE, 193); //добавляем актёров

        Director director1 = new Director("Борис", "Березовский", Gender.MALE, 5);
        Director director2 = new Director("Лариса", "Орбокайте", Gender.FEMALE, 123); //доюавляем режисеров

        Show show = new Show("Щелкунчик", 180, director1, new ArrayList<>());
        Opera opera = new Opera("Заря", 140, director2, new ArrayList<>(), "Чайковский",
                "Сцена 1: Замок короля. Король и королева сидят на троне. Вбегает принцесса и говорит, что рыцарь отбил ее у разбойников.", 18);
        Ballet ballet = new Ballet("Лебединое озеро", 220, director2, new ArrayList<>(), "Спивковский",
                "Сцена 2: Тюрьма. Рыцарь сидит в камере. К нему приходит принцесса и предлагает ему бежать вместе. Они убегают.", "Катамаран"); // создаем спектакли
        ArrayList<Show> shows = new ArrayList<>(); //создем список шоу, и добавляем шоу в список
        shows.add(show);
        shows.add(ballet);
        shows.add(opera);

        show.addActor(actor1);
        show.addActor(actor3);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor2); //добавляем актёров в шоу
        System.out.println("--------"); //добавил визуальное разделение))) но кажется слишком топорно

        show.printActors();
        show.printDirector();
        System.out.println("--------");
        opera.printActors();
        opera.printDirector();
        System.out.println("--------");
        ballet.printActors();//печатаем список актёров по шоу
        ballet.printDirector();//добавил вывод директоров
        System.out.println("--------");

        show.replaceActor("Иванов", actor2);
        show.printActors(); //заменяем существующего актёра, и печатаем новый список
        System.out.println("--------");

        opera.replaceActor("Твардовский", actor2); //заменяем несуществующего актёра
        System.out.println("--------");

        opera.printLibretto();
        ballet.printLibretto(); //печатаем либрето
    }
}
