package demo3;

/**
 * Car类，使用构造方法方式进行属性注入
 *
 * @author phyger
 * @project SpringLearning
 * @package demo3
 * @create 2018-11-28 14:35
 **/
public class Car {
    private String name;
    private Double price;

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
