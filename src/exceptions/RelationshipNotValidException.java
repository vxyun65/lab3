package exceptions;

public final class RelationshipNotValidException extends Exception {
    @Override
    public String getMessage() {
        return "Некорректно созданные отношения.";
    }
}
