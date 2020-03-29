package GameWorldAPI.GameWorldType;

/**
 * Interface defining the general functionality of a Action
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
