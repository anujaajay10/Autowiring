package ustbatchno3.Com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Application.xml");
        Notificationservices n=context.getBean(Notificationservices.class);
        n.notifyservice();
    }
        
}
