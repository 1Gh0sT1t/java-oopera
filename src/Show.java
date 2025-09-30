import java.sql.SQLOutput;
import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("В спектакле \"" + title + "\" нет актёров.");
        } else {
            System.out.println("Актёры спектакля \"" + title + "\":");
            for (Actor actor : listOfActors) {
                System.out.println(actor.toString());
            }
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в спектакль " + title + ".");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i=0; i<listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + currentActor + " заменён на " + newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден.");
    }
}
