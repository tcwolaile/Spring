package XML;



import java.util.List;

public class Crop {
    private String corpName;
    private List<Employee> staff;

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "corpName='" + corpName + '\'' +
                ", staff=" + staff +
                '}';
    }

    public Crop() {
    }

    public String getCorpName() {
        return corpName;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }
}