import java.util.ArrayList;

public class Opera extends  MusicalShow{
    int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActor, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActor, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
