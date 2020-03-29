public interface History {

    void add(Snapshot snapshot);

    void undo();

    void redo();

    void reset();
}
