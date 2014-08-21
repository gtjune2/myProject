package annotation.resource;

import gss.Spring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBean resourceBean = (ResourceBean)Spring.getBean("resource.xml", "resourceBean");
		
		System.out.println(resourceBean.getHeros());
		System.out.println(resourceBean.getPeople());
	}

}
