package nao.algorithms.week1.UF;

import nao.algorithms.common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class QuickUnionTest {

    @Test
    public void test() {
        System.out.println("QuickUnionTest.test");
        QuickUnion quickUnion = new QuickUnion(10);

        long start = System.currentTimeMillis();

        if(!quickUnion.connected(3, 5))
            quickUnion.union(3, 5);

        if(!quickUnion.connected(2, 1))
            quickUnion.union(2, 1);

        if(!quickUnion.connected(6, 5))
            quickUnion.union(6, 5);

        if(!quickUnion.connected(7, 9))
            quickUnion.union(7, 9);

        Assert.assertEquals(true, quickUnion.connected(3, 6));
        Assert.assertEquals(false, quickUnion.connected(5, 9));
        System.out.println(quickUnion);

        System.out.println("Duration (ms): " + ((System.currentTimeMillis() - start)));
        Utils.consoleNewLine();
    }
}
