package p05_CustomLinkedListTests;

import org.junit.Assert;
import org.junit.Test;
import p05_CustomLinkedList.CustomLinkedList;

public class CustomLinkedListTests {

    @Test
    public void addingToLinkedListShouldWork() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        list.add(13);

        Assert.assertTrue(list.contains(13));
    }

    @Test
    public void removingToLinkedListShouldWork() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        list.add(13);
        list.remove(13);

        Assert.assertFalse(list.contains(13));
    }

    @Test
    public void indexOfShouldReturnOnlyFirstOccurrenceOfAValue() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(13);
        list.add(42);
        list.add(69);
        list.add(13);

        Assert.assertEquals(list.indexOf(13), 0);

    }

}
