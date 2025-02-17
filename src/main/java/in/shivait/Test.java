package in.shivait;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("raga.xml");
		Atm a=ctxt.getBean(Atm.class);
		a.start();
		
		

	}

}
