public class Stack extends DataStructure {
    public Stack() {
        super("Stack");
    }

    @Override
    public String getCharacteristics() {
        return "LIFO (Last In First Out)";
    }

    @Override
    public String getOperations() {
        return "Push, Pop, Peek";
    }

    @Override
    public String performOperation() {
        return "Performing stack operation.";
    }
}
