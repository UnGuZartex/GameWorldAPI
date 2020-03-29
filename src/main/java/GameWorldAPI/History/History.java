package GameWorldAPI.History;
/**
 * Interface defining the general functionality of a History object
 *
 * @author Alpha-team
 */
public interface History {

    /**
     * Add a Snapshot to the History
     * @param snapshot the Snapshot to add to the History
     */
    void add(Snapshot snapshot);

    /**
     * Undo one step in this History
     */
    void undo();

    /**
     * Redo one step in this History
     */
    void redo();

    /**
     * Reset the whole History to the beginning
     */
    void reset();
}
