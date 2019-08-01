import org.junit.Assert;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Field;

public class DatabaseTests {

    private static final Integer[] INITIAL_ELEMENTS = new Integer[]{1, 2, 3};

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
        Database database = new Database(DatabaseTests.INITIAL_ELEMENTS);

        Field elementsCount = Database.class.getDeclaredField("elementsCount");
        elementsCount.setAccessible(true);

        //here we provide the obj that we wont to take the field from
        int fieldCurrentValue = elementsCount.getInt(database);

        Assert.assertEquals(DatabaseTests.INITIAL_ELEMENTS.length, fieldCurrentValue);
    }

}
