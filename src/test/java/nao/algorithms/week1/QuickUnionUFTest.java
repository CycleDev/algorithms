package nao.algorithms.week1;

import nao.algorithms.Utils;
import org.junit.Assert;
import org.junit.Test;

public class QuickUnionUFTest {

    @Test
    public void test() {
        System.out.println("QuickUnionUFTest.test");
        QuickUnionUF quickUnionUF = new QuickUnionUF(10);

        long start = System.currentTimeMillis();

        if(!quickUnionUF.connected(3, 5))
            quickUnionUF.union(3, 5);

        if(!quickUnionUF.connected(2, 1))
            quickUnionUF.union(2, 1);

        if(!quickUnionUF.connected(6, 5))
            quickUnionUF.union(6, 5);

        if(!quickUnionUF.connected(7, 9))
            quickUnionUF.union(7, 9);

        Assert.assertEquals(true, quickUnionUF.connected(3, 6));
        Assert.assertEquals(false, quickUnionUF.connected(5, 9));
        System.out.println(quickUnionUF);

        System.out.println("Duration (ms): " + ((System.currentTimeMillis() - start)));
        Utils.consoleNewLine();
    }
}
