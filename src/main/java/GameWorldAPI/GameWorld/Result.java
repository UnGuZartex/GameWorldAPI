package GameWorldAPI.GameWorld;

/**
 * Enum defining the possible results of execution.
 *
 * @author Alpha-team
 */
public enum Result {
    /**
     * When an action could be executed with no problems.
     */
    SUCCESS,
    /**
     * When an action has been executed and reached an invalid state.
     */
    FAILURE,
    /**
     * When an action has been executed and reached a winning state.
     */
    END
}
