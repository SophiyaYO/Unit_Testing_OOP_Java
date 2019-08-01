import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Field;

public class DatabaseTests {

    private static final Integer[] INITIAL_ELEMENTS = new Integer[]{1, 2, 3};

    private Database database;

    @Before
    public void initElements() throws OperationNotSupportedException {
        this.database = new Database(DatabaseTests.INITIAL_ELEMENTS);

    }


    @Test(expected = OperationNotSupportedException.class)
    public void constructorShouldThrowExceptionWithLessThanOneElement()
            throws OperationNotSupportedException {
        Database database = new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void constructorShouldThrowExceptionWithMoreThanSixteenElement()
            throws OperationNotSupportedException {
        Database database = new Database();
    }

    @Test
    public void constructingDatabaseShouldIncreaseElementsCount()
            throws OperationNotSupportedException, NoSuchFieldException, IllegalAccessException {

        Field elementsCount = Database.class.getDeclaredField("elementsCount");
        elementsCount.setAccessible(true);

        //here we provide the obj that we want to take the field from
        int fieldCurrentValue = elementsCount.getInt(database);

        Assert.assertEquals(DatabaseTests.INITIAL_ELEMENTS.length, fieldCurrentValue);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addingNullElementShouldThrowException() throws OperationNotSupportedException {

        database.add(null);

    }
}
