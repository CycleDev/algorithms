package nao.algorithms.week1.UF;

import nao.algorithms.common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class QuickFindTest {

    @Test
    public void test() {
        System.out.println("QuickFindTest.test");
        QuickFind quickFind = new QuickFind(10);

        long start = System.currentTimeMillis();

        if(!quickFind.connected(3, 5))
            quickFind.union(3, 5);

        if(!quickFind.connected(2, 1))
            quickFind.union(2, 1);

        if(!quickFind.connected(6, 5))
            quickFind.union(6, 5);

        if(!quickFind.connected(7, 9))
            quickFind.union(7, 9);

        Assert.assertEquals(true, quickFind.connected(3, 6));
        Assert.assertEquals(false, quickFind.connected(5, 9));
        System.out.println(quickFind);

        System.out.println("Duration (ms): " + ((System.currentTimeMillis() - start)));
        Utils.consoleNewLine();
    }
}
