package classes;

import java.util.ArrayList;

public final class Castle extends Location {
    @Override
    public void acceptVisitors(ArrayList<Person> people, int amount) {
        for (int k = 0; k < amount; k++) {
            try {
                System.out.println(people.get(k).getName() + " приехал(а) во дворец.");
            }
            // Unchecked exception
            catch (IndexOutOfBoundsException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
