package GameWorldAPI.GameWorldType;

import GameWorldAPI.GameWorld.GameWorld;

/**
 * Interface defining the general functionality of a Predicate.
 *
 * @author Alpha-team
 */
public interface Predicate {

    /**
     * Get the name of this Predicate.
     *
     * @return the name of this Predicate.
     */
    String getName();

    /**
     * Evaluate the Predicate.
     *
     * @param gameWorld  The game world to base evaluation on.
     *
     * @return true if the Predicate is true, false otherwise.
     */
    boolean evaluate(GameWorld gameWorld);
}
