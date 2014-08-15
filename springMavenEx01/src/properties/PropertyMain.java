package properties;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Connection.xml");
		BasicDataSource basicdatasource = (BasicDataSource)context.getBean("datasource");
		System.out.println("password : "+basicdatasource.getPassword());
		System.out.println("username : "+basicdatasource.getUsername());
		System.out.println("url : "+basicdatasource.getUrl());
	}

}
