package org.tain.bean;

public class SampleBean {

	private String name;
	private int age;
	private SampleBean innerBean;
	
	/////////////////////////////////////////////
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SampleBean getInnerBean() {
		return innerBean;
	}
	public void setInnerBean(SampleBean innerBean) {
		this.innerBean = innerBean;
	}
	
	/////////////////////////////////////////////
	
	public String toString() {
		return
				"Outer name: " + this.name + "\n" +
				"Outer age: " + this.age + "\n" +
				"Inner name: " + this.innerBean.getName() + "\n" +
				"Inner age: " + this.innerBean.getAge() + "\n"
				;
	}
}
