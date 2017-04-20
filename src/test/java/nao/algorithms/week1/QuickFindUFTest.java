package nao.algorithms.week1;

import nao.algorithms.Utils;
import org.junit.Assert;
import org.junit.Test;

public class QuickFindUFTest {

    @Test
    public void test() {
        System.out.println("QuickFindUFTest.test");
        QuickFindUF quickFindUF = new QuickFindUF(10);

        long start = System.currentTimeMillis();

        if(!quickFindUF.connected(3, 5))
            quickFindUF.union(3, 5);

        if(!quickFindUF.connected(2, 1))
            quickFindUF.union(2, 1);

        if(!quickFindUF.connected(6, 5))
            quickFindUF.union(6, 5);

        if(!quickFindUF.connected(7, 9))
            quickFindUF.union(7, 9);

        Assert.assertEquals(true, quickFindUF.connected(3, 6));
        Assert.assertEquals(false, quickFindUF.connected(5, 9));
        System.out.println(quickFindUF);

        System.out.println("Duration (ms): " + ((System.currentTimeMillis() - start)));
        Utils.consoleNewLine();
    }
}
