package hu.pallas;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Prog {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		One szoveg=(One)factory.getBean("onebean");
		szoveg.displayInfo();
		
		System.out.println();
		
		Two szam=(Two)factory.getBean("twobean");
		szam.displayInfo();
	}

}
