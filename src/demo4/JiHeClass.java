package demo4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 集合类型的属性注入
 *
 * @author phyger
 * @project SpringLearning
 * @package demo4
 * @create 2018-11-29 20:16
 **/
public class JiHeClass {
    private String[] arrs;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "JiHeClass{" +
                "arrs=" + Arrays.toString(arrs) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
