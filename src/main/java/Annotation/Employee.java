package Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("Employee")
public class Employee {

    @Value("李四")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setWorNumber(int worNumber) {
        this.worNumber = worNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", worNumber=" + worNumber +
                '}';
    }

    public int getWorNumber() {
        return worNumber;
    }
    @Value("1234567")
    private int worNumber;
}
