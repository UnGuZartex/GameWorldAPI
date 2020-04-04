package GameWorldAPI.GameWorldType;

import GameWorldAPI.GameWorld.GameWorld;

import java.io.File;
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
     * Loads a GameWorld from a file
     * @param file the file to load in
     * @return a GameWorld that corresponds to the information in the file
     */
    GameWorld loadFromFile(File file);

    /**
     * Create a new instance of this GameWorldType
     * @return a GameWorld
     */
    GameWorld createNewGameWorld();
}
