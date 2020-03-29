import java.awt.*;

public interface GameWorld {

    Result executeAction(Action action);

    boolean evaluatePredicate(Predicate predicate);

    Snapshot createSnapshot();

    void loadSnapshot(Snapshot snapshot);

    void paint(Graphics g);

}
