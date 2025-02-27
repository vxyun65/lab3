package records;

import classes.Fiance;
import java.util.Objects;
import exceptions.RelationshipNotValidException;


public record Relationship(Fiance firstPartner, Fiance secondPartner) {
    public Fiance firstPartner() {
        return firstPartner;
    }

    public Fiance secondPartner() {
        return secondPartner;
    }

    public Relationship(Fiance firstPartner, Fiance secondPartner) {
        this.firstPartner = firstPartner;
        this.secondPartner = secondPartner;
    }

    public void validate() throws RelationshipNotValidException {
        if (firstPartner == null || secondPartner == null || firstPartner.equals(secondPartner)) {
            throw new RelationshipNotValidException();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type
        Relationship relationship = (Relationship) obj; // Cast to Relationship
        return Objects.equals(firstPartner, relationship.firstPartner) &&
                Objects.equals(secondPartner, relationship.secondPartner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPartner, secondPartner);
    }

    @Override
    public String toString() {
        return "Relationship{"
                + "firstPartner='" + firstPartner.getName()
                + "', secondPartner='" + secondPartner.getName()
                + "'}";
    }
}