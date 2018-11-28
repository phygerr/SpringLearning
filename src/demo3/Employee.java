package demo3;

/**
 * 员工类，含有对象属性
 *
 * @author phyger
 * @project SpringLearning
 * @package demo3
 * @create 2018-11-28 15:00
 **/
public class Employee {
    private String name;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
