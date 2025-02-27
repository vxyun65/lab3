package classes;

import java.util.ArrayList;

public abstract class Location {
    public abstract void acceptVisitors(ArrayList<Person> people, int amount);
}
