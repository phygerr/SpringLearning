package demo3;

/**
 * set方法方式进行属性注入
 *
 * @author phyger
 * @project SpringLearning
 * @package demo3
 * @create 2018-11-28 14:49
 **/
public class Car2 {
    private String name;
    private String city;

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
