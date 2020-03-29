package GameWorldAPI.GameWorldType;

import GameWorldAPI.GameWorld.GameWorld;

import java.util.List;

/**
 * Interface defining the general functionality of a GameWorldType
 *
 * @author Alpha-team
 */
public interface GameWorldType {

    /**
     * Retrieve all Actions supported by this GameWorldType
     * @return a List of Action objects.
     */
    List<Action> getAllActions();

    /**
     * Retrieve all Predicates supported by this GameWorldType
     * @return a List of Predicate objects.
     */
    List<Predicate> getAllPredicates();

    /**
     * Create a new instance of this GameWorldType
     * @return a GameWorld
     */
    GameWorld createNewGameworld();
}
