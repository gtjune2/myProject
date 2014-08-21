package annotation.component;

import gss.Spring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = (Parent)Spring.getBean("component.xml", "parent");
		parent.setName("홍길동");
		System.out.println("parent.getName()"+parent.getName());
		
		Neighbor neighbor = Spring.context.getBean("neighbor", Neighbor.class);
		neighbor.setName("이순신");
		System.out.println("neighbor.getName()"+ neighbor.getName());
		
		Product product = (Product)Spring.getBean("component.xml", "productBean");
		product.setName("우유");
		System.out.println(product.getName());
	}

}
