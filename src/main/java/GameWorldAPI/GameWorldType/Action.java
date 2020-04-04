package GameWorldAPI.GameWorldType;

/**
 * Interface defining the general functionality of an Action
 *
 * @author Alpha-team
 */
public interface Action {

    /**
     * Get the name of this Action
     * @return the name of the Action
     */
    String getName();

    /**
     * Execute this Action
     */
    void execute();
}
