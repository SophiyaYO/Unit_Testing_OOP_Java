package p03_Iterator;

import org.junit.Before;
import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {

    private static final String[] VALUES = {
            "A",
            "B",
            "C",
            "D",
            "E"
    };

    private ListIterator list;

    @Before
    public void createList() throws OperationNotSupportedException {
        this.list = new ListIterator();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void creatingListIteratorShouldThrowExceptionIfNullIsPassedToTheConstructor() throws OperationNotSupportedException {
       ListIterator listIterator =  new ListIterator(null );
    }

    @Test
    public void moveShouldReturnTrueIfAbleToMove() {

    }

}
