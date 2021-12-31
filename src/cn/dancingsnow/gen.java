package cn.dancingsnow;

import java.util.ArrayList;
import java.util.Random;

public class gen {

    private final long seed;

    public final Random random;

    public gen(long seed) {
        this.seed = seed;
        this.random = new Random(this.seed);
    }
    public int next() {
        return random.nextInt(6);
    }

    public ArrayList<Integer> generateCode() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(next());
        array.add(next());
        array.add(next());
        array.add(next());
        return array;
    }

    public Integer[] shuffle() {
        Integer[] ret = new Integer[6];
        ret[0] = 0;
        ret[1] = 1;
        ret[2] = 2;
        ret[3] = 3;
        ret[4] = 4;
        ret[5] = 5;
        for (int i = ret.length-1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = ret[i];
            ret[i] = ret[j];
            ret[j] = temp;
        }
        return ret;
    }

}
