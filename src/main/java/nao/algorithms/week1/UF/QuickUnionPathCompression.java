package nao.algorithms.week1.UF;

import nao.algorithms.common.Utils;

import java.util.Arrays;

public class QuickUnionPathCompression {

    private int[] values;

    public QuickUnionPathCompression(int n) {

        values = new int[n];
        Utils.fillArray(n, values);
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);

        values[pid] = qid;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        while(i != values[i]) {
            values[i] = values[values[i]];
            i = values[i];
        }

        return i;
    }

    @Override
    public String toString() {
        return "QuickUnionPathCompression { " +
                "values=" + Arrays.toString(values) +
                " }";
    }
}
