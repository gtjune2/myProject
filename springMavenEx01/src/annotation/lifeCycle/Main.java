package annotation.lifeCycle;

import gss.Spring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeCycleBean lifeCycleBean = (LifeCycleBean)Spring.getBeanConf("lifeCycle.xml", "lifeCycleBean");
		System.out.println(lifeCycleBean.getName());
	}

}
