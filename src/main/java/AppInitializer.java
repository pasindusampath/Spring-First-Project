import lk.ijse.gdse.test.dto.Computer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer.getBrandName());

    }

}
