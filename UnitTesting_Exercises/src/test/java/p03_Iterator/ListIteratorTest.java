package p03_Iterator;

import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {

    @Test(expected = OperationNotSupportedException.class)
    public void creatingListIteratorShouldThrowExceptionIfNullIsPassedToTheConstructor() throws OperationNotSupportedException {
       ListIterator listIterator =  new ListIterator(null );
    }
}
