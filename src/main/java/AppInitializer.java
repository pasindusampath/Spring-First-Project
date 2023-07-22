import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        System.out.println("Started...");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Course fullstack = context.getBean("fullstack", Course.class);
        ((FullStackCourse)fullstack).id=10;
        Course fullstack1 = context.getBean("fullstack", Course.class);
        Course fullstack2= context.getBean("fullstack", Course.class);
        Course fullstack3 = context.getBean("fullstack", Course.class);
        Course fullstack4 = context.getBean("fullstack", Course.class);
        System.out.println(fullstack.getName());
        System.out.println(fullstack.getPrice());
        System.out.println(((FullStackCourse)fullstack4).id);
        System.out.println(fullstack4.getPrice());
    }
}
