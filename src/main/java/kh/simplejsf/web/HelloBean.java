package kh.simplejsf.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Simple JSF ManagedBean.
 * 
 * @author Kevin Hooke
 */
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

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
