package kh.simplejsf.web;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {

	private String name;

	public HelloBean()
	{
		
	}
	
	public String sayHello()
	{
		return "hello";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
