public class LinkedList extends DataStructure {
    public LinkedList() {
        super("LinkedList");
    }

    @Override
    public String getCharacteristics() {
        return "Consists of nodes with data and pointers.";
    }

    @Override
    public String getOperations() {
        return "Insert, Delete, Traverse";
    }

    @Override
    public String performOperation() {
        return "Performing linked list operation.";
    }
}
