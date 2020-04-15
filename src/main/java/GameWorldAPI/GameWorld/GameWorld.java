package GameWorldAPI.GameWorld;

import GameWorldAPI.GameWorldType.Action;
import GameWorldAPI.GameWorldType.Predicate;
import GameWorldAPI.History.Snapshot;
import Images.ImageLibrary;

import java.awt.*;

/**
 * Interface defining the general functionality of a GameWorld.
 *
 * @author Alpha-team
 */
public interface GameWorld {

    /**
     * Execute an Action.
     *
     * @param action The Action to be executed
     *
     * @return The result of the execution: SUCCESS if succeeded, FAILURE if failed,
     *         END if the win condition has been reached.
     */
    Result executeAction(Action action);

    /**
     * Evaluate a Predicate.
     *
     * @param predicate the Predicate to evaluate.
     *
     * @return The evaluation of the predicate.
     */
    boolean evaluatePredicate(Predicate predicate);

    /**
     * Create a Snapshot of this current GameWorld.
     *
     * @return A Snapshot consisting out of all important data in this GameWorld.
     */
    Snapshot createSnapshot();

    /**
     * Reload a Snapshot back in this GameWorld.
     *
     * @param snapshot The Snapshot to load in.
     */
    void loadSnapshot(Snapshot snapshot);

    /**
     * Paint the current GameWorld.
     *
     * @param g Graphics object used for painting.
     * @param library Library object used for images
     */
    void paint(Graphics g, ImageLibrary library);
}