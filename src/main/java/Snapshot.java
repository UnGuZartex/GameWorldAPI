import java.time.LocalDateTime;

public interface Snapshot {
    String getName();

    LocalDateTime getSnapshotDate();
}
