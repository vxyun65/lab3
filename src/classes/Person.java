package classes;

import enums.PersonMood;
import records.Relationship;
import exceptions.RelationshipNotValidException;

import java.util.Objects;

public class Person {
    protected String name;
    protected PersonMood mood;

    public Person(String name, PersonMood mood) {
        this.name = name;
        this.mood = mood;
    }

    public Person(String name) {
        this(name, PersonMood.CONTENT);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeMood(PersonMood mood) {
        setMood(mood);
        System.out.println("Настроение " + this.getName() + " сменилось на " + mood.toString() + ".");
    }

    public void setMood(PersonMood mood) {
        this.mood = mood;
    }

    public PersonMood getMood() {
        return mood;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name) &&
                mood == person.mood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mood);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name +
                "', mood=" + mood.toString() +
                '}';
    }
}
