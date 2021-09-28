package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("Annotation.xml");
        System.out.println(applicationContext.getBean("Employee"));
        System.out.println(applicationContext.getBean("Crop"));
    }
}
