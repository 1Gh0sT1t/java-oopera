import java.util.Objects;

public class Actor extends Person{
    private final double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object otherAct) {
        if (this == otherAct) return true; // сравнение с самим собой
        if (otherAct == null || getClass() != otherAct.getClass()) return false;
        Actor otherActor = (Actor) otherAct;
        return Double.compare(height, otherActor.height) == 0 &&
                Objects.equals(getName(), otherActor.getName()) &&
                Objects.equals(getSurname(), otherActor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ". Рост: " + height;
    }
}
