import java.awt.*;

public interface GameWorld {

    Result executeAction(Action action);

    boolean evaluatePredicate(Predicate predicate);

    Memento createSnapshot();

    void loadSnapshot(Memento memento);

    void paint(Graphics g);

}
