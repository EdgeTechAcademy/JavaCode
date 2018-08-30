package interfaces;

public interface Submersible {
	void dive();
    void surface();
    default void sink() { }
}
