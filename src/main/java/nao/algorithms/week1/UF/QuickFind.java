package nao.algorithms.week1.UF;

import nao.algorithms.common.Utils;

import java.util.Arrays;

public class QuickFind {

    private int[] values;

    public QuickFind(int n) {

        values = new int[n];
        Utils.fillArray(n, values);
    }

    public void union(int p, int q) {
        int pid = values[p];
        int qid = values[q];

        for (int i = 0; i < values.length; i++) {
            if(values[i] == pid) {
                values[i] = qid;
            }
        }
    }

    public boolean connected(int p, int q) {
        return (values[p] == values[q]);
    }

    @Override
    public String toString() {
        return "QuickFind { " +
                "values=" + Arrays.toString(values) +
                " }";
    }
}
