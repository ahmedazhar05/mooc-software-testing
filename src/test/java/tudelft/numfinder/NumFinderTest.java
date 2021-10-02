package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumFinderTest {
    
    @Test
    public void functiontest1(){
        NumFinder nf1 = new NumFinder();
        nf1.find(new int[] {4, 25, 7, 9});
        Assertions.assertEquals(25, nf1.getLargest());
        Assertions.assertEquals(4, nf1.getSmallest());
    }

    @Test
    public void functiontest2(){
        NumFinder nf2 = new NumFinder();
        nf2.find(new int[] {4, 3, 2, 1});
        Assertions.assertEquals(4, nf2.getLargest());
        Assertions.assertEquals(1, nf2.getSmallest());
    }
}
