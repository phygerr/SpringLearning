package test;

/**
 * test
 *
 * @author phyger
 * @project SpringLearning
 * @package demo2
 * @create 2018-11-28 14:24
 **/
public class test {
    private String name;
    private Double price;

    public test(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}