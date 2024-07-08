package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	String configLocation = "/in/sp/resources/applicationContext.xml";
       ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
       
       Student std = (Student) context.getBean(Student.class);
       std.dis();
    }
}
