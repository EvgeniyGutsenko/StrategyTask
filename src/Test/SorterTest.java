package Test;

import Sorting.BubbleSort;
import Sorting.SelectionSort;
import Sorting.Sorter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SorterTest {

    int[] actualArray;
    int[] expectedArray;

    @Before
    public void setExamples() {
        actualArray = new int[]{9,8,7,6,5,4,3,2,1,0};
        expectedArray = new int[]{0,1,2,3,4,5,6,7,8,9};
    }

    @Test
    public void execute() {

        Sorter test = new Sorter();

        test.setContext(new SelectionSort());
        test.execute(actualArray);
        Assert.assertEquals(Arrays.toString(actualArray),Arrays.toString(expectedArray));

        test.setContext(new BubbleSort());
        test.execute(actualArray);
        Assert.assertEquals(Arrays.toString(actualArray),Arrays.toString(expectedArray));
    }
}