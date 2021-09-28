package XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("Employee_2"));
        System.out.println(applicationContext.getBean("Crop"));
    }
}
