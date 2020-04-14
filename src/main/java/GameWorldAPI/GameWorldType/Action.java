package GameWorldAPI.GameWorldType;

import GameWorldAPI.GameWorld.GameWorld;

/**
 * Interface defining the general functionality of an Action.
 *
 * @author Alpha-team
 */
public interface Action {

    /**
     * Get the name of this Action.
     *
     * @return the name of the Action.
     */
    String getName();

    /**
     * Execute this Action.
     *
     * @param gameWorld The game world to execute on.
     */
    void execute(GameWorld gameWorld);
}
