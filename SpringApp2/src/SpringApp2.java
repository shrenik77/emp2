import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringApp2 {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("SpringConfig.xml");
		BeanFactory beanf = new XmlBeanFactory(resource);
		
		Company c1 = (Company)beanf.getBean("comp1");
		System.out.println(c1);
		
		DynamicRecord r = (DynamicRecord)beanf.getBean("rec1");
		System.out.println(r);
	}

}
