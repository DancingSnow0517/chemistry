package cn.dancingsnow;

import java.util.*;

public class Main {

    public static int seed;

    public static HashMap<String, String>[] cachedAlchemyData = new HashMap[7];

    static String[] substrates = new String[6];

    static String[] map = new String[7];

    public static void main(String[] args) {
        substrates[0] = "火成催化剂";
        substrates[1] = "草本催化剂";
        substrates[2] = "不稳定催化剂";
        substrates[3] = "晶化催化剂";
        substrates[4] = "金属催化剂";
        substrates[5] = "宝石催化剂";

        map[0] = "0: 安山岩\n1: 闪长岩\n2: 花岗岩\n3: 圆石\n4: 玄武岩\n5: 辉长岩";
        map[1] = "0: 绯红\n1: 橙色\n2: 黄色\n3: 绿色\n4: 蓝色\n5: 品红色";
        map[2] = "0: 烈焰\n1: 史莱姆\n2: 下界\n3: 黑曜石\n4: 火药\n5: 海晶";
        map[3] = "0: 神秘\n1: 磷灰石\n2: 硫磺\n3: 硝石\n4: 赛特斯石英\n5: 下届石英";
        map[4] = "0: 锌\n1: 铜\n2: 铁\n3: 镍\n4: 铅\n5: 金";
        map[5] = "0: 朱砂\n1: 青金石\n2: 蓝宝石\n3: 绿宝石\n4: 红宝石\n5: 钻石";
        map[6] = "0: 火成催化剂\n1: 草本催化剂\n2: 不稳定催化剂\n3: 晶化催化剂\n4: 金属催化剂\n5: 宝石催化剂";

        System.out.print("Seed: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNext()) {
            seed = input.nextInt();
        }
        input.close();

        gen g = new gen(seed);

        for (int cat = 0; cat < 7; cat++) {
            cachedAlchemyData[cat] = new HashMap<>();
            cachedAlchemyData[cat].put("code", g.generateCode().toString());
            cachedAlchemyData[cat].put("result", cat == 6 ? "混沌催化剂" : substrates[cat]);
        }
        //System.out.println(Arrays.toString(cachedAlchemyData));
        int cat=0;
        for (HashMap<String, String> i : cachedAlchemyData) {
            System.out.println(i);
            System.out.println(map[cat]);
            System.out.println("===========================");
            cat++;
        }
    }
}
