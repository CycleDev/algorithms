package nao.algorithms.week1.UF;

import nao.algorithms.common.Utils;

import java.util.Arrays;

public class QuickUnionWeightedPathCompression {

    private int[] values;
    private int[] rootSizes;

    public QuickUnionWeightedPathCompression(int n) {

        values = new int[n];
        rootSizes = new int[n];
        Arrays.fill(rootSizes, 0);
        Utils.fillArray(n, values);
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);

        if(pid == qid) {
            return;
        }

        if(rootSizes[pid] < rootSizes[qid]) {
            values[pid] = qid;
            rootSizes[qid] += rootSizes[pid];
        } else {
            values[qid] = pid;
            rootSizes[pid] += rootSizes[qid];
        }
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
        return "QuickUnionWeightedPathCompression { " +
                "values=" + Arrays.toString(values) +
                " }";
    }
}
