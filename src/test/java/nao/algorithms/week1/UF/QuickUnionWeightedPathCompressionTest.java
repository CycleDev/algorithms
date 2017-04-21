package nao.algorithms.week1.UF;

import nao.algorithms.common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class QuickUnionWeightedPathCompressionTest {

    @Test
    public void test() {
        System.out.println("QuickUnionWeightedPathCompression.test");
        QuickUnionWeightedPathCompression quickUnionWeightedPathCompression = new QuickUnionWeightedPathCompression(10);

        long start = System.currentTimeMillis();

        if(!quickUnionWeightedPathCompression.connected(3, 5))
            quickUnionWeightedPathCompression.union(3, 5);

        if(!quickUnionWeightedPathCompression.connected(2, 1))
            quickUnionWeightedPathCompression.union(2, 1);

        if(!quickUnionWeightedPathCompression.connected(6, 5))
            quickUnionWeightedPathCompression.union(6, 5);

        if(!quickUnionWeightedPathCompression.connected(7, 9))
            quickUnionWeightedPathCompression.union(7, 9);

        Assert.assertEquals(true, quickUnionWeightedPathCompression.connected(3, 6));
        Assert.assertEquals(false, quickUnionWeightedPathCompression.connected(5, 9));
        System.out.println(quickUnionWeightedPathCompression);

        System.out.println("Duration (ms): " + ((System.currentTimeMillis() - start)));
        Utils.consoleNewLine();
    }
}
