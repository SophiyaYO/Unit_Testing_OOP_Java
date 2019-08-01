import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;

public class DatabaseTests {

    private static final Integer[] INITIAL_ELEMENTS = new Integer[]{1, 2, 3};

    @Test(expected = OperationNotSupportedException.class)
    public void constructorShouldThrowExceptionWithLessThanOneElement() throws OperationNotSupportedException {
        Database database = new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void constructorShouldThrowExceptionWithMoreThanSixteenElement() throws OperationNotSupportedException {
        Database database = new Database();
    }

    @Test
    public void constructingInterfaceShouldIncreaseElementsCount() throws OperationNotSupportedException {
        Database database = new Database(1, 2, 3);
    }

}
