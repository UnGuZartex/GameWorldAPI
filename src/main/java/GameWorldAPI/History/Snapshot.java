package GameWorldAPI.History;

import java.time.LocalDateTime;

/**
 * Interface defining the general functionality of a Snapshot
 *
 * @author Alpha-team
 */
public interface Snapshot {
    /**
     * Get the name of the Snapshot
     * @return the name of this Snapshot
     */
    String getName();

    /**
     * Get the creation date of this Snapshot
     * @return the creation date of thie Snapshot as LocalDateTime
     */
    LocalDateTime getSnapshotDate();

    /**
     * Restore the originator of the Snapshot to the this state
     */
    void restore();
}
