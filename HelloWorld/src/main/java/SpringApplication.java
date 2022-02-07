import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.HelloWorld;

public class SpringApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config/HelloWorldConfig.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
