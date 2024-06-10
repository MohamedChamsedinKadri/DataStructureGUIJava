public class Queue extends DataStructure {
    public Queue() {
        super("Queue");
    }

    @Override
    public String getCharacteristics() {
        return "FIFO (First In First Out)";
    }

    @Override
    public String getOperations() {
        return "Enqueue, Dequeue, Front";
    }

    @Override
    public String performOperation() {
        return "Performing queue operation.";
    }
}
