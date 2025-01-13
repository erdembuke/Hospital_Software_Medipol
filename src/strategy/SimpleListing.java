// strategy/SimpleListing.java
package strategy;

import factory.Person;
import java.util.List;

public class SimpleListing implements ListingStrategy {
    @Override
    public void list(List<Person> people) {
        for (Person person : people) {
            person.displayInfo();
        }
    }
}
