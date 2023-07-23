import lk.ijse.gdse.test.dto.Computer;
import lk.ijse.gdse.test.config.BeanConfig;
import lk.ijse.gdse.test.dto.impl.ComputerImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Computer computer = (Computer) context.getBean("computerImpl");
        System.out.println(computer.getBrandName());
        System.out.println(computer.getProcessor().getProcessorName());*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Computer computer = context.getBean("computerImpl", ComputerImpl.class);
        System.out.println(computer.getProcessor().getProcessorName());
    }

}
