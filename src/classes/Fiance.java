package classes;

import exceptions.RelationshipNotValidException;
import records.Relationship;

import java.util.Objects;

public final class Fiance extends Person {
    private Relationship relationship;

    public Fiance(String name) {
        super(name);
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public void engage(Fiance partner) {
        try {
            Relationship relationship = new Relationship(this, partner);
            relationship.validate();

            this.relationship = relationship;
            partner.relationship = this.relationship;

            System.out.println(this.getName() + " сватается с " + partner.getName() + "!");
        }
        catch (RelationshipNotValidException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fiance fiance = (Fiance) obj;
        return Objects.equals(name, fiance.name) &&
                mood == fiance.mood &&
                Objects.equals(relationship, fiance.relationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mood, relationship);
    }

    @Override
    public String toString() {
        return "Fiance{" +
                "name='" + name +
                "', mood=" + mood.toString() +
                ", relationship=" + (relationship != null ? relationship.toString() : "null") +
                '}';
    }

}
