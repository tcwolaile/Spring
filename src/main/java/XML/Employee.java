package XML;

public class Employee {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setWorNumber(int worNumber) {
        this.worNumber = worNumber;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", worNumber=" + worNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getWorNumber() {
        return worNumber;
    }

    private int worNumber;
}
