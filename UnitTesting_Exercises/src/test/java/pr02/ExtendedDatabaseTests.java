package pr02;

import org.junit.Before;
import p02_ExtendedDatabase.Database;
import p02_ExtendedDatabase.Person;

public class ExtendedDatabaseTests {

    private static final String[] NAMES = {"A", "B", "C", "D", "E"};

    private Database db;

    @Before
    public void createDatabase() {
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            people[i] = new Person(i + 1, NAMES[i]);
        }
    }
}
