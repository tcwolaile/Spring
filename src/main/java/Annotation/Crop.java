package Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("Crop")
public class Crop {
    @Value("李四")
    private String corpName;
    @Resource(name = "staff")
    List<Employee> staff;

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getCorpName() {
        return corpName;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "corpName='" + corpName + '\'' +
                ", staff=" + staff +
                '}';
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }
}
