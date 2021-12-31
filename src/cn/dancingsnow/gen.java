package cn.dancingsnow;

import java.util.ArrayList;
import java.util.Random;

public class gen {

    private final int seed;

    public final Random random;

    public gen(int seed) {
        this.seed = seed;
        this.random = new Random(this.seed);
    }
    public int next() {
        return random.nextInt(7);
    }

    public ArrayList<Integer> generateCode() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(next());
        array.add(next());
        array.add(next());
        array.add(next());
        return array;
    }

}
