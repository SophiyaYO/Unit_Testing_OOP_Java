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
}
