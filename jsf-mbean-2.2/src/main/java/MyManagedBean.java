package main.java;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "firstBean")
@ViewScoped
public class MyManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Hello, world";
	}
	
}
