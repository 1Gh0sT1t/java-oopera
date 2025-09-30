import java.util.ArrayList;

public class Ballet extends MusicalShow{
    String choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActor, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, listOfActor, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
