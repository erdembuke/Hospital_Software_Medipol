package strategy;

import factory.Person;
import java.util.List;

public interface ListingStrategy {
    void list(List<Person> people);
}
