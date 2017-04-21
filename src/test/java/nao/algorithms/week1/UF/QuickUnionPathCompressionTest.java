package nao.algorithms.week1.UF;

import nao.algorithms.common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class QuickUnionPathCompressionTest {

    @Test
    public void test() {
        System.out.println("QuickUnionPathCompression.test");
        QuickUnionPathCompression quickUnionPathCompression = new QuickUnionPathCompression(10);

        long start = System.currentTimeMillis();

        if(!quickUnionPathCompression.connected(3, 5))
            quickUnionPathCompression.union(3, 5);

        if(!quickUnionPathCompression.connected(2, 1))
            quickUnionPathCompression.union(2, 1);

        if(!quickUnionPathCompression.connected(6, 5))
            quickUnionPathCompression.union(6, 5);

        if(!quickUnionPathCompression.connected(7, 9))
            quickUnionPathCompression.union(7, 9);

        Assert.assertEquals(true, quickUnionPathCompression.connected(3, 6));
        Assert.assertEquals(false, quickUnionPathCompression.connected(5, 9));
        System.out.println(quickUnionPathCompression);

        System.out.println("Duration (ms): " + ((System.currentTimeMillis() - start)));
        Utils.consoleNewLine();
    }
}
