package p04_BubbleSort;

import org.junit.Assert;
import org.junit.Test;
import p04_BubbleSortTest.Bubble;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class BubbleSortTests {

    private int[] elements = {13, 42, 69, -1, -2, -34};

    private int[] sorted = Arrays.stream(elements)
            .sorted()
            .toArray();

    @Test
    public void sortShouldSortTheCollection() {
        Bubble.sort(elements);
        Assert.assertArrayEquals(sorted,elements);

    }


}
