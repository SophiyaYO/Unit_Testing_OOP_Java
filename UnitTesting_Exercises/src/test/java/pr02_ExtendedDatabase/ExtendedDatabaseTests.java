package pr02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;
import p02_ExtendedDatabase.Database;
import p02_ExtendedDatabase.Person;

import javax.naming.OperationNotSupportedException;

public class ExtendedDatabaseTests {

    private static final String[] NAMES = {"A", "B", "C", "D", "E"};

    private Database db;

    @Before
    public void createDatabase() throws OperationNotSupportedException {
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            people[i] = new Person(i + 1, NAMES[i]);
        }

        this.db = new Database(people);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUsernameShouldThrowAnExceptionWhenCalledWithNull() throws OperationNotSupportedException {
        this.db.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUsernameShouldThrowAnExceptionWhitDuplicateUsernames() throws OperationNotSupportedException {
        this.db.add(new Person(12, "B"));
        this.db.findByUsername("B");
    }



}
