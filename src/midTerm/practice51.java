package midTerm;

import java.util.HashSet;
import java.util.Set;

public class practice51 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("春");
        set1.add("眠");
        set1.add("不");
        set1.add("覺");
        set1.add("曉");
        set1.add("處");
        set1.add("處");
        set1.add("聞");
        set1.add("啼");
        set1.add("鳥");
        set1.add("夜");
        set1.add("來");
        set1.add("風");
        set1.add("雨");
        set1.add("聲");
        set1.add("花");
        set1.add("落");
        set1.add("知");
        set1.add("多");
        set1.add("少");
        set2.add("紅");
        set2.add("豆");
        set2.add("生");
        set2.add("南");
        set2.add("國");
        set2.add("春");
        set2.add("來");
        set2.add("發");
        set2.add("幾");
        set2.add("枝");
        set2.add("願");
        set2.add("君");
        set2.add("多");
        set2.add("采");
        set2.add("擷");
        set2.add("此");
        set2.add("物");
        set2.add("最");
        set2.add("相");
        set2.add("思");
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
