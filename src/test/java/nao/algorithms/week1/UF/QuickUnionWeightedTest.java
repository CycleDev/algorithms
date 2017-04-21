package nao.algorithms.week1.UF;

import nao.algorithms.common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class QuickUnionWeightedTest {

    @Test
    public void test() {
        System.out.println("QuickUnionWeighted.test");
        QuickUnionWeighted quickUnionWeighted = new QuickUnionWeighted(10);

        long start = System.currentTimeMillis();

        if(!quickUnionWeighted.connected(3, 5))
            quickUnionWeighted.union(3, 5);

        if(!quickUnionWeighted.connected(2, 1))
            quickUnionWeighted.union(2, 1);

        if(!quickUnionWeighted.connected(6, 5))
            quickUnionWeighted.union(6, 5);

        if(!quickUnionWeighted.connected(7, 9))
            quickUnionWeighted.union(7, 9);

        Assert.assertEquals(true, quickUnionWeighted.connected(3, 6));
        Assert.assertEquals(false, quickUnionWeighted.connected(5, 9));
        System.out.println(quickUnionWeighted);

        System.out.println("Duration (ms): " + ((System.currentTimeMillis() - start)));
        Utils.consoleNewLine();
    }
}
