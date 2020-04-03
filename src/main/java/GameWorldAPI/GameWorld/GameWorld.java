package GameWorldAPI.GameWorld;

import GameWorldAPI.GameWorldType.Action;
import GameWorldAPI.GameWorldType.Predicate;
import GameWorldAPI.History.Snapshot;

import java.awt.*;

/**
 * Interface defining the general functionality of a GameWorld
 *
 * @author Alpha-team
 */
public interface GameWorld {

    /**
     * Execute an Action
     * @param action the Action to be executed
     * @return the result of the execution, SUCCES if succeeded, FAILURE if failed, END if wincondition has been reached
     */
    Result executeAction(Action action);

    /**
     * Evaluate a Predicate
     * @param predicate the Predicate to evaluate
     * @return true if the Predicate is true, false otherwise
     */
    boolean evaluatePredicate(Predicate predicate);

    /**
     * Create a Snapshot of this current GameWorld.
     * @return a Snapshot consisting out of all important data in this GameWorld
     */
    Snapshot createSnapshot();

    /**
     * Reload a Snapshot back in this GameWorld
     * @param snapshot the Snapshot to load in
     */
    void loadSnapshot(Snapshot snapshot);

    /**
     * Undo a change on the GameWorld
     */
    void undo();

    /**
     * Redo a change on the GameWorld
     */
    void redo();

    /**
     * Reset the GameWorld
     */
    void reset();

    /**
     * Paint the current Gameworld
     * @param g graphics object used for painting
     */
    void paint(Graphics g);

}
