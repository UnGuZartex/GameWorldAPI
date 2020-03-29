import java.util.List;

public interface GameWorldType {

    List<Action> getAllActions();

    List<Predicate> getAllPredicates();

    GameWorld createNewGameworld();
}
